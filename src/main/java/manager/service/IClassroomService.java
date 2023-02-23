package manager.service;

import manager.model.Classroom;
import manager.service.my_interface.ICrud;
import manager.service.my_interface.ISearch;

public interface IClassroomService extends ICrud<Classroom>, ISearch<Classroom> {
}
