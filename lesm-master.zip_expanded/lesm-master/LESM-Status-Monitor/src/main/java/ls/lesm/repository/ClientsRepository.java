package ls.lesm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ls.lesm.model.Clients;
@Repository
public interface ClientsRepository extends JpaRepository<Clients, Integer> {

	Clients findByClientsNames(String clientsNames);

}
