package ls.lesm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ls.lesm.model.Salary;
@Repository
public interface SalaryRepository extends JpaRepository<Salary, Integer> {

}
