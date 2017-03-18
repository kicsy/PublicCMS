package com.publiccms.logic.service.home;

// Generated 2016-11-19 9:58:46 by com.sanluan.common.source.SourceGenerator


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.publiccms.entities.home.HomeComment;
import com.publiccms.logic.dao.home.HomeCommentDao;
import com.sanluan.common.base.BaseService;
import com.sanluan.common.handler.PageHandler;

@Service
@Transactional
public class HomeCommentService extends BaseService<HomeComment> {

    @Transactional(readOnly = true)
    public PageHandler getPage(Integer siteId, Long userId, 
                String itemType, Long itemId, Boolean disabled, 
                String orderType, Integer pageIndex, Integer pageSize) {
        return dao.getPage(siteId, userId, 
                itemType, itemId, disabled, 
                orderType, pageIndex, pageSize);
    }
    
    @Autowired
    private HomeCommentDao dao;
}