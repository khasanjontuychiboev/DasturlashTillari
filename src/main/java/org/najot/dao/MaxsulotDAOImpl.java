package org.najot.dao;

import org.najot.mapper.MaxsulotRowMapper;
import org.najot.model.Maxsulot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class MaxsulotDAOImpl implements MaxsulotDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    @Transactional
    public Maxsulot getMaxsulotById(Integer id) {
        Maxsulot maxsulot = (Maxsulot) jdbcTemplate.queryForObject("select * from maxsulot where id = ?",
                new Object[] {id}, new MaxsulotRowMapper());
        return maxsulot;
    }

    @Override
    @Transactional
    public List<Maxsulot> getMaxsulotList() {
        List<Maxsulot> maxsulotlar = (List<Maxsulot>) jdbcTemplate.query("select * from maxsulot",
                 new MaxsulotRowMapper());
        return maxsulotlar;
    }

    @Override
    @Transactional
    public void addMaxsulot(Maxsulot maxsulot) {
        jdbcTemplate.update("insert into maxsulot(nomi, narxi) values (?,?)",maxsulot.getNomi(), maxsulot.getNarxi());
    }

    @Override
    @Transactional
    public void updatedMaxsulot(Integer id,Maxsulot maxsulot) {
        jdbcTemplate.update("update maxsulot set nomi=?, narxi=? where id=?",maxsulot.getNomi(), maxsulot.getNarxi(), id);

    }

    @Override
    @Transactional
    public void deleteMaxsulot(Integer id) {
        jdbcTemplate.update("delete from maxsulot where id=?",id);
    }
}
