package com.eazybytes.cards.audit;

import org.jspecify.annotations.NullMarked;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {

    @Override
    @NullMarked
    public Optional<String> getCurrentAuditor() {
        return Optional.of("TestCardsUser");
    }
}
