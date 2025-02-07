package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.configuration;

import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Edificio;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Postazione;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Prenotazione;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Utente;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "edificioCustom")
    @Scope("prototype")
    public Edificio edificio1Bean() {
        return new Edificio();
    }

    @Bean("postazioneCustom")
    @Scope("prototype")
    public Postazione postazioneBean() {
        return new Postazione();
    }

    @Bean("prenotazioneCustom")
    @Scope("prototype")
    public Prenotazione prenotazioneBean() {
        return new Prenotazione();
    }

    @Bean("utenteCustom")
    @Scope("prototype")
    public Utente utenteBean() {
        return new Utente();
    }
}
