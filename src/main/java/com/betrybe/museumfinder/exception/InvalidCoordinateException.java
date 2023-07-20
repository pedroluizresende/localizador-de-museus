package com.betrybe.museumfinder.exception;

/**
 * Excesão para coordenadas inválidas.
 */
public class InvalidCoordinateException extends RuntimeException {

  public InvalidCoordinateException(String message) {
    super(message);
  }
}
