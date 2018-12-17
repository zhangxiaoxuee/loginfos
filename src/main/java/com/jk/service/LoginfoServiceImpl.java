package com.jk.service;

import com.jk.mapper.LoginfoMapper;
import com.jk.model.Loginfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginfoServiceImpl implements LoginfoService {
    @Autowired
    private LoginfoMapper loginfoMapper;

    @Override
    public List<Loginfo> queryLog() {
        List<Loginfo> list = loginfoMapper.queryLog();
        return list;
    }

    @Override
    public void addLog(Loginfo loginfo) {
        loginfoMapper.addLog(loginfo);
    }

    @Override
    public void delLog(String ids) {
        loginfoMapper.delLog(ids);
    }
}
