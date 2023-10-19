package com.techelevator.movies.dao;

import com.techelevator.movies.model.Collection;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcCollectionDao implements CollectionDao{

    private final JdbcTemplate jdbcTemplate;

    public JdbcCollectionDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);

    }

    public Collection mapToCollection(SqlRowSet result ) {
        Collection coll = new Collection();
        coll.setId(result.getInt("collection_id"));
        coll.setName(result.getString("collection_name"));

        return coll;

    }

    public Collection mapToCollectionName(SqlRowSet result ) {
        Collection coll = new Collection();
        coll.setName(result.getString("collection_name"));

        return coll;

    }

    public Collection mapToCollectionToId(SqlRowSet result ) {
        Collection coll = new Collection();
        coll.setId(result.getInt("collection_id"));

        return coll;
    }

    @Override
    public List<Collection> getCollections() {
        List<Collection> collections = new ArrayList<>();
        String sql = "SELECT collection_id, collection_name FROM collection;";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql);

        while (result.next()) {
            Collection collection = mapToCollection(result);
            collections.add(collection);
        }

        return collections;

    }

    @Override
    public Collection getCollectionById(int id) {
        Collection collection = new Collection();
        String sql = "SELECT collection_id, collection_name FROM collection WHERE collection_id = ?;";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, id);

        if (result.next()) {
            collection = mapToCollection(result);
            return collection;
        } else {
            return null;
        }


    }

    @Override
    public List<Collection> getCollectionsByName(String name, boolean useWildCard) {
        List<Collection> collections = new ArrayList<>();
        String sql = "SELECT collection_name FROM collection WHERE collection_name ILIKE ?;";

        if (useWildCard) {
            name = "%" + name + "%";
        }

        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, name);


        while (result.next()) {
            Collection collection = mapToCollectionName(result);
            collections.add(collection);

        }
      return collections;
    }


}
