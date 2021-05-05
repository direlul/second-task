package ru.saburov.SecondTask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.saburov.SecondTask.domain.Student;
import ru.saburov.SecondTask.repository.GroupRepository;
import ru.saburov.SecondTask.repository.StudentRepository;

@Controller
public class StudentController {
    private final StudentRepository studentRepository;
    private final GroupRepository groupRepository;

    public StudentController(StudentRepository studentRepository, GroupRepository groupRepository) {
        this.studentRepository = studentRepository;
        this.groupRepository = groupRepository;
    }

    @GetMapping("/")
    public String main(Student student, Model model) {
        model.addAttribute("students", studentRepository.findAll());
        model.addAttribute("groups", groupRepository.findAll());
        return "students";
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute("student") Student student) {
        studentRepository.save(student);

        return "redirect:/";
    }

    @PostMapping("/delete")
    public String deleteStudent(@RequestParam(value = "id") Long id) {
        studentRepository.delete(studentRepository.findById(id).get());
        return "redirect:/";
    }
}
