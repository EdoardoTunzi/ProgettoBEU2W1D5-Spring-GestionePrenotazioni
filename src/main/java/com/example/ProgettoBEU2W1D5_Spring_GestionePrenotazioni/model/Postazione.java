package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "postazioni")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descrizione;
    @Enumerated(EnumType.STRING)
    private TipoPostazione tipoPostazione;
    private int numMaxOccupanti;
    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

    public Postazione(String descrizione, TipoPostazione tipoPostazione, int numMaxOccupanti, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.numMaxOccupanti = numMaxOccupanti;
        this.edificio = edificio;
    }
}
