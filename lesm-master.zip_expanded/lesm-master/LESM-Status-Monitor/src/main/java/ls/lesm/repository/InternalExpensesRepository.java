package ls.lesm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ls.lesm.model.InternalExpenses;
@Repository
public interface InternalExpensesRepository extends JpaRepository<InternalExpenses, Integer> {

}
