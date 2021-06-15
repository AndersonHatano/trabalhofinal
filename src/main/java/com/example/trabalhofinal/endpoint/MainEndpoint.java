package com.example.trabalhofinal.endpoint;

import com.example.trabalhofinal.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.trabalhofinal.service.MainService;

@RestController
public class MainEndpoint {

    @Autowired
    MainService mainService;

    @GetMapping("/allcliente")
    public Iterable<Cliente> search(){
       return mainService.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String teste(){
        return ("teste!!");
    }

}
