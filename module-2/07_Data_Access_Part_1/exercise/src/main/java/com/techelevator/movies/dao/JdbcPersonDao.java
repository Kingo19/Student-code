package com.techelevator.movies.dao;

import com.techelevator.movies.model.Genre;
import com.techelevator.movies.model.Movie;
import com.techelevator.movies.model.Person;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcPersonDao implements PersonDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcPersonDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Person mapToPerson(SqlRowSet result ) {
        Person per = new Person();

        per.setId(result.getInt("person_id"));
        per.setName(result.getString("person_name"));
        per.setBiography(result.getString("biography"));
        per.setBirthday(result.getDate("birthday").toLocalDate());
        per.setDeathDate(result.getDate("deathday").toLocalDate());
        per.setHomePage(result.getString("home_page"));
        per.setProfilePath(result.getString("profile_path"));

        return per;

    }

    public Person mapToPersonByName(SqlRowSet result ) {
        Person per = new Person();

        per.setName(result.getString("person_name"));

        return per;
    }

    @Override
    public List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();

        String sql = "SELECT person_id, person_name, birthday, deathday, biography, profile_path, home_page FROM person;";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql);

        while (result.next()) {
            Person person = new Person();
            persons.add(person);
        }

        return persons;
    }

    @Override
    public Person getPersonById(int id) {
        Person person = new Person();

        String sql = "SELECT person_id, person_name, birthday, deathday, biography, profile_path, home_page FROM person WHERE person_id = ?;";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, id);

        if (result.next()) {
            person = mapToPerson(result);
            return person;
        } else {
            return null;
        }
//        return new Person(-1, "Not implemented yet", null, null, "", "", "");
    }

    @Override
    public List<Person> getPersonsByName(String name, boolean useWildCard) {
        List<Person> persons = new ArrayList<>();
        String sql = "SELECT person_name FROM person WHERE person_name ";

        if (useWildCard) {
            sql = sql + " LIKE ? ";
            name = "%" + name + "%";
        } else {
            sql = sql + " =  ? ";
        }

        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, name);

        while (result.next()) {
            Person person = mapToPersonByName(result);
            persons.add(person);

        }
        return persons;
    }

    @Override
    public List<Person> getPersonsByCollectionName(String collectionName, boolean useWildCard) {
        String sql = "SELECT DISTINCT p.* FROM person p " +
                "JOIN collection c ON p.person_id = c.collection_id " +
                "WHERE c.collection_name ILIKE ?; ";
        if (useWildCard) {
            collectionName = "%" + collectionName + "%";
        }

        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, collectionName);
        return jdbcTemplate.query(sql, new PersonRowMapper(), collectionName);
    }
    private static class PersonRowMapper implements RowMapper<Person> {
        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Person(
                    rs.getInt("person_id"),
                    rs.getString("person_name"),
                    rs.getDate("birthday").toLocalDate(),
                    rs.getDate("deathday") != null ? rs.getDate("deathday").toLocalDate() : null,
                    rs.getString("biography"),
                    rs.getString("profile_path"),
                    rs.getString("home_page")
            );
        }
    }

    }
