package pl.hordyjewicz.stuffgiveaway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.hordyjewicz.stuffgiveaway.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long>
{
}
