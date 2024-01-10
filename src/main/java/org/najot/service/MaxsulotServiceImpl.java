package org.najot.service;

import org.najot.dao.MaxsulotDAO;
import org.najot.model.ImageUpload;
import org.najot.model.Maxsulot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Service
public class MaxsulotServiceImpl implements MaxsulotService{
    @Autowired
    private MaxsulotDAO maxsulotDAO;
    @Override
    public Maxsulot getMaxsulotById(Integer id) {
        return maxsulotDAO.getMaxsulotById(id);
    }

    @Override
    public List<Maxsulot> getMaxsulotList() {
        return maxsulotDAO.getMaxsulotList();
    }

    @Override
    public void addMaxsulot(Maxsulot maxsulot) {
        maxsulotDAO.addMaxsulot(maxsulot);
    }

    @Override
    public void updatedMaxsulot(Integer id,Maxsulot maxsulot) {
        maxsulotDAO.updatedMaxsulot(id, maxsulot);
    }

    @Override
    public void deleteMaxsulot(Integer id) {
        maxsulotDAO.deleteMaxsulot(id);
    }

    @Override
    public ImageUpload uploadImage(MultipartFile file) {
        ImageUpload imageUpload = new ImageUpload(null, new StringBuilder());

        String UPLOAD_FOLDER = "/image";
        if (file != null) {
            try {
                if (!Files.exists(Paths.get(UPLOAD_FOLDER))) {
                    try {
                        Files.createDirectories(Paths.get(UPLOAD_FOLDER));
                    } catch (IOException e) {
                        imageUpload.setMessage(imageUpload.getMessage().append(e.getMessage()));
                        return imageUpload;

                    }
                }

                Files.copy(file.getInputStream(), Paths.get(UPLOAD_FOLDER, file.getOriginalFilename()));
                imageUpload.setImageName(file.getOriginalFilename());
            }catch (IOException | RuntimeException e){
                imageUpload.setMessage(imageUpload.getMessage().append(e.getMessage()));
                return imageUpload;
            }

        }else {
            imageUpload.setMessage(imageUpload.getMessage().append("So'rovda rasm mavjud emas"));
        }

        return imageUpload;
    }
}
