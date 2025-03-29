package com.sandalliyasarcan.controller.impl;

import com.sandalliyasarcan.controller.IStudentController;
import com.sandalliyasarcan.entities.Student;
import com.sandalliyasarcan.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController {

    @Autowired
    private IStudentService studentService;


    //DTO kullanilir ama ben suan bilmedigimden oturu DTO kullanamayacagim , ogrenince kullanirim umarim :)
    @PostMapping(path = "/save")
    @Override
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
}
