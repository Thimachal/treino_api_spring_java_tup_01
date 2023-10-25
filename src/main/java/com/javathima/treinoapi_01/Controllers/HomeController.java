package com.javathima.treinoapi_01.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller é utilizado para retornar views (normalmente HTML),
//enquanto @RestController é utilizado para retornar dados serializados em formatos como JSON e XML
@RestController
public class HomeController {

    @GetMapping("/")
    public void test(){

    }

}
