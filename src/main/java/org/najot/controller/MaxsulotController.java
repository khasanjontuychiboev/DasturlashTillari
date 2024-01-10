package org.najot.controller;

import org.najot.model.ImageUpload;
import org.najot.model.Maxsulot;
import org.najot.service.MaxsulotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MaxsulotController {
    @Autowired
    private MaxsulotService maxsulotService;

    @RequestMapping(value = "/maxsulot/{id}", method = RequestMethod.GET)
    public ModelAndView getMaxsulot(@PathVariable("id") Integer id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("maxsulot");
        mv.addObject("maxsulot",maxsulotService.getMaxsulotById(id));
        return mv;
    }

    @RequestMapping(value = "/maxsulotlar", method = RequestMethod.GET)
    public ModelAndView getMaxsulotList(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("maxsulotlar");
        mv.addObject("maxsulotlar",maxsulotService.getMaxsulotList());
        return mv;
    }

    @RequestMapping(value = "/maxsulot/addPage", method = RequestMethod.GET)
    public String addPage(){
        return "maxsulotAddPage";
    }

    @RequestMapping(value = "/maxsulot/add", method = RequestMethod.POST)
    public ModelAndView addMaxsulot(@RequestParam(value = "nomi", required = true) String nomi, @RequestParam(value = "narxi", required = true) Double narxi){
        ModelAndView mv = new ModelAndView();
        maxsulotService.addMaxsulot(new Maxsulot(nomi,narxi));
        mv.addObject("msg", "Muvaffaqiyatli saqlandi");
        mv.setViewName("maxsulotSaved");
        return mv;
    }

    @RequestMapping(value = "/maxsulot/update/{id}", method = RequestMethod.GET)
    public ModelAndView updateMaxsulot(@PathVariable("id") Integer id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("maxsulotUpdatePage");
        mv.addObject("maxsulot",maxsulotService.getMaxsulotById(id));
        return mv;
    }

    @RequestMapping(value = "/maxsulot/update", method = RequestMethod.POST)
    public String updateMaxsulot(@RequestParam(value = "id", required = true) Integer id, @RequestParam(value = "nomi", required = true) String nomi, @RequestParam(value = "narxi", required = true) Double narxi){
        Maxsulot maxsulot = new Maxsulot(id,nomi,narxi);
        maxsulotService.updatedMaxsulot(id,maxsulot);
        return "redirect:"+id;
    }

    @RequestMapping(value = "/maxsulot/delete-page/{id}", method = RequestMethod.GET)
    public ModelAndView deleteMaxsulot(@PathVariable("id") Integer id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("maxsulotDeletePage");
        mv.addObject("maxsulot",maxsulotService.getMaxsulotById(id));
        return mv;
    }

    @RequestMapping(value = "/maxsulot/delete/{id}")
    public String addMaxsulot(@PathVariable("id") Integer id){
        maxsulotService.deleteMaxsulot(id);

        return "redirect:maxsulotDeleted";
    }

    @RequestMapping(value = "/maxsulot/delete/maxsulotDeleted")
    public String maxsulotDeleted(){
        return "maxsulotDeleted";
    }


}
