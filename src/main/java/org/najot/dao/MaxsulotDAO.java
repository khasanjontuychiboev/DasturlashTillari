package org.najot.dao;

import org.najot.model.Maxsulot;

import java.util.List;

public interface MaxsulotDAO {
    Maxsulot getMaxsulotById(Integer id);
    List<Maxsulot> getMaxsulotList();
    void addMaxsulot(Maxsulot maxsulot);
    void updatedMaxsulot(Integer id,Maxsulot maxsulot);
    void deleteMaxsulot(Integer id);
}
