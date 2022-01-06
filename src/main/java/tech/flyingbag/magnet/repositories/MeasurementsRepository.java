package tech.flyingbag.magnet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.flyingbag.magnet.domain.Measurements;

@Repository
public interface MeasurementsRepository extends JpaRepository<Measurements, Long> {
}