package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.repository;

import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Prenotazione;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneDAORepository extends JpaRepository<Prenotazione, Long> {
    //query JPQL custom per trovare prenotazioni fatte da un utente in una data
    @Query("SELECT pr FROM Prenotazione pr JOIN pr.utente u WHERE pr.dataPrenotazione = :data AND u = :utente")
    public Prenotazione getPrenotazioneByData(LocalDate data, Utente utente);

    //query derivata per cercare prenotazioni precedenti a una data
    public List<Prenotazione> findByDataPrenotazioneLessThan(LocalDate localDate);
}
