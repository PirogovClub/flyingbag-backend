package tech.flyingbag.magnet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.flyingbag.magnet.domain.UserData;

@Repository
public interface UserRepository extends JpaRepository<UserData, Integer> {

}