package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.service;

import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Utente;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.repository.UtenteDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UtenteService {
    @Autowired @Qualifier("utente1") ObjectProvider<Utente> utente1Provider;
    @Autowired @Qualifier("utente2") ObjectProvider<Utente> utente2Provider;
    @Autowired @Qualifier("utente3") ObjectProvider<Utente> utente3Provider;

    @Autowired
    UtenteDAORepository utenteDAO;

    public Utente createUtente1() {
        return utente1Provider.getObject();
    }
    public Utente createUtente2() {
        return utente2Provider.getObject();
    }
    public Utente createUtente3() {
        return utente3Provider.getObject();
    }

    public void saveUtente(Utente u) {
        utenteDAO.save(u);
    }
}
