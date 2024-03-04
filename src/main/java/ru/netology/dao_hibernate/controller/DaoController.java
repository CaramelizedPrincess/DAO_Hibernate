package ru.netology.dao_hibernate.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.dao_hibernate.entity.Persons;
import ru.netology.dao_hibernate.repository.DaoRepository;

import java.util.List;

@RestController
public class DaoController {
    private final DaoRepository daoRepository;

    public DaoController(DaoRepository daoRepository) {
        this.daoRepository = daoRepository;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> getPersons(@RequestParam String city) {
        return daoRepository.getPersonsByCity(city);
    }
}