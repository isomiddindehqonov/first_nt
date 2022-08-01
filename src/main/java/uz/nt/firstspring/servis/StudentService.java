package uz.nt.firstspring.servis;

import uz.nt.firstspring.dto.ResponseDto;
import uz.nt.firstspring.dto.StudentDto;

import java.util.ArrayList;

public interface StudentService {

    public ResponseDto addStudent(StudentDto studentDto);

    public ArrayList<StudentDto> getAllStudents();

    public ResponseDto updateStudent(StudentDto studentDto);

    public ResponseDto deleteStudent(Integer id);
}
