package com.yuri.microcalculadora.micro_calculadora.resource;

import com.yuri.microcalculadora.micro_calculadora.model.Calculadora;
import com.yuri.microcalculadora.micro_calculadora.services.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/resultado")
public class CalculadoraResource {

    @Autowired
    private CalculadoraService service;

    @GetMapping(value = "/{tabelaId}/multiplique/{dias}")
    public ResponseEntity<Calculadora> getPayment(@PathVariable Long tabelaId, @PathVariable Integer dias) {
        Calculadora calculadora = service.getCalculo(tabelaId, dias);
        return ResponseEntity.ok(calculadora);
    }


}
