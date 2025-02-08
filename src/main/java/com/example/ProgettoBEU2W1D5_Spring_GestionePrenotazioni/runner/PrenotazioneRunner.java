package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.runner;

import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Prenotazione;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.service.PostazioneService;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.service.PrenotazioneService;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class PrenotazioneRunner implements CommandLineRunner {
    @Autowired
    private PrenotazioneService prenotazioneService;
    @Autowired
    private UtenteService utenteService;
    @Autowired
    private PostazioneService postazioneService;

    @Override
    public void run(String... args) throws Exception {
        Prenotazione pre1 = prenotazioneService.createPrenotazione(postazioneService.findPostazioneById(2L), LocalDate.now(), utenteService.findUtenteById(1L));
        prenotazioneService.savePrenotazione(pre1);
    }
}
