package com.jk.service;

import com.jk.model.Loginfo;

import java.util.List;

public interface LoginfoService {
    List<Loginfo> queryLog();

    void addLog(Loginfo loginfo);

    void delLog(String ids);
}
