package manager.repository.model;


import manager.model.Classroom;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class ClassroomRepository {

    @PersistenceContext
    EntityManager entityManager;

    public List<Classroom> findAll() {
        TypedQuery<Classroom> strQuery = entityManager.createNamedQuery("findAll", Classroom.class);
        return strQuery.getResultList();
    }

    public Classroom findById(Long id) {
        return entityManager.find(Classroom.class, id);
    }

    public void save(Classroom classroom) {
        if (classroom.getId() == null) {
            entityManager.persist(classroom);
        } else {
            entityManager.merge(classroom);
        }
    }

    public void delete(Long id) {
        entityManager.remove(findById(id));
    }

    public List<Classroom> findByName(String name) {
        TypedQuery<Classroom> strQuery = entityManager.createNamedQuery("findName", Classroom.class);
        return strQuery.getResultList();
    }

}
