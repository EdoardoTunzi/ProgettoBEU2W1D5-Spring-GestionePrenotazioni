package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.configuration;

import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.*;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.repository.EdificioDAORepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Locale;

@Configuration
public class AppConfig {
    Faker fake = Faker.instance(new Locale("it-IT"));
    @Autowired
    private EdificioDAORepository edificioDAO;

    //creazione beans

    @Bean("utente1")
    public Utente utente1Bean() {
        return new Utente("utente1", fake.name().fullName(), fake.internet().emailAddress());
    }

    @Bean("utente2")
    public Utente utente2Bean() {
        return new Utente("utente2", fake.name().fullName(), fake.internet().emailAddress());
    }

    @Bean("utente3")
    public Utente utente3Bean() {
        return new Utente("utente3", fake.name().fullName(), fake.internet().emailAddress());
    }

    @Bean(name = "edificio1")
    public Edificio edificio1Bean() {
        return new Edificio("MainEdificio", fake.address().streetAddress(), fake.address().cityName());
    }

    //NOTA:
    // dato che i bean delle postazioni utilizzano edificioDAO,
    // alla prima creazione del db devono essere commentati per evitare errori nella creazione del db.
    // Possono essere utilizzati solo una volta creato l'edificio

   /* @Bean("postazione1")
    public Postazione postazione1Bean() {
        return new Postazione("Sala Imperiale", TipoPostazione.SALA_RIUNIONI, 300, edificioDAO.findById(1L).get());
    }

    @Bean("postazione2")
    public Postazione postazione2Bean() {
        return new Postazione("Sala Primavera", TipoPostazione.OPENSPACE, 150, edificioDAO.findById(1L).get());
    }

    @Bean("postazione3")
    public Postazione postazione3Bean() {
        return new Postazione("Sala Levante", TipoPostazione.PRIVATO, 30, edificioDAO.findById(1L).get());
    }*/

    @Bean("prenotazioneCustom")
    @Scope("prototype")
    public Prenotazione prenotazioneBean() {
        return new Prenotazione();
    }
}
