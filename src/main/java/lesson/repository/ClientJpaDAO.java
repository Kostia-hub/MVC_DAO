package lesson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import lesson.domain.Client;

public interface ClientJpaDAO extends JpaRepository<Client, Long> {
}
