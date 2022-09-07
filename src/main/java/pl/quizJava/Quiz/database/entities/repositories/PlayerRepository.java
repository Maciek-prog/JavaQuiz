package pl.quizJava.Quiz.database.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.quizJava.Quiz.database.entities.PlayerEntity;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
}
