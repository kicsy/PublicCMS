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
 * HomeBroadcast generated by hbm2java
 */
@Entity
@Table(name = "home_broadcast")
public class HomeBroadcast implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private Long id;
    @GeneratorColumn(title = "站点", condition = true)
    @JsonIgnore
    private int siteId;
    @GeneratorColumn(title = "用户", condition = true)
    private long userId;
    @GeneratorColumn(title = "分数", order = true)
    private int scores;
    @GeneratorColumn(title = "转发数", order = true)
    private int reposts;
    @GeneratorColumn(title = "评论", order = true)
    private int comments;
    @GeneratorColumn(title = "内容", order = true)
    private String message;
    @GeneratorColumn(title = "转发", condition = true)
    private boolean reposted;
    @GeneratorColumn(title = "转发ID", condition = true)
    private long repostId;
    @GeneratorColumn(title = "创建日期", order = true)
    private Date createDate;
    @GeneratorColumn(title = "已禁用", condition = true)
    private boolean disabled;

    public HomeBroadcast() {
    }

    public HomeBroadcast(int siteId, long userId, int scores, int reposts, int comments, String message, Date createDate,
            boolean disabled) {
        this.siteId = siteId;
        this.userId = userId;
        this.scores = scores;
        this.reposts = reposts;
        this.comments = comments;
        this.message = message;
        this.createDate = createDate;
        this.disabled = disabled;
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

    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Column(name = "scores", nullable = false)
    public int getScores() {
        return this.scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    @Column(name = "reposts", nullable = false)
    public int getReposts() {
        return this.reposts;
    }

    public void setReposts(int reposts) {
        this.reposts = reposts;
    }

    @Column(name = "comments", nullable = false)
    public int getComments() {
        return this.comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    @Column(name = "message", nullable = false, length = 300)
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Column(name = "reposted", nullable = false)
    public boolean isReposted() {
        return this.reposted;
    }

    public void setReposted(boolean reposted) {
        this.reposted = reposted;
    }

    @Column(name = "repost_id", nullable = false)
    public long getRepostId() {
        return this.repostId;
    }

    public void setRepostId(long repostId) {
        this.repostId = repostId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false, length = 19)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "disabled", nullable = false)
    public boolean isDisabled() {
        return this.disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

}
