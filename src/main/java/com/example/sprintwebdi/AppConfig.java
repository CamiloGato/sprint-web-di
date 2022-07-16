package com.example.sprintwebdi;

import com.example.sprintwebdi.models.domain.ItemFactura;
import com.example.sprintwebdi.models.domain.Producto;
import com.example.sprintwebdi.models.service.IServicio;
import com.example.sprintwebdi.models.service.MiServicio;
import com.example.sprintwebdi.models.service.MiServicioComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Primary
    @Bean("miServicioSimple")
    public IServicio registrarMiServicio(){
        return new MiServicio();
    }

    @Bean("miServicioComplejo")
    public IServicio registrarMiServicioComplejo(){
        return new MiServicioComplejo();
    }

    @Primary
    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("Camara", 100);
        Producto producto2 = new Producto("Bicicleta", 200);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);

        return Arrays.asList(linea1, linea2);
    }

    @Bean("itemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto1 = new Producto("LG LCD 24", 250);
        Producto producto2 = new Producto("Notebook Asus", 500);
        Producto producto3 = new Producto("Impresora HP", 80);
        Producto producto4 = new Producto("Escritorio", 300);


        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);
        ItemFactura linea3 = new ItemFactura(producto3, 4);
        ItemFactura linea4 = new ItemFactura(producto4, 4);


        return Arrays.asList(linea1, linea2, linea3, linea4);
    }

}
