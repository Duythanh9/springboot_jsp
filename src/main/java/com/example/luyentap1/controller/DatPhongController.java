package com.example.luyentap1.controller;

import com.example.luyentap1.entity.DatPhong;
import com.example.luyentap1.entity.LoaiPhong;
import com.example.luyentap1.repository.DatPhongRepo;
import com.example.luyentap1.repository.LoaiPhongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("dat-phong")
public class DatPhongController {

    @Autowired
    private DatPhongRepo datPhongRepo;

    @Autowired
    private LoaiPhongRepo loaiPhongRepo;

    @ModelAttribute("dsLoaiPhong")
    public List<LoaiPhong> listLoaiPhongs(){
        return loaiPhongRepo.findAll();
    }

    @GetMapping("index")
    public String index(Model model){

        List<DatPhong> listDatPhongs = this.datPhongRepo.findAll();
        model.addAttribute("data",listDatPhongs);
        return "dat_phong/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        this.datPhongRepo.deleteById(id);
        return "redirect:/dat-phong/index";
    }
    @GetMapping("create")
    public String create(){
        return "dat_phong/create";
    }
    @PostMapping("store")
    public String store(DatPhong datPhong){

        this.datPhongRepo.save(datPhong);
        return "redirect:/dat-phong/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model){
        DatPhong datPhong = datPhongRepo.findById(id).orElse(null);
        model.addAttribute("detail",datPhong);
        return "dat_phong/edit";
    }
    @PostMapping("update/{id}")
    public String update(@PathVariable("id") Integer id, @ModelAttribute("detail") DatPhong datPhong){
        this.datPhongRepo.save(datPhong);
        return "redirect:/dat-phong/index";
    }
}
