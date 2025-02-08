package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.repository;

import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioneDAORepository extends JpaRepository<Prenotazione, Long> {
}
