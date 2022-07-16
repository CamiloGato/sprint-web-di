package com.example.sprintwebdi.models.service;

import org.springframework.stereotype.Component;

@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio{

    @Override
    public String operacion(){
        return "Ejecutando algún proceso complicado ...";
    }

}
