package de.bht.app.usermanagement.application;

public interface EventListener<T> {
    void handle(T event);
}