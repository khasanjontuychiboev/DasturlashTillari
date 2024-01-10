package org.najot.mapper;

import org.najot.model.Maxsulot;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MaxsulotRowMapper implements RowMapper<Maxsulot> {
    @Override
    public Maxsulot mapRow(ResultSet rs, int rowNum) throws SQLException {
        Maxsulot maxsulot = new Maxsulot();
        maxsulot.setId(rs.getInt("id"));
        maxsulot.setNomi(rs.getString("nomi"));
        maxsulot.setNarxi(rs.getDouble("narxi"));

        return maxsulot;
    }
}
