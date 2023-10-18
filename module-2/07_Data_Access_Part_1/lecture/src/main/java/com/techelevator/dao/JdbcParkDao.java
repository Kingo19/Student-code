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
//        sqlRowSet results = jdbcTemplate.queryForRowSet(sql);
//
//        if (results.next()) {
//            return results.getInt()
//        }
        return 0;
    }
    
    @Override
    public LocalDate getOldestParkDate() {

        LocalDate dateEstablished = null;

//        // write the sql
//        String sql = "SELECT MIN(date_established) AS date_established FROM park";
//        sqlRowSet result = jdbcTemplate.queryForRowSet(sql);
//
//        if (result.next()) {
//            dateEstablished = result.getDate("dateEstablished").toLocateDate;
//        }

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

//        sqlRowSet results = jdbcTemplate.queryForRowSet(sql);
//
////        since we can return more than one record, use a while loop.
//        while (results.next()) {
//            String parkName = results.getStrings("park_name");
//            String parkNames = results.getString("park_name");
//        }
        return new ArrayList<>();
    }
    
    @Override
    public Park getRandomPark() {
        return new Park();
    }

    @Override
    public List<Park> getParksWithCamping() {
        return new ArrayList<>();
    }

    @Override
    public Park getParkById(int parkId) {
        return new Park();
    }

    @Override
    public List<Park> getParksByState(String stateAbbreviation) {
        return new ArrayList<>();
    }

    @Override
    public List<Park> getParksByName(String name, boolean useWildCard) { return new ArrayList<>(); }

    private Park mapRowToPark(SqlRowSet rowSet) {
        return new Park();
    }
}
