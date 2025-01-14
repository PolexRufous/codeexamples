package com.rufous.polex.codeexamples.controller;

import com.rufous.polex.codeexamples.data.Principal;
import com.rufous.polex.codeexamples.service.PrincipalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController("/api/principals")
public class PrincipalController {

    public PrincipalService principalService;

    @GetMapping("/getPrincipals")
    public List<Principal> getPrincipals() {
        return principalService.getAllPrincipals();
    }

    @PostMapping("/savePrincipal")
    public Principal savePrincipal(@RequestBody Principal principal) {
        return principalService.savePrincipal(principal);
    }

    @DeleteMapping("/deletePrincipal/{id}")
    public ResponseEntity<?> deletePrincipal(@PathVariable("id") Long id) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(null);
    }
}
