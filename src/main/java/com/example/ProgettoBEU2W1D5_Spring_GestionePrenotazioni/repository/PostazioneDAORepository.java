package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.repository;

import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Postazione;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PostazioneDAORepository extends JpaRepository<Postazione, Long> {
    //metodo per verifica disponibilità postazione
    @Query("SELECT p FROM Postazione p WHERE p.disponibile = true AND p.descrizione = :descrizione AND NOT EXISTS (" +
            "SELECT pr FROM Prenotazione pr WHERE pr.postazione = p AND pr.dataPrenotazione = :dataPrenotazione)")
    public Postazione getPostazioneDisponibile(String descrizione, LocalDate dataPrenotazione);

    //metodo per ricerca postazione per tipo e città
    @Query("SELECT p FROM Postazione p JOIN p.edificio e WHERE p.tipoPostazione = :tipo AND e.citta = :citta")
    public List<Postazione> findPostazioneByTipoAndCitta(TipoPostazione tipo, String citta);
}
