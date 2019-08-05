package com.cxg.gtd.controller;import java.util.List;import javax.servlet.http.HttpServletRequest;import javax.servlet.http.HttpServletResponse;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RestController;import com.cxg.gtd.entity.CollectionThings;import com.cxg.gtd.entity.User;import com.cxg.gtd.service.CollectionsService;import io.swagger.annotations.ApiOperation;@RestController@RequestMapping("/gtd")public class Index {    @Autowired    CollectionsService collectionService ;    private static Logger logger = LoggerFactory.getLogger(CollectionThings.class);    /**     * 初始页面     * @param user     * @param request     * @param response     * @return     * @throws Exception     */    @RequestMapping("/index")    public String  index(User user, HttpServletRequest request,                         HttpServletResponse response ) throws Exception{    	logger.info("跳转至首页");        response.sendRedirect(request.getContextPath() + "/index.html");        return null;    }    /**     * 当前登录人的待办任务列表     * @return     */    @ApiOperation("首页收件箱列表")    @GetMapping("/cList")    public List<CollectionThings> getCollectionThings(){        User user = new User();        user.setUserId("cxg");        logger.info("查询列表");        return collectionService.getCollectionThings(user);    }}