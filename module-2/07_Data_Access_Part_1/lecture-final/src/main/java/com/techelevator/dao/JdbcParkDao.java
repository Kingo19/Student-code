package com.techelevator.dao;

import com.techelevator.model.Park;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JdbcParkDao implements ParkDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcParkDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int getParkCount() {
        int parkCount = 0;

        String sql = "SELECT COUNT(*) AS park_count FROM park";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);          //executes the query

        if (results.next()) {
            return results.getInt("park_count");
        }

        return parkCount;
    }
    
    @Override
    public LocalDate getOldestParkDate() {

        LocalDate dateEstablished = null;

        //write the sql
        String sql = "SELECT MIN(date_established) AS date_established FROM park";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql);

        if (result.next()) {
            dateEstablished = result.getDate("date_established").toLocalDate();
        }

        return dateEstablished;
    }
    
    @Override
    public double getAverageParkArea() {
        return 0.0;
    }
    
    @Override
    public List<String> getParkNames() {

        List<String> parkNames = new ArrayList<>();

        String sql = "SELECT park_name FROM park ORDER BY park_name ASC";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        //since we can return more than one record, use a while loop
        while (results.next()) {
            String parkName = results.getString("park_name");
            parkNames.add(parkName);
        }


        return parkNames;
    }
    
    @Override
    public Park getRandomPark() {

        Park park = null;

        String sql = "SELECT park_id, park_name, date_established, area, has_camping" +
                     " FROM park ORDER BY RANDOM() LIMIT 1";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        if (results.next()) {
            park = mapRowToPark(results);
        }

        return park;
    }

    @Override
    public List<Park> getParksWithCamping() {

        List<Park> parks = new ArrayList<>();

        String sql = "SELECT park_id, park_name, date_established, area, has_camping " +
                "FROM park " +
                "WHERE has_camping = true;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        while(results.next()) {
            Park park = mapRowToPark(results);
            parks.add(park);
        }

        return parks;
    }

    @Override
    public Park getParkById(int parkId) {

        Park park = null;

        String sql = "SELECT park_id, park_name, date_established, area, has_camping " +
                "FROM park " +
                "WHERE park_id = ?";

        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, parkId);


        if (result.next()) {
            park = mapRowToPark(result);
        }

        return park;
    }

    @Override
    public List<Park> getParksByState(String stateAbbreviation) {
        List<Park> parks = new ArrayList<>();
        String sql = "SELECT p.park_id, park_name, date_established, area, has_camping " +
                "FROM park p " +
                "JOIN park_state ps ON p.park_id = ps.park_id " +
                "WHERE state_abbreviation = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, stateAbbreviation);
        while (results.next()) {
            parks.add(mapRowToPark(results));
        }
        return parks;
    }

    @Override
    public List<Park> getParksByName(String name, boolean useWildCard) {
        List<Park> parks = new ArrayList<>();

        String sql = "SELECT p.park_id, park_name, date_established, area, has_camping " +
                "FROM park p " +
                "WHERE p.park_name ILIKE ?";

        if (useWildCard)
        {
            name = "%" + name + "%";
        }

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, name);
        while (results.next()) {
            parks.add(mapRowToPark(results));
        }
        return parks;
    }

    //This method takes all the data out of the rowset and populates a new Park object
    private Park mapRowToPark(SqlRowSet rowSet) {
         Park park = new Park();

         //take values out of rowSet and place inside the park object
        //SELECT park_id, park_name, date_established, area, has_camping
        park.setParkId(rowSet.getInt("park_id"));
        park.setParkName(rowSet.getString("park_name"));
        park.setDateEstablished(rowSet.getDate("date_established").toLocalDate());
        park.setArea(rowSet.getDouble("area"));
        park.setHasCamping(rowSet.getBoolean("has_camping"));

         return park;
    }
}
