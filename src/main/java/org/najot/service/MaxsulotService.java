package org.najot.service;

import org.najot.model.ImageUpload;
import org.najot.model.Maxsulot;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface MaxsulotService {
    Maxsulot getMaxsulotById(Integer id);
    List<Maxsulot> getMaxsulotList();
    void addMaxsulot(Maxsulot maxsulot);
    void updatedMaxsulot(Integer id, Maxsulot maxsulot);
    void deleteMaxsulot(Integer id);
    ImageUpload uploadImage(MultipartFile file);
}
