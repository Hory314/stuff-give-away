package pl.hordyjewicz.stuffgiveaway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.hordyjewicz.stuffgiveaway.entity.Institution;

public interface InstitutionRepository extends JpaRepository<Institution, Long>
{
}
