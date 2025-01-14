package com.rufous.polex.codeexamples.service;

import com.rufous.polex.codeexamples.data.Principal;
import com.rufous.polex.codeexamples.data.PrincipalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PrincipalService {

    private final PrincipalRepository principalRepository;

    @Transactional
    private List<Principal> getPrincipals() {
        return principalRepository.findAll();
    }

    public List<Principal> getAllPrincipals() {
        return this.getPrincipals();
    }

    @Transactional
    public Principal savePrincipal(Principal principal) {
        return principalRepository.save(principal);
    }

    public Principal savePrincipalSafe(Principal principal) {
        if (principal == null) {
            return null;
        } else {
            return this.savePrincipal(principal);
        }
    }
}
