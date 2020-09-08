package com.zxl.blog.db.entities;

import java.io.Serializable;
import java.util.Date;

public class ArticleInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_info.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_info.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_info.type_id
     *
     * @mbggenerated
     */
    private Integer typeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_info.art_content_id
     *
     * @mbggenerated
     */
    private Integer artContentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_info.art_title
     *
     * @mbggenerated
     */
    private String artTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_info.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_info.read_count
     *
     * @mbggenerated
     */
    private Integer readCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_info.like_count
     *
     * @mbggenerated
     */
    private Integer likeCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_info.down_count
     *
     * @mbggenerated
     */
    private Integer downCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table article_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_info.id
     *
     * @return the value of article_info.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_info.id
     *
     * @param id the value for article_info.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_info.user_id
     *
     * @return the value of article_info.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_info.user_id
     *
     * @param userId the value for article_info.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_info.type_id
     *
     * @return the value of article_info.type_id
     *
     * @mbggenerated
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_info.type_id
     *
     * @param typeId the value for article_info.type_id
     *
     * @mbggenerated
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_info.art_content_id
     *
     * @return the value of article_info.art_content_id
     *
     * @mbggenerated
     */
    public Integer getArtContentId() {
        return artContentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_info.art_content_id
     *
     * @param artContentId the value for article_info.art_content_id
     *
     * @mbggenerated
     */
    public void setArtContentId(Integer artContentId) {
        this.artContentId = artContentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_info.art_title
     *
     * @return the value of article_info.art_title
     *
     * @mbggenerated
     */
    public String getArtTitle() {
        return artTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_info.art_title
     *
     * @param artTitle the value for article_info.art_title
     *
     * @mbggenerated
     */
    public void setArtTitle(String artTitle) {
        this.artTitle = artTitle == null ? null : artTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_info.create_time
     *
     * @return the value of article_info.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_info.create_time
     *
     * @param createTime the value for article_info.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_info.read_count
     *
     * @return the value of article_info.read_count
     *
     * @mbggenerated
     */
    public Integer getReadCount() {
        return readCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_info.read_count
     *
     * @param readCount the value for article_info.read_count
     *
     * @mbggenerated
     */
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_info.like_count
     *
     * @return the value of article_info.like_count
     *
     * @mbggenerated
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_info.like_count
     *
     * @param likeCount the value for article_info.like_count
     *
     * @mbggenerated
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_info.down_count
     *
     * @return the value of article_info.down_count
     *
     * @mbggenerated
     */
    public Integer getDownCount() {
        return downCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_info.down_count
     *
     * @param downCount the value for article_info.down_count
     *
     * @mbggenerated
     */
    public void setDownCount(Integer downCount) {
        this.downCount = downCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_info
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", typeId=").append(typeId);
        sb.append(", artContentId=").append(artContentId);
        sb.append(", artTitle=").append(artTitle);
        sb.append(", createTime=").append(createTime);
        sb.append(", readCount=").append(readCount);
        sb.append(", likeCount=").append(likeCount);
        sb.append(", downCount=").append(downCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}