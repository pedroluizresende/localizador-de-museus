package com.betrybe.museumfinder.exception;


/**
 * Exceção personalizada para museu não encontrado.
 */
public class MuseumNotFoundException extends RuntimeException {

  public MuseumNotFoundException() {
    super("Museu não encontrado!");
  }
}
