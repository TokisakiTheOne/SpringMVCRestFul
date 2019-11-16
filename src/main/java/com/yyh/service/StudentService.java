package com.yyh.service;

import com.yyh.po.Student;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2019-11-16-10:01
 */
public interface StudentService {
    /**
     * 查询全部
     *
     * @return
     */
    List<Student> selectAll();

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    Student selectById(int id);

    /**
     * 增加
     *
     * @param stu
     * @return
     */
    int insert(Student stu);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    int delete(int id);

    /**
     * 修改
     *
     * @param stu
     * @return
     */
    int update(Student stu);
}
