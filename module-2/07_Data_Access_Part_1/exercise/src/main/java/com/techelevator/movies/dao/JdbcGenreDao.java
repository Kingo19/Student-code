package com.techelevator.movies.dao;

import com.techelevator.movies.model.Collection;
import com.techelevator.movies.model.Genre;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcGenreDao implements GenreDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcGenreDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Genre mapToGenre(SqlRowSet result ) {
        Genre gen = new Genre();
        gen.setId(result.getInt("genre_id"));
        gen.setName(result.getString("genre_name"));

        return gen;

    }

    public Genre mapToGenreName(SqlRowSet result ) {
        Genre gen = new Genre();
        gen.setName(result.getString("genre_name"));

        return gen;

    }

    public Genre mapToGenreToId(SqlRowSet result ) {
        Genre gen = new Genre();
        gen.setId(result.getInt("genre_id"));

        return gen;
    }

    @Override
    public List<Genre> getGenres() {
        List<Genre> genres = new ArrayList<>();
        String sql = "SELECT genre_id, genre_name FROM genre;";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql);

        while (result.next()) {
            Genre genre = mapToGenre(result);
            genres.add(genre);
        }

        return genres;
    }

    @Override
    public Genre getGenreById(int id) {
        Genre genre = new Genre();
        String sql = "SELECT genre_id, genre_name FROM genre WHERE genre_id = ?;";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, id);

        if (result.next()) {
            genre = mapToGenre(result);
            return genre;
        } else {
            return null;
        }


//        return new Genre(-1, "Not implemented yet");
  }

    @Override
    public List<Genre> getGenresByName(String name, boolean useWildCard) {
        List<Genre> genres = new ArrayList<>();
        String sql = "SELECT genre_name FROM genre WHERE genre_name ";

        if (useWildCard) {
            sql = sql + " LIKE ? ";
            name = "%" + name + "%";
        } else {
            sql = sql + " =  ? ";
        }

        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, name);

        while (result.next()) {
            Genre genre = mapToGenreName(result);
            genres.add(genre);

        }
        return genres;

    }
}
