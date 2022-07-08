package ls.lesm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ls.lesm.model.EmployeeType;
@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {

	EmployeeType findByTypes(String types);

	//EmployeeType findByTypes(String types);

}
