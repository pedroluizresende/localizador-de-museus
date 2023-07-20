package com.betrybe.museumfinder.dto;

import com.betrybe.museumfinder.model.Coordinate;

/**
 * Classe MuseumCreationDto.
 */
public record MuseumCreationDto(String name, String description, String address,
                                String collectionType, String subject, String url,
                                Coordinate coordinate) {

}
