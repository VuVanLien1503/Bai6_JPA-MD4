package manager.service.my_impl;

import manager.model.Classroom;
import manager.repository.IClassroomRepository;
import manager.service.IClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService implements IClassroomService {

    @Autowired
    IClassroomRepository classroomRepository;

    @Override
    public List<Classroom> findAll() {
        return (List<Classroom>) classroomRepository.findAll();
    }

    @Override
    public void save(Classroom classroom) {
        classroomRepository.save(classroom);
    }

    @Override
    public void delete(Classroom classroom) {
        classroomRepository.delete(classroom);
    }

    @Override
    public Classroom findById(Long id) {
        return classroomRepository.findById(id).orElse(null);
    }

    @Override
    public List<Classroom> findByName(String name) {
        return classroomRepository.findClassroomByName(name);
    }
}
