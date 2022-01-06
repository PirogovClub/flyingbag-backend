package tech.flyingbag.magnet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.flyingbag.magnet.domain.PhoneData;


@Repository
public interface PhoneDataRepository extends JpaRepository<PhoneData, Long> {

}
