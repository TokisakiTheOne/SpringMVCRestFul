package com.yyh.service;

import com.yyh.dao.StudentDao;
import com.yyh.po.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author YanYuHang
 * @create 2019-11-16-10:02
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentDao sd;

    public List<Student> selectAll() {
        return sd.selectAll();
    }

    public Student selectById(int id) {
        return sd.selectById(id);
    }

    public int insert(Student stu) {
        return sd.insert(stu);
    }

    public int delete(int id) {
        return sd.delete(id);
    }

    public int update(Student stu) {
        return sd.update(stu);
    }
}
