package com.javathima.treinoapi_01.Controllers;

import com.javathima.treinoapi_01.DAOs.IProfessionalRepository;
import com.javathima.treinoapi_01.Models.Professional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller é utilizado para retornar views (normalmente HTML)
//@RestController é mais simples, usado para retornar dados serializados em formatos como JSON e XML
@RestController
public class ProfessionalsController {

    @Autowired
    private IProfessionalRepository repo;

    @GetMapping("/professionals")
    ResponseEntity<Iterable<Professional>> index(){
        var professionals = repo.findAll();
        return ResponseEntity.status(200).body(professionals);
    }

}
