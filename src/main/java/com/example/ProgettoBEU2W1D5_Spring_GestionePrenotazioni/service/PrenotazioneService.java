package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.service;

import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Postazione;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Prenotazione;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Utente;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.repository.PrenotazioneDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PrenotazioneService {

    @Autowired
    PrenotazioneDAORepository prenotazioneDAO;

    @Autowired
    @Qualifier("prenotazioneCustom")
    ObjectProvider<Prenotazione> prenotazioneCustomProvider;

    public Prenotazione createPrenotazione(Postazione postazione, LocalDate dataPrenotazione, Utente utente) {
        Prenotazione p = prenotazioneCustomProvider.getObject();
        p.setPostazione(postazione);
        p.setDataPrenotazione(dataPrenotazione);
        p.setUtente(utente);
        return p;
    }

    //metodi DAO
    public void savePrenotazione(Prenotazione p) {
        prenotazioneDAO.save(p);
    }
}
