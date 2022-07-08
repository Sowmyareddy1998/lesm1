package ls.lesm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ls.lesm.model.OnsiteExpensesType;
@Repository
public interface OnsiteExpensesTypeRepository extends JpaRepository<OnsiteExpensesType, Integer> {

}
