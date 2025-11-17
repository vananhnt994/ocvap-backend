package de.bht.app.usermanagement.domain.events;

/**
 * Die UserLoggedInEvent-Klasse repräsentiert ein Ereignis, das ausgelöst wird,
 * wenn ein Bürger sich erfolgreich anmeldet.
 *
 * Diese Klasse enthält Informationen über die Anmeldedaten des Bürgers,
 * einschließlich der E-Mail-Adresse und des Passworts.
 */
public class UserLoggedInEvent {

    // Die E-Mail-Adresse des Bürgers
    private final String email;

    // Das Passwort des Bürgers (in der Regel sollte das Passwort nicht gespeichert werden)
    private final String password;

    /**
     * Konstruktor für das UserLoggedInEvent.
     *
     * @param email Die E-Mail-Adresse des Bürgers, der sich anmeldet.
     * @param password Das Passwort des Bürgers, der sich anmeldet.
     */
    public UserLoggedInEvent(String email, String password) {
        this.email = email;
        this.password = password;
    }

    /**
     * Gibt die E-Mail-Adresse des Bürgers zurück.
     *
     * @return Die E-Mail-Adresse des Bürgers.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gibt das Passwort des Bürgers zurück.
     *
     * @return Das Passwort des Bürgers.
     */
    public String getPassword() {
        return password;
    }
}