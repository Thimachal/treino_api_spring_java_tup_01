package com.javathima.treinoapi_01.Services;

import com.javathima.treinoapi_01.Models.Professional;

import java.util.ArrayList;
import java.util.List;

public class ProfessionalService {
    private ProfessionalService(){

    }

    public static List<Professional> professionals(){
        var lista = new ArrayList<Professional>();

        lista.add(new Professional(1,"thimachal"));
        lista.add(new Professional(2,"Isa"));

        return lista;
    }
}
