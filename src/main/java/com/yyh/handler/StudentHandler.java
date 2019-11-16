package com.yyh.handler;

import com.yyh.po.Student;
import com.yyh.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @author YanYuHang
 * @create 2019-11-16-10:03
 */
@Controller
@RequestMapping("/stu")
public class StudentHandler {


    @Resource
    StudentService ss;

    /**
     * 查询全部
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    public String selectAll(Model model) {
        model.addAttribute("stus", ss.selectAll());
        return "index";
    }

    /**
     * 根据id查询
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/selectOne/{id}", method = RequestMethod.GET)
    public String selectOne(@PathVariable int id, Model model) {
        model.addAttribute("stu", ss.selectById(id));
        return "update";
    }

    @RequestMapping("/toInsert")
    public String toInsert(){
        return "insert";
    }
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(Student stu){
        ss.insert(stu);
        return "redirect:/stu/selectAll";
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public String update(Student stu){
        ss.update(stu);
        return "redirect:/stu/selectAll";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable int id){
        ss.delete(id);
        return "redirect:/stu/selectAll";
    }









}
