package Laboratorio_lex.repositories;

import Laboratorio_lex.models.HistorialAcceso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface HistorialAccesoRepository extends JpaRepository<HistorialAcceso, UUID> {
    List<HistorialAcceso> findAllByOrderByTimestampDesc();
}
