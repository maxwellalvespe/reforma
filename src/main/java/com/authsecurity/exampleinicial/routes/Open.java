package com.authsecurity.exampleinicial.routes;

import com.authsecurity.exampleinicial.routes.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Open {

    @GetMapping
    public ResponseEntity<?> open() {
        return new ResponseEntity<>(new ResponseDto("Conexxão realizada com sucesso"), HttpStatus.OK);
    }
}
