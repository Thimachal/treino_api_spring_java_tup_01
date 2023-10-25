package com.javathima.treinoapi_01.Controllers;

import com.javathima.treinoapi_01.DTO.Home;
import com.javathima.treinoapi_01.Models.Professional;
import com.javathima.treinoapi_01.Services.ProfessionalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller é utilizado para retornar views (normalmente HTML)
//@RestController é mais simples, usado para retornar dados serializados em formatos como JSON e XML
@RestController
public class HomeController {

    @GetMapping("/")
    public Home index(){
        return new Home();
    }

    @GetMapping("/professionals")
    public List<Professional> professionals(){
        return ProfessionalService.professionals();
    }

}
