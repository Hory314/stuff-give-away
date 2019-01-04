package pl.hordyjewicz.stuffgiveaway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.hordyjewicz.stuffgiveaway.entity.GiveAway;

public interface GiveAwayRepository extends JpaRepository<GiveAway, Long>
{
}
