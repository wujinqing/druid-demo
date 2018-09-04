package com.jin.druid.demo.service.impl;

import com.jin.druid.demo.bean.Student;
import com.jin.druid.demo.repository.StudentRepository;
import com.jin.druid.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wu.jinqing
 * @date 2018年09月04日
 */
@Component
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }
}
