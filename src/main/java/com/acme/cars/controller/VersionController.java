package com.acme.cars.controller;

import com.acme.cars.dto.VersionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/version")
@CrossOrigin(origins = "*")
public class VersionController {

    @GetMapping
    public ResponseEntity<?> getVersion(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new VersionDTO("v1.0.0"));
    }

}
