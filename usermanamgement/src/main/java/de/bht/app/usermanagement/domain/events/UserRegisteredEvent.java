package de.bht.app.usermanagement.domain.events;

/**
 * Die UserRegisteredEvent-Klasse repräsentiert ein Ereignis, das ausgelöst wird,
 * wenn ein Bürger erfolgreich registriert wird.
 *
 * Diese Klasse enthält Informationen über die Registrierungsdetails des Bürgers,
 * einschließlich der ID, E-Mail-Adresse und Adresse.
 */
public class UserRegisteredEvent {

    // Die eindeutige ID des registrierten Bürgers
    private final Long id;

    // Die E-Mail-Adresse des registrierten Bürgers
    private final String email;

    // Die Adresse des registrierten Bürgers
    private final String adresse;

    /**
     * Konstruktor für das UserRegisteredEvent.
     *
     * @param id Die eindeutige ID des Bürgers, der sich registriert.
     * @param email Die E-Mail-Adresse des Bürgers, der sich registriert.
     * @param adresse Die Adresse des Bürgers, der sich registriert.
     * @throws IllegalArgumentException Wenn ID, Email oder Adresse null oder leer sind.
     */
    public UserRegisteredEvent(Long id, String email, String adresse) {
        if (id == null || email == null || email.isEmpty() || adresse == null || adresse.isEmpty()) {
            throw new IllegalArgumentException("ID, Email und Adresse dürfen nicht null oder leer sein.");
        }
        this.id = id;
        this.email = email;
        this.adresse = adresse;
    }

    /**
     * Gibt die ID des registrierten Bürgers zurück.
     *
     * @return Die eindeutige ID des Bürgers.
     */
    public Long getId() {
        return id;
    }

    /**
     * Gibt die E-Mail-Adresse des registrierten Bürgers zurück.
     *
     * @return Die E-Mail-Adresse des Bürgers.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gibt die Adresse des registrierten Bürgers zurück.
     *
     * @return Die Adresse des Bürgers.
     */
    public String getAdresse() {
        return adresse;
    }
}