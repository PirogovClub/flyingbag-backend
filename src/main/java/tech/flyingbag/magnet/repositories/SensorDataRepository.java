package tech.flyingbag.magnet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.flyingbag.magnet.domain.SensorsData;

@Repository
public interface SensorDataRepository extends JpaRepository<SensorsData, Long> {

}
