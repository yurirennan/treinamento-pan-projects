package com.yuri.microservice.app2;

import com.yuri.microservice.app2.model.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
@FeignClient(name = "servidorzinho", url="localhost:8081", path="/usuarios")
public interface WorkerFeign {
    @GetMapping
    public ResponseEntity<List<Usuario>> getAll();

}
