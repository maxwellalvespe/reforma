package com.authsecurity.exampleinicial.routes;

import com.authsecurity.exampleinicial.routes.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("closed")
@RestController
public class Closed {

    @GetMapping
    public ResponseEntity<?> close() {
        return new ResponseEntity<>(new ResponseDto("Conexão fechada para usuários sem credenciais"), HttpStatus.OK);
    }
}
