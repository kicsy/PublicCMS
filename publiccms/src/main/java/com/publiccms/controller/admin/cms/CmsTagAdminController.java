package com.publiccms.controller.admin.cms;

import static com.sanluan.common.tools.RequestUtils.getIpAddress;
import static com.sanluan.common.tools.JsonUtils.getString;
import static org.apache.commons.lang3.StringUtils.join;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.publiccms.common.base.AbstractController;
import com.publiccms.entities.cms.CmsTag;
import com.publiccms.entities.log.LogOperate;
import com.publiccms.entities.sys.SysSite;
import com.publiccms.logic.service.cms.CmsContentTagService;
import com.publiccms.logic.service.cms.CmsTagService;
import com.publiccms.logic.service.log.LogLoginService;

/**
 * 
 * CmsTagController
 *
 */
@Controller
@RequestMapping("cmsTag")
public class CmsTagAdminController extends AbstractController {
    @Autowired
    private CmsTagService service;
    @Autowired
    private CmsContentTagService contentTagService;

    private String[] ignoreProperties = new String[] { "id", "siteId", "searchCount" };

    /**
     * @param entity
     * @param request
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("save")
    public String save(CmsTag entity, HttpServletRequest request, HttpSession session, ModelMap model) {
        SysSite site = getSite(request);
        if (null != entity.getId()) {
            CmsTag oldEntity = service.getEntity(entity.getId());
            if (null == oldEntity || verifyNotEquals("siteId", site.getId(), oldEntity.getSiteId(), model)) {
                return TEMPLATE_ERROR;
            }
            entity = service.update(entity.getId(), entity, ignoreProperties);
            if (null != entity) {
                logOperateService.save(new LogOperate(site.getId(), getAdminFromSession(session).getId(),
                        LogLoginService.CHANNEL_WEB_MANAGER, "update.tag", getIpAddress(request), getDate(), getString(entity)));
            }
        } else {
            entity.setSiteId(site.getId());
            service.save(entity);
            logOperateService.save(new LogOperate(site.getId(), getAdminFromSession(session).getId(),
                    LogLoginService.CHANNEL_WEB_MANAGER, "save.tag", getIpAddress(request), getDate(), getString(entity)));
        }
        return TEMPLATE_DONE;
    }

    /**
     * @param ids
     * @param request
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("delete")
    public String delete(Long[] ids, HttpServletRequest request, HttpSession session, ModelMap model) {
        if (notEmpty(ids)) {
            SysSite site = getSite(request);
            service.delete(site.getId(), ids);
            contentTagService.delete(ids, null);
            logOperateService.save(new LogOperate(site.getId(), getAdminFromSession(session).getId(),
                    LogLoginService.CHANNEL_WEB_MANAGER, "delete.tag", getIpAddress(request), getDate(), join(ids, ',')));
        }
        return TEMPLATE_DONE;
    }
}