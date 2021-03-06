package com.thinkcoo.mobile.model.entity.serverresponse;

import java.util.List;

/**
 * Created by Leevin
 * CreateTime: ${date} ${time}
 */
public class LoginResponse {

    /**
     * cert : 10005;1464244159290;5538b55586dc16716a9c5bfa62672895
     * name : 杨乐
     * userId : 10005
     * portraitURL : personal/headportrait/20160510171105606.jpg
     * modules : [{"apiUrl":"http://117.34.109.231/yingzi-mobile/schedule/","symbol":"yingzi-schedule-mobile","name":"课程表接口","id":23},{"apiUrl":"http://117.34.109.231/yingzi-mobile/calendar/","symbol":"yingzi-calendar-mobile","name":"勤务表接口","id":24},{"apiUrl":"http://117.34.109.231/yingzi-mobile/personal/","symbol":"yingzi-personal-mobile","name":"自信接口","id":25},{"apiUrl":"http://117.34.109.231/yingzi-mobile/trade/","symbol":"yingzi-trade-mobile","name":"自贸区接口","id":26},{"apiUrl":"http://117.34.109.231/yingzi-mobile/chat/","symbol":"yingzi-chat-mobile","name":"快信接口","id":27},{"apiUrl":"http://117.34.109.231/yingzi-mobile/hr/","symbol":"yingzi-hr-mobile","name":"求职接口","id":28},{"apiUrl":"http://117.34.109.231/yingzi-mobile/cooperation/","symbol":"yingzi-cooperation-mobile","name":"技术合作","id":29},{"apiUrl":"http://117.34.109.231/yingzi-mobile/train/","symbol":"yingzi-train-mobile","name":"培训招生","id":30},{"apiUrl":"http://117.34.109.231/yingzi-mobile/share/","symbol":"yingzi-share-mobile","name":"公共资源","id":32},{"apiUrl":"http://117.34.109.231/yingzi-file-common/","symbol":"yingzi-file-common","name":"文件上传","id":33}]
     * type : -1
     */

    private String cert;//认证信息
    private String name;
    private String userId;
    private String portraitURL;
    private int type;//当前身份
    /**
     * apiUrl : http://117.34.109.231/yingzi-mobile/schedule/
     * symbol : yingzi-schedule-mobile
     * name : 课程表接口
     * id : 23
     */

    private List<ModulesBean> modules;

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPortraitURL() {
        return portraitURL;
    }

    public void setPortraitURL(String portraitURL) {
        this.portraitURL = portraitURL;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<ModulesBean> getModules() {
        return modules;
    }

    public void setModules(List<ModulesBean> modules) {
        this.modules = modules;
    }

    public static class ModulesBean {
        private String apiUrl;//节点URL
        private String symbol;//模块key
        private String name;//模块名称
        private int id;//节点ID

        public String getApiUrl() {
            return apiUrl;
        }

        public void setApiUrl(String apiUrl) {
            this.apiUrl = apiUrl;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
