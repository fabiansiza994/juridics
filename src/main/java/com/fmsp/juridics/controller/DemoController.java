package com.fmsp.juridics.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    @GetMapping("/admin/dashboard")
    public ResponseEntity<String> adminEndpoint() {
        return ResponseEntity.ok("👑 Hola ADMIN, bienvenido al dashboard.");
    }

    @GetMapping("/user/procesos")
    public ResponseEntity<String> userEndpoint() {
        return ResponseEntity.ok("🛠️ Hola USER/ADMIN, puedes ver y gestionar procesos.");
    }

    @GetMapping("/client/estado")
    public ResponseEntity<String> clientEndpoint() {
        return ResponseEntity.ok("📄 Hola CLIENT/ADMIN, puedes ver los estados de los procesos.");
    }
}