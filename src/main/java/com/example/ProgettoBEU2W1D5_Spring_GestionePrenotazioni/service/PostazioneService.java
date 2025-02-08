package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.service;

import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Edificio;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Postazione;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.TipoPostazione;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.repository.PostazioneDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostazioneService {

    @Autowired
    PostazioneDAORepository postazioneDAO;

    @Autowired
    @Qualifier("postazione1")
    ObjectProvider<Postazione> postazione1Provider;
    @Autowired
    @Qualifier("postazione2")
    ObjectProvider<Postazione> postazione2Provider;
    @Autowired
    @Qualifier("postazione3")
    ObjectProvider<Postazione> postazione3Provider;

    public Postazione createPostazione1() {
        return postazione1Provider.getObject();
    }

    public Postazione createPostazione2() {
        return postazione2Provider.getObject();
    }

    public Postazione createPostazione3() {
        return postazione3Provider.getObject();
    }

    //metodi DAO
    public void savePostazione(Postazione p) {
        postazioneDAO.save(p);
        System.out.println("Postazione "+ p.getDescrizione()+ " aggiunta nel DB!");
    }

    public Postazione findPostazioneById(Long id) {
        return postazioneDAO.findById(id).get();
    }

    // metodo per eventualmente dare la possibilità a un utente di rendere non disponibile/disponibile una postazione(magari per lavori o altro)
    public void toggleDisponibilitaPostazione(Postazione p) {
        p.setDisponibile(!p.isDisponibile());
        postazioneDAO.save(p);
        System.out.println("La disponibilità della postazione " + p.getDescrizione() + " è stata cambiata in: " + p.isDisponibile());
    }

    //metodo per ricercare le postazioni indicando il tipo di postazione desiderato e la città di interesse.
    @Transactional(readOnly = true)
    public void searchByTipoECitta(TipoPostazione tipo, String citta) {
        List<Postazione> lista = postazioneDAO.findPostazioneByTipoAndCitta(tipo, citta);
        if (!lista.isEmpty()) {
            System.out.println("Postazioni trovate nella città: " + citta + " di tipo: " + tipo);
            lista.forEach(System.out::println);
        } else {
            System.out.println("Nessuna Postazione di tipo: "+ tipo +" trovato nella città " + citta);
        }
    }

}
