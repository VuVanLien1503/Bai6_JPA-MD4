package manager.controller;

import manager.model.Classroom;
import manager.service.IClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "classrooms")
public class ClassroomController {

    @Autowired
    IClassroomService classroomService;
    @GetMapping
    public String findAll(Model model) {
        List<Classroom> classroomList = classroomService.findAll();
        model.addAttribute("classroomList", classroomList);
        return "/classroom/display";
    }
    @GetMapping(value = "/update/{id}")
    public String showUpdate(@PathVariable Long id, Model model){
        model.addAttribute("classroom",classroomService.findById(id));
        return"/classroom/update";
    }
    @PostMapping(value = "/update/{id}")
    public String update(@ModelAttribute Classroom classroom) {
        classroomService.save(classroom);
        return "redirect:/classrooms";
    }
    @GetMapping(value = "/delete/{id}")
    public String delete(@PathVariable Long id){
        Classroom classroom = classroomService.findById(id);
        classroomService.delete(classroom);
        return "redirect:/classrooms";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Classroom classroom) {
        classroomService.save(classroom);
        return "redirect:/classrooms";
    }
}
