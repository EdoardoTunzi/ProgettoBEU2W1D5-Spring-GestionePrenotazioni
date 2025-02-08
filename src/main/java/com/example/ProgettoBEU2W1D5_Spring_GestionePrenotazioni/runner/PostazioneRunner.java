package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.runner;

import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Edificio;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Postazione;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.repository.EdificioDAORepository;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.service.EdificioService;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.service.PostazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PostazioneRunner implements CommandLineRunner {

    @Autowired private PostazioneService postazioneService;

    @Override
    public void run(String... args) throws Exception {


        //Postazione p1 = postazioneService.createPostazione1();
       /* Postazione p2 = postazioneService.createPostazione2();
        Postazione p3 = postazioneService.createPostazione3();

       // postazioneService.savePostazione(p1);
        postazioneService.savePostazione(p2);
        postazioneService.savePostazione(p3);*/
    }
}
