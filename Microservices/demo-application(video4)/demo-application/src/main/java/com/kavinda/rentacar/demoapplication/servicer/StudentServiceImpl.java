package com.kavinda.rentacar.demoapplication.servicer;

import com.kavinda.rentacar.demoapplication.model.Student;
import com.kavinda.rentacar.demoapplication.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements  StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public Student fetchStudentById(int id){
        Optional<Student> student= studentRepository.findById( id);
        if(student.isPresent()){
            return student.get();
        }
        return  null;
    }
}
