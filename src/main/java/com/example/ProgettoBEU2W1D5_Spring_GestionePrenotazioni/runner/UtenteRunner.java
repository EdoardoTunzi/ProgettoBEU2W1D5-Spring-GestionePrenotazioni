package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.runner;

import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Utente;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UtenteRunner implements CommandLineRunner {
    @Autowired private UtenteService utenteService;

    @Override
    public void run(String... args) throws Exception {

        /*Utente u1 = utenteService.createUtente1();
        Utente u2 = utenteService.createUtente2();
        Utente u3 = utenteService.createUtente3();

        utenteService.saveUtente(u1);
        utenteService.saveUtente(u2);
        utenteService.saveUtente(u3);*/


    }
}
