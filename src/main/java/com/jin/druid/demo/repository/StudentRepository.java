package com.jin.druid.demo.repository;

import com.jin.druid.demo.bean.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

/**
 * @author wu.jinqing
 * @date 2018年09月04日
 */
@Component
public interface StudentRepository extends CrudRepository<Student, Long> {

}
