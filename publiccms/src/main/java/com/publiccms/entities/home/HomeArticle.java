package com.publiccms.entities.home;
// Generated 2016-11-12 18:33:49 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sanluan.common.generator.annotation.GeneratorColumn;

/**
 * HomeArticle generated by hbm2java
 */
@Entity
@Table(name = "home_article")
public class HomeArticle implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private Long id;
    @GeneratorColumn(title = "站点", condition = true)
    @JsonIgnore
    private int siteId;
    @GeneratorColumn(title = "目录", condition = true)
    private Long directoryId;
    @GeneratorColumn(title = "标题")
    private String title;
    @GeneratorColumn(title = "用户", condition = true)
    private long userId;
    @GeneratorColumn(title = "封面")
    private String cover;
    @GeneratorColumn(title = "分数", order = true)
    private int scores;
    @GeneratorColumn(title = "评论数", order = true)
    private int comments;
    @GeneratorColumn(title = "点击数", order = true)
    private int clicks;
    @GeneratorColumn(title = "已禁用", condition = true)
    private boolean disabled;
    @GeneratorColumn(title = "创建日期", order = true)
    private Date createDate;

    public HomeArticle() {
    }

    public HomeArticle(int siteId, String title, long userId, int scores, int comments, int clicks, boolean disabled,
            Date createDate) {
        this.siteId = siteId;
        this.title = title;
        this.userId = userId;
        this.scores = scores;
        this.comments = comments;
        this.clicks = clicks;
        this.disabled = disabled;
        this.createDate = createDate;
    }

    public HomeArticle(int siteId, Long directoryId, String title, long userId, String cover, int scores, int comments,
            int clicks, boolean disabled, Date createDate) {
        this.siteId = siteId;
        this.directoryId = directoryId;
        this.title = title;
        this.userId = userId;
        this.cover = cover;
        this.scores = scores;
        this.comments = comments;
        this.clicks = clicks;
        this.disabled = disabled;
        this.createDate = createDate;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "site_id", nullable = false)
    public int getSiteId() {
        return this.siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    @Column(name = "directory_id")
    public Long getDirectoryId() {
        return this.directoryId;
    }

    public void setDirectoryId(Long directoryId) {
        this.directoryId = directoryId;
    }

    @Column(name = "title", nullable = false)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Column(name = "cover")
    public String getCover() {
        return this.cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Column(name = "scores", nullable = false)
    public int getScores() {
        return this.scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    @Column(name = "comments", nullable = false)
    public int getComments() {
        return this.comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    @Column(name = "clicks", nullable = false)
    public int getClicks() {
        return this.clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    @Column(name = "disabled", nullable = false)
    public boolean isDisabled() {
        return this.disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false, length = 19)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
