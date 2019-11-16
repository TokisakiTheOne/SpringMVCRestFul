package com.yyh.handler;

import com.sun.org.glassfish.gmbal.ParameterNames;
import com.yyh.po.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author YanYuHang
 * @create 2019-11-10-9:18
 */
@Controller
public class RestFulHandler {

    /**
     * 1.  web.xml中 设置filter过滤器    HiddenHttpMethodFilter
     * 2.  网页中  form表单 中 设置隐藏域   name="_method" value="DELETE/PUT...."
     * 3.  跳转网页jsp 报错问题解决
     * 3.1  可以把Tomcat改为7.0及一下
     * 3.2  在跳转到的页面
     * <%@ page contentType="text/html;charset=UTF-8" language="java"  %>
     *      isErrorPage="true" 设置为true
     *
     * @PathVariable 用来获取请求url中的动态参数，所以这个注解这只能获取把参数放到
     *      url中的get提交方式
     *       ps:(如果当前需要传id参数时   可是使用这个注解)
     *       findById      这两个方法可以使用@PathVariable编写
     *       delete
     *
     *
     * @return
     */

    @RequestMapping(value = "/testGet/{id}/{name}", method = RequestMethod.GET)
    public String testGet(@PathVariable String id,@PathVariable String name) {
        System.out.println("测试get请求"+id);
        return "test";
    }

    @RequestMapping(value = "/testPost", method = RequestMethod.POST)
    public String testPost(@PathVariable String id,Student stu) {
        System.out.println("测试post请求");
        System.out.println(stu.getId()+"   "+stu.getName());
        return "test";
    }

    @RequestMapping(value = "/testDelete", method = RequestMethod.DELETE)
    public String testDelete() {
        System.out.println("测试delete请求");
        return "test";
    }

    @RequestMapping(value = "/testPut", method = RequestMethod.PUT)
    public String testPut() {
        System.out.println("测试put请求");
        return "test";
    }


}
