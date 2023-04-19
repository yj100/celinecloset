package com.celinecloset.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor(){
        Authentication authenthentication =
    SecurityContextHolder.getContext().getAuthentication();
        String userId = "";
        if (authenthentication != null){
            userId = authenthentication.getName();
        }
        return Optional.of(userId);
    }
}
