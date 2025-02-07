package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "postazione_id")
    private Postazione postazione;
    private LocalDate dataPrenotazione;
    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;

    public Prenotazione(Postazione postazione, LocalDate dataPrenotazione, Utente utente) {
        this.postazione = postazione;
        this.dataPrenotazione = dataPrenotazione;
        this.utente = utente;
    }
}
