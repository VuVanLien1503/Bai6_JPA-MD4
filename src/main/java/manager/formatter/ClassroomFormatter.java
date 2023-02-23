package manager.formatter;


import manager.model.Classroom;
import manager.service.my_impl.ClassroomService;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class ClassroomFormatter implements Formatter<Classroom> {
    private final ClassroomService classroomService;
    public ClassroomFormatter(ClassroomService classroomService) {
        this.classroomService=classroomService;
    }

    @Override
    public Classroom parse(String text, Locale locale) throws ParseException {
        return classroomService.findById(Long.parseLong(text));
    }

    @Override
    public String print(Classroom object, Locale locale) {
        return null;
    }
}
