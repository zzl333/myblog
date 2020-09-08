package com.zxl.blog.db.pojo;

//用户信息表
public class UserDetail {
    private String account;     //账号
    private Integer actived;    //是否激活
    private String name;        //称呼
    private String head;         //头像
    private String phone;       //电话
    private String email;       //emial
    private String createTime;  //创建时间
    private String motto;       //个性签名
    private String readMusic;   //观看音乐
    private Integer articleSummary; //发表文章总数

    public Integer getArticleSummary() {
        return articleSummary;
    }

    public void setArticleSummary(Integer articleSummary) {
        this.articleSummary = articleSummary;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Integer getActived() {
        return actived;
    }

    public void setActived(Integer actived) {
        this.actived = actived;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getReadMusic() {
        return readMusic;
    }

    public void setReadMusic(String readMusic) {
        this.readMusic = readMusic;
    }

}
