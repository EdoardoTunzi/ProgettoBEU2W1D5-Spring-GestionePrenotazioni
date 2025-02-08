package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.service;

import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Postazione;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Prenotazione;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Utente;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.repository.PostazioneDAORepository;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.repository.PrenotazioneDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PrenotazioneService {

    @Autowired
    PrenotazioneDAORepository prenotazioneDAO;
    @Autowired
    PostazioneDAORepository postazioneDAO;

    @Autowired
    @Qualifier("prenotazioneCustom")
    ObjectProvider<Prenotazione> prenotazioneCustomProvider;


    //metodo di creazione di una prenotazione, che prima di salvarla su DB
    //controlla la disponibilità della postazione
    //e che un utente non abbia gia una prenotazione nello stesso giorno
    public Prenotazione createPrenotazione(Postazione postazione, LocalDate dataPrenotazione, Utente utente) {
        Postazione postazioneDisponibile = postazioneDAO.getPostazioneDisponibile(postazione.getDescrizione(), dataPrenotazione);
        Prenotazione controlloPrenotazioneConStessaData = prenotazioneDAO.getPrenotazioneByData(dataPrenotazione, utente);

        if (postazioneDisponibile != null && controlloPrenotazioneConStessaData == null) {
            Prenotazione p = prenotazioneCustomProvider.getObject();
            p.setPostazione(postazioneDisponibile);
            p.setDataPrenotazione(dataPrenotazione);
            p.setUtente(utente);
            return p;
        } else {
            System.out.println("La postazione selezionata non è disponibile per la data richiesta, o l'utente ha gia una prenotazione nella stessa data");
            return null;
        }
    }

    //metodi DAO
    public void savePrenotazione(Prenotazione p) {
        //qui controllo che la prenotazione che voglio salvare non sia null, perchè il metodo createPrenotazione() potrebbe ritornare null
        if (p != null) {
            prenotazioneDAO.save(p);
            System.out.println("Prenotazione salvata su DB!");
        }
    }

    public void deletePrenotazione(Prenotazione p) {
        prenotazioneDAO.delete(p);
        System.out.println("Prenotazione eliminata da DB!");
    }

    //metodo extra per cancellare rapidamente da DB tutte le prenotazioni scadute, quindi precedenti alla data odierna
    public void deletePrenotazioniScadute() {
        List<Prenotazione> lista = prenotazioneDAO.findByDataPrenotazioneLessThan(LocalDate.now());
        lista.forEach(ele -> prenotazioneDAO.delete(ele));
        System.out.println("Eliminate dal DB tutte le prenotazione scadute, precedenti alla data di oggi: " + LocalDate.now());
    }
}
