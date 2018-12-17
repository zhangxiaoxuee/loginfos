package com.jk.model;

public class Loginfo {
    //尽量不要使用int作为id  正式环境中id 统一使用uuid
    private Integer logId;
    private String logType;
    private String logDesc;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getLogDesc() {
        return logDesc;
    }

    public void setLogDesc(String logDesc) {
        this.logDesc = logDesc;
    }

}
