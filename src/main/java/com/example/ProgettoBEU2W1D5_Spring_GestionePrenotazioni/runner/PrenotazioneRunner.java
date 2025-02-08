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

        //creazione di una prenotazione

        /*Prenotazione pre1 = prenotazioneService.createPrenotazione(postazioneService.findPostazioneById(4L), LocalDate.of(2025,2,11), utenteService.findUtenteById(4L));
        Prenotazione pre2 = prenotazioneService.createPrenotazione(postazioneService.findPostazioneById(5L), LocalDate.of(2025,2,8), utenteService.findUtenteById(5L));
        Prenotazione pre3 = prenotazioneService.createPrenotazione(postazioneService.findPostazioneById(6L), LocalDate.of(2025,2,9), utenteService.findUtenteById(6L));

        //salvataggio prenotazione
        prenotazioneService.savePrenotazione(pre1);
        prenotazioneService.savePrenotazione(pre2);
        prenotazioneService.savePrenotazione(pre3);
*/

        // metodo per cancellare tutte le prenotazioni scadute precedenti alla data odierna
       /* prenotazioneService.deletePrenotazioniScadute();*/

    }
}
