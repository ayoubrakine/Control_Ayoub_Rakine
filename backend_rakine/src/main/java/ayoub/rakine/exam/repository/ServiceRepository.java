package ayoub.rakine.exam.repository;

import ayoub.rakine.exam.entities.Servicee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Servicee, Long> {

}
