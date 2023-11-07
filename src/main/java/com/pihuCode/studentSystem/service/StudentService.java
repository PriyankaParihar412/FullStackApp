package com.pihuCode.studentSystem.service;

import com.pihuCode.studentSystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
