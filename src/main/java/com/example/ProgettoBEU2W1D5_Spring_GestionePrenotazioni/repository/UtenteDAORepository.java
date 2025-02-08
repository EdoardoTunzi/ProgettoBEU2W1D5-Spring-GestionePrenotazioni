package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.repository;

import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteDAORepository extends JpaRepository<Utente, Long> {
}
