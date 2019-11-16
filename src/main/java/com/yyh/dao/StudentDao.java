package com.yyh.dao;

import com.yyh.po.Student;

import java.util.List;

public interface StudentDao {
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