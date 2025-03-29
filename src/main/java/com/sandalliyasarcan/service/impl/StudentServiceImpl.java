package com.sandalliyasarcan.service.impl;

import com.sandalliyasarcan.entities.Student;
import com.sandalliyasarcan.repository.StudentRepository;
import com.sandalliyasarcan.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
