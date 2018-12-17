package com.jk.mapper;

import com.jk.model.Loginfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface LoginfoMapper {
    List<Loginfo> queryLog();

    void addLog(Loginfo loginfo);

    void delLog(String ids);
}
