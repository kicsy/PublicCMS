package com.publiccms.entities.sys;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;

// Generated 2016-1-19 11:28:06 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sanluan.common.generator.annotation.GeneratorColumn;

/**
 * SystemRoleUser generated by hbm2java
 */
@Entity
@Table(name = "sys_role_user")
public class SysRoleUser implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private SysRoleUserId id;

    public SysRoleUser() {
    }

    public SysRoleUser(SysRoleUserId id) {
        this.id = id;
    }

    @EmbeddedId

    @AttributeOverrides({ @AttributeOverride(name = "roleId", column = @Column(name = "role_id", nullable = false)),
            @AttributeOverride(name = "userId", column = @Column(name = "user_id", nullable = false)) })
    public SysRoleUserId getId() {
        return this.id;
    }

    public void setId(SysRoleUserId id) {
        this.id = id;
    }

}
