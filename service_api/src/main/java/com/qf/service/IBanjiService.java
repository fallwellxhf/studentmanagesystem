package com.qf.service;
import com.qf.entity.Banji;

import java.util.List;
public interface IBanjiService {
    List<Banji> queryAllBanJi();
    Banji queryBanji(Integer id);


}
