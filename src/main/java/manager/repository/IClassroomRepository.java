package manager.repository;

import manager.model.Classroom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface IClassroomRepository extends CrudRepository<Classroom,Long> {
    List<Classroom>findClassroomByName (String name);

}
