package ls.lesm.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ls.lesm.model.Departments;
@Repository
public interface DepartmentsRepository extends JpaRepository<Departments, Integer> {

	Departments findByDepart(String depart);

	Object findByDepartId(int departId);

}
