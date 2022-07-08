package ls.lesm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ls.lesm.model.EmployeesAtClientsDetails;
@Repository
public interface EmployeesAtClientsDetailsRepository extends JpaRepository<EmployeesAtClientsDetails, Integer> {

}
