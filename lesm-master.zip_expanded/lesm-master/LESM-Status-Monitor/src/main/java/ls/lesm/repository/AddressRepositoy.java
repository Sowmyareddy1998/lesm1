package ls.lesm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ls.lesm.model.Address;
@Repository
public interface AddressRepositoy extends JpaRepository<Address, Integer> {

}
