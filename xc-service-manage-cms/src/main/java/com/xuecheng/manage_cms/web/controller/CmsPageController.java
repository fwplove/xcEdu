package com.xuecheng.manage_cms.web.controller;

import com.xuecheng.api.CmsPageControllerApi;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.manage_cms.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cms/page")
public class CmsPageController implements CmsPageControllerApi {

    @Autowired
    PageService pageService;

    @Override
    @GetMapping("list/{page}/{size}")
    public QueryResponseResult findList(@PathVariable("page") int page, @PathVariable("size") int size, QueryPageRequest queryPageRequest) {
        ////测试数据
        //QueryResult result = new QueryResult();
        //result.setTotal(2);
        ////静态数据
        //ArrayList list = new ArrayList();
        //CmsPage cmsPage = new CmsPage();
        //cmsPage.setPageName("测试页面");
        //list.add(cmsPage);
        //result.setList(list);
        //QueryResponseResult queryResponseResult = new QueryResponseResult(CommonCode.SUCCESS, result);
        //return queryResponseResult;
        return pageService.findList(page, size, queryPageRequest);
    }

}
