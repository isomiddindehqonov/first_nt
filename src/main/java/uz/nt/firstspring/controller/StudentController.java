package uz.nt.firstspring.controller;
import org.springframework.web.bind.annotation.*;
import uz.nt.firstspring.dto.ResponseDto;
import uz.nt.firstspring.dto.StudentDto;
import uz.nt.firstspring.servis.impl.StudentServiceimpl;
import java.util.List;


@RestController
@RequestMapping("/Student")
public class StudentController {

    private final StudentServiceimpl studentServiceimpl;

    public StudentController(StudentServiceimpl studentServiceimpl) {
        this.studentServiceimpl = studentServiceimpl;

    }


    @PostMapping
    public ResponseDto addStudent(@RequestBody StudentDto studentDto) {
        return  studentServiceimpl.addStudent(studentDto);
    }

    @GetMapping
    public List<StudentDto> getStudent() {
        return  studentServiceimpl.getAllStudents();
    }
    // patch - put

    @PatchMapping
    public ResponseDto uptateStudent(@RequestParam StudentDto studentDto) {
        return studentServiceimpl.updateStudent(studentDto);

    }

    @DeleteMapping("/{id}")
    public ResponseDto deleteStudent(@PathVariable Integer id){

        return studentServiceimpl.deleteStudent(id);
    }
}

