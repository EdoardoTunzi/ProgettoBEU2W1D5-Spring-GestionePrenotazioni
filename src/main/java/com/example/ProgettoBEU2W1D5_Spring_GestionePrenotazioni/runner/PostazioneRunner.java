package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.runner;

import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Postazione;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.TipoPostazione;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.repository.PostazioneDAORepository;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.service.PostazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostazioneRunner implements CommandLineRunner {

    @Autowired
    private PostazioneService postazioneService;
    @Autowired
    PostazioneDAORepository postazioneDAO;

    @Override
    public void run(String... args) throws Exception {

        //creazione postazioni
        /*Postazione p1 = postazioneService.createPostazione1();
        Postazione p2 = postazioneService.createPostazione2();
        Postazione p3 = postazioneService.createPostazione3();

        //salvataggio postazioni
        postazioneService.savePostazione(p1);
        postazioneService.savePostazione(p2);
        postazioneService.savePostazione(p3);*/

        //ricerca di una postazione per tipo e città
       /* postazioneService.searchByTipoECitta(TipoPostazione.OPENSPACE, "San Rosita");*/

        //cambiare disponibilità di una Postazione
        /* postazioneService.toggleDisponibilitaPostazione(postazioneDAO.findById(4L).get());*/

    }
}
