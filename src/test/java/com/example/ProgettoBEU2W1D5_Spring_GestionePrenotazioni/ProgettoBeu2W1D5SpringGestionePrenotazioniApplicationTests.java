package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni;

import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Edificio;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Postazione;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.service.EdificioService;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.service.PostazioneService;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.service.UtenteService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ProgettoBeu2W1D5SpringGestionePrenotazioniApplicationTests {
    @Autowired
    ProgettoBeu2W1D5SpringGestionePrenotazioniApplication app;
    @Autowired
    private UtenteService utenteService;
    @Autowired
    private EdificioService edificioService;
    @Autowired
    private PostazioneService postazioneService;



    @Test
    @DisplayName("ApplicazioneSiAvviaCorrettamente")
    void contextLoads() {
        assertThat(app).isNotNull();
    }

    @Test
    @DisplayName("Edificio1BeanCreaUnEdificioConNomeMainEdificio")
    void edificioTest() {
        Edificio e = edificioService.createEdificio1();
        assertEquals("MainEdificio", e.getNome());
    }

    @Test
    @DisplayName("QuandoCreoPostazione1èDisponibileDiDefault")
    void postazioneTest() {
        Postazione p = postazioneService.createPostazione1();
        assertTrue(p.isDisponibile());
    }


}
