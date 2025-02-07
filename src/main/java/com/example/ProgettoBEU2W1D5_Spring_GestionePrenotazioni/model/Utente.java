package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "utenti")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String nomeCompleto;
    private String email;
    @OneToMany(mappedBy = "utente")
    private List<Prenotazione> listaPrenotazioni = new ArrayList<Prenotazione>();

    public Utente(String username, String nomeCompleto, String email, List<Prenotazione> listaPrenotazioni) {
        this.username = username;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.listaPrenotazioni = listaPrenotazioni;
    }
}
