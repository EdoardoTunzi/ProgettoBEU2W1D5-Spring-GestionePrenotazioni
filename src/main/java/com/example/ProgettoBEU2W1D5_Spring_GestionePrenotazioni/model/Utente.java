package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
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

    public Utente(String username, String nomeCompleto, String email) {
        this.username = username;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
    }

    public void aggiungiPrenotazione(Prenotazione prenotazione) {
        List<LocalDate> datePrenot = new ArrayList<>();
        listaPrenotazioni.forEach(ele -> datePrenot.add(ele.getDataPrenotazione()));
        if (!datePrenot.contains(prenotazione.getDataPrenotazione())) {
            if (prenotazione.getPostazione().isDisponibile()) {
                listaPrenotazioni.add(prenotazione);
            } else {
                System.out.println("La postazione scelta non è disponibile");
            }
        } else {
            System.out.println("non puoi prenotare altre postazioni in questa data, perchè hai gia una prenotazione per questo giorno.");
        }
    }
}
