package pl.hordyjewicz.stuffgiveaway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.hordyjewicz.stuffgiveaway.entity.Stuff;

public interface StuffRepository extends JpaRepository<Stuff, Long>
{
}
