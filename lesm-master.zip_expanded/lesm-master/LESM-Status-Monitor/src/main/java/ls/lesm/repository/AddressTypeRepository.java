package ls.lesm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ls.lesm.model.AddressType;
@Repository
public interface AddressTypeRepository extends JpaRepository<AddressType, Integer> {

}
