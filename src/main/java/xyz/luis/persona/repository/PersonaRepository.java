package xyz.luis.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.luis.persona.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
