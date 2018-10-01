package com.niepan.springbootai3.controller;

import com.niepan.springbootai3.bean.Medicine;
import com.niepan.springbootai3.mapper.MedicineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@Controller
public class MedicineController {

    @Autowired
    MedicineMapper medicineMapper;

//  来到药物列表  查询所有的药物       success
    @GetMapping("/medicines")
    public String getAllMedicine(Model model){
        List<Medicine> allMedic = medicineMapper.getAllMedic();
        model.addAttribute("medicines",allMedic);
//        System.out.println(allMedic.toString());
//        System.out.println("aaaaaaaaaaaa");
        return "medicine/list";
    }

//  来到添加药物页面                  success
    @GetMapping("/medicine")
    public String toAddPage(){
        return "medicine/add";
    }


//  添加药物                          error
//springMVC自动将请求参数和入参对象的属性进行一一绑定；要求请求参数的名字和Javabean入参的对象里面的属性名字一样
    @PostMapping("/medicine")
    public String addMedicine(Medicine medicine){
        //System.out.println("保存的员工信息"+medicine);
        // 重定向
        medicineMapper.insertMedic(medicine);
        return "redirect:/medicines";
    }


    //  来到修改页面 查出当前药物，在页面回显
    @GetMapping("/medicine/{id}")
    public String updateMedicine(@PathVariable("id") Integer id,Model model){
        Medicine byId = medicineMapper.getMedicineById(id);
        model.addAttribute("medic",byId);
        return "medicine/edit";
    }




//    删除药物
    @DeleteMapping("/medicine/{id}")
    public String deleteMedicine(@PathVariable("id") Integer id){
        medicineMapper.deleteMedicById(id);
        System.out.println(id);
        return "redirect:/medicines";
    }



}
