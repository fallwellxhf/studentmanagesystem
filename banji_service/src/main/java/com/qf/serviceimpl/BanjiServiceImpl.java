package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.BanJiMapper;
import com.qf.entity.Banji;
import com.qf.service.IBanjiService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class BanjiServiceImpl implements IBanjiService {
   @Autowired
   private BanJiMapper banJiMapper;


    @Override
    public List<Banji> queryAllBanJi() {
        return banJiMapper.selectList(null);
    }

    @Override
    public Banji queryBanji(Integer id) {
        return banJiMapper.selectById(id);
    }
}
