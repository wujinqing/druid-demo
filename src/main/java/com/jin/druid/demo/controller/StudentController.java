package com.jin.druid.demo.controller;

import com.jin.druid.demo.bean.Student;
import com.jin.druid.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wu.jinqing
 * @date 2018年09月04日
 */
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/student/save")
    public Student save(Student student)
    {
        studentService.save(student);

        return student;
    }
}
