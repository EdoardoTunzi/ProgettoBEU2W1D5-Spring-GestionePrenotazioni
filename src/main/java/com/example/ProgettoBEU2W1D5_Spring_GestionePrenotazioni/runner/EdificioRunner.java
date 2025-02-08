package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.runner;

import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Edificio;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.service.EdificioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EdificioRunner implements CommandLineRunner {

    @Autowired private EdificioService edificioService;

    @Override
    public void run(String... args) throws Exception {

        /*Edificio e1 = edificioService.createEdificio1();
        edificioService.saveEdificio(e1);*/
    }
}
