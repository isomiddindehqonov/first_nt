package uz.nt.firstspring.servis.impl;
import org.springframework.stereotype.Service;
import uz.nt.firstspring.dto.ResponseDto;
import uz.nt.firstspring.dto.StudentDto;
import uz.nt.firstspring.servis.StudentService;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
@Service
public class StudentServiceimpl implements StudentService {

    public static ArrayList<StudentDto> students = new ArrayList<>();

    @Override
    public ResponseDto addStudent(StudentDto studentDto) {
        students.add(studentDto);
        return ResponseDto.builder()
                .code(0)
                .success(true)
                .massage("saved")
                .build();

    }

    @Override
    public ArrayList<StudentDto> getAllStudents() {
        return students;
    }

    @Override
    public ResponseDto updateStudent(StudentDto studentDto) {
        for (StudentDto s : students) {
            if (s.getId().equals(studentDto.getId()) && s.getAge() == 24) {
                if (studentDto.getName() == null) s.setName(studentDto.getName());
                if (studentDto.getAge() == null) s.setAge(studentDto.getAge());
                if (studentDto.getBirthDate() == null) s.setBirthDate(studentDto.getBirthDate());
                if (studentDto.getCourse() == null) s.setCourse(studentDto.getCourse());
                return ResponseDto.builder()
                        .code(0)
                        .success(true)
                        .massage("successfully uptade")
                        .build();
            }
        }

        return ResponseDto.builder()
                .code(-1)
                .success(false)
                .massage("Date not found")
                .build();

    }

    @Override
    public ResponseDto deleteStudent(Integer id) {
        CopyOnWriteArrayList<StudentDto> copyOnWriteArrayList = new CopyOnWriteArrayList<>(students);

        for (StudentDto student : copyOnWriteArrayList){
            if (student.getId().equals(id)){
                students.remove(student);

                return ResponseDto.builder()
                        .code(0)
                        .success(true)
                        .massage("successfully delete")
                        .build();
            }

        }

        return ResponseDto.builder()
                .code(-1)
                .success(false)
                .massage("data not found!")
                .build();
    }
}