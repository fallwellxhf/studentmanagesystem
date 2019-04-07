package com.qf.serviceImpl;
import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.StuMapper;
import com.qf.entity.Student;
import com.qf.service.IStuService;
import org.apache.zookeeper.data.Id;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class StuServiceImpl implements IStuService {
    @Autowired
    private StuMapper stuMapper;


    @Override
    public List<Student> queryAll() {
        return stuMapper.selectList(null);
    }

    @Override
    public Student queryone(Integer banjiId) {
        return stuMapper.selectById(banjiId);
    }
}
