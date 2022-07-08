package ls.lesm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ls.lesm.model.Designations;
@Repository
public interface DesignationsRepository extends JpaRepository<Designations, Integer> {

	Designations findByDesgNames(String desgNames);

	

}
