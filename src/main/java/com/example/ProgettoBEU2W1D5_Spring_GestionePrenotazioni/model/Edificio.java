package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "edifici")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String indirizzo;
    private String citta;
    @OneToMany(mappedBy = "edificio")
    private List<Postazione> listaPostazioni = new ArrayList<Postazione>();

    public Edificio(String nome, String indirizzo, String citta, List<Postazione> listaPostazioni) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.listaPostazioni = listaPostazioni;
    }
}
