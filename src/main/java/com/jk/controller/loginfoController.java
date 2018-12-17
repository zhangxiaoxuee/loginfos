package com.jk.controller;

import com.jk.model.Loginfo;
import com.jk.service.LoginfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("loginfos")
public class loginfoController {

    @Autowired
    private LoginfoService loginfoService;

    @RequestMapping("toMain")
    public String toMain(){

        return "index";
    }

    @RequestMapping("queryLog")
    @ResponseBody
    public List<Loginfo> queryLog(){
        return  loginfoService.queryLog();
    }
    @RequestMapping("addLog")
    public void addLog(Loginfo loginfo){
      loginfoService.addLog(loginfo);
    }

    /**
     * 删除日志信息
     * @param
     * @param </pre>
     */
    @RequestMapping("delLog")
    public void delLog(String ids){

        loginfoService.delLog(ids);
    }
}
