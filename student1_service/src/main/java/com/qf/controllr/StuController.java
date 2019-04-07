package com.qf.controllr;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Banji;
import com.qf.entity.Student;
import com.qf.service.IBanjiService;
import com.qf.service.IStuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lookBanji")
public class StuController {
    @Reference
    private IBanjiService banjiService;
    @Reference
    private IStuService stuService;

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
