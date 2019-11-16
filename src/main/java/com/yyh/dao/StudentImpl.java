package com.yyh.dao;

import com.yyh.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author YanYuHang
 * @create 2019-11-16-9:39
 */
@Component
public class StudentImpl implements StudentDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public RowMapper<Student>rowMapper=new RowMapper<Student>() {
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student stu=new Student();
            stu.setId(rs.getInt(1));
            stu.setName(rs.getString(2));
            return stu;
        }
    } ;



    public List<Student> selectAll() {
        return jdbcTemplate.query("select * from student",rowMapper);
    }

    public Student selectById(int id) {
        return jdbcTemplate.queryForObject("select * from student where id=?",rowMapper,id);

    }

    public int insert(Student stu) {
        return jdbcTemplate.update("insert into student(`name`) values(?)",stu.getName());
    }

    public int delete(int id) {
        return jdbcTemplate.update("delete from student where id=?",id);
    }

    public int update(Student stu) {
        return jdbcTemplate.update("update student set `name`=? where id=?",stu.getName(),stu.getId());
    }
}
