package de.bht.app.usermanagement.infrastructure.messaging;

import de.bht.app.usermanagement.domain.events.UserLoggedInEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserLoggedInEventListener {

    private static final Logger logger = LoggerFactory.getLogger(UserLoggedInEventListener.class);

    @EventListener
    public void handleCitizenLoggedInEvent(UserLoggedInEvent event) {
        logger.info("Bürger angemeldet:");
        logger.info("ID: {}", event.getEmail());

        if (event.getEmail() == null || event.getEmail().isEmpty()) {
            logger.warn("Die E-Mail für den Bürger ist leer.");
        }
    }
}