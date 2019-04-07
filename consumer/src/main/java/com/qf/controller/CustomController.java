package com.qf.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Banji;
import com.qf.entity.Student;
import com.qf.service.IBanjiService;
import com.qf.service.IStuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class CustomController {
    @Reference
    private IStuService stuService;
    @Reference
    private IBanjiService banjiService;

    @RequestMapping("/stuList")
    public String list(ModelMap map){
        List<Student> students=stuService.queryAll();
        map.put("students",students);
        return "stulist";
    }
    @RequestMapping("/stuone")
    public String stuOne(Integer id,ModelMap map){
        Student students=stuService.queryone(id);
        map.put("students",students);
        return "stulist1";
    }


    @RequestMapping("/banjiList")
    public String banjilist(ModelMap map){
        List<Banji> banjis=banjiService.queryAllBanJi();
        map.put("banjis",banjis);
        return "banjilist";
    }

    @RequestMapping("/banjione")
    public String banjiOne(Integer id,ModelMap map){
        Banji banji=banjiService.queryBanji(id);
        map.put("banji",banji);
        return "banjilist1";
    }

    @RequestMapping("/selectbanji")
    public String lookBanji(Integer id, ModelMap map){
        Student student=stuService.queryone(id);
        Integer banjiId=student.getBanJiId();
        Banji banji=banjiService.queryBanji(banjiId);
        student.setBanjiName(banji.getBanJi());
        map.put("student",student);
        return "stulist2";
    }


}

