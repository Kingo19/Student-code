package com.techelevator.movies.dao;

import com.techelevator.movies.model.Genre;
import com.techelevator.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JdbcMovieDao implements MovieDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcMovieDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Movie mapToMovie(SqlRowSet result) {
        Movie mov = new Movie();
        mov.setId(result.getInt("movie_id"));
        mov.setTitle(result.getString("title"));
        mov.setCollectionId(result.getInt("collection_id"));
        mov.setDirectorId(result.getInt("director_id"));
        mov.setHomePage(result.getString("home_page"));
        mov.setLengthMinutes(result.getInt("length_minutes"));
        mov.setPosterPath(result.getString("poster_path"));
        mov.setReleaseDate(result.getDate("release_date").toLocalDate());
        mov.setTagline(result.getString("tagline"));
        mov.setHomePage(result.getString("overview"));

        return mov;

    }

    public Movie mapToMovieByTitle(SqlRowSet result) {
        Movie mov = new Movie();
        mov.setTitle(result.getString("title"));

        return mov;
    }

    @Override
    public List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();

        String sql = "SELECT movie_id, title, overview, tagline, poster_path, home_page, release_date, length_minutes, director_id, collection_id FROM movie;";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql);

        while (result.next()) {
            Movie movie = mapToMovie(result);
            movies.add(movie);
        }

        return movies;
    }

    @Override
    public Movie getMovieById(int id) {
        Movie movie = null;
        String sql = "SELECT movie_id, title, overview, tagline, poster_path, home_page, release_date, length_minutes, director_id, collection_id FROM movie WHERE movie_id = ?;";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, id);

        if (result.next()) {
            movie = mapToMovie(result);

        }
        return movie;
//        return new Movie(-1, "Not implemented yet", "", "", "", "", null, 0, -1, -1);
    }

    @Override
    public List<Movie> getMoviesByTitle(String title, boolean useWildCard) {
        List<Movie> movies = new ArrayList<>();
        String sql = "SELECT title FROM movie WHERE title ";

        if (useWildCard) {
            sql = sql + " LIKE ? ";
            title = "%" + title + "%";
        } else {
            sql = sql + " =  ? ";
        }

        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, title);

        while (result.next()) {
            Movie movie = mapToMovieByTitle(result);
            movies.add(movie);

        }
        return movies;
    }

    @Override
    public List<Movie> getMoviesByDirectorNameAndBetweenYears(String directorName, int startYear, int endYear, boolean useWildCard) {
        String sql;
        if (useWildCard) {
            directorName = "%" + directorName + "%";
            sql = "SELECT m.* FROM movie m " +
                    "JOIN person ON m.director_id = person.person_id " +
                    "WHERE person.person_name LIKE ? " +
                    "AND m.release_date BETWEEN ?::date AND ?::date";
        } else {
            sql = "SELECT m.* FROM movie m " +
                    "JOIN person ON m.director_id = person.person_id " +
                    "WHERE person.person_name = ? " +
                    "AND m.release_date BETWEEN ?::date AND ?::date";
        }
        return jdbcTemplate.query(sql, new MovieRowMapper(), directorName, LocalDate.of(startYear, 1, 1), LocalDate.of(endYear, 12, 31));
    }

    private static class MovieRowMapper implements RowMapper<Movie> {
        @Override
        public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Movie(
                    rs.getInt("movie_id"),
                    rs.getString("title"),
                    rs.getString("overview"),
                    rs.getString("tagline"),
                    rs.getString("poster_path"),
                    rs.getString("home_page"),
                    rs.getDate("release_date").toLocalDate(),
                    rs.getInt("length_minutes"),
                    rs.getInt("director_id"),
                    rs.getInt("collection_id")
            );
        }
    }
}
