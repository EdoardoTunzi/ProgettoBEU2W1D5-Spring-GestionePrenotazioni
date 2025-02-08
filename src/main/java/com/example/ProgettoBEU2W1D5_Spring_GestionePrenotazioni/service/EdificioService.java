package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.service;

import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Edificio;
import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.repository.EdificioDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EdificioService {
    @Autowired @Qualifier("edificio1")
    ObjectProvider<Edificio> edificioProvider;

    @Autowired
    EdificioDAORepository edificioDAO;

    public Edificio createEdificio1() {
        return edificioProvider.getObject();
    }

    public void saveEdificio(Edificio edificio) {
        edificioDAO.save(edificio);
    }

    public Edificio findEdificioById(long id) {
        return edificioDAO.findById(id).get();
    }
}
