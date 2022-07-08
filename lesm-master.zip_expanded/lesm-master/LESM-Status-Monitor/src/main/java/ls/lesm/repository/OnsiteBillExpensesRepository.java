package ls.lesm.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ls.lesm.model.OnsiteBillExpenses;
@Repository
public interface OnsiteBillExpensesRepository extends JpaRepository<OnsiteBillExpenses, Integer> {

}
