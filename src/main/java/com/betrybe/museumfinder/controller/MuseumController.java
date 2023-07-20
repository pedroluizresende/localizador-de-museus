package com.betrybe.museumfinder.controller;

import com.betrybe.museumfinder.dto.MuseumCreationDto;
import com.betrybe.museumfinder.dto.MuseumDto;
import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.service.MuseumServiceInterface;
import com.betrybe.museumfinder.util.ModelDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller de Museum.
 */
@Controller
@RequestMapping("museums")
public class MuseumController {

  MuseumServiceInterface service;

  @Autowired
  public MuseumController(MuseumServiceInterface service) {
    this.service = service;
  }

  /**
   * Método que cria um novo museu.
   *
   * @param newMuseumDto do tipo MuseumCreationDto, vindo da requisição.
   */
  @PostMapping
  public ResponseEntity<MuseumDto> createMuseum(@RequestBody MuseumCreationDto newMuseumDto) {
    Museum newMuseum = ModelDtoConverter.dtoToModel(newMuseumDto);

    Museum museum = service.createMuseum(newMuseum);

    MuseumDto museumDto = ModelDtoConverter.modelToDto(museum);

    return ResponseEntity.status(HttpStatus.CREATED).body(museumDto);
  }

  /**
   * Rota que retorna o museu mais próximo de acordo com os parametros.
   *
   * @param latitude      double vindo da requisição.
   * @param longitude     double vindo da requisição.
   * @param maxDistanceKm Double vindo da requisição.
   */
  @GetMapping("/closest")
  public ResponseEntity<MuseumDto> getClosestMuseum(
      @RequestParam("lat") double latitude,
      @RequestParam("lng") double longitude,
      @RequestParam("max_dist_km") Double maxDistanceKm
  ) {
    Coordinate coordinate = new Coordinate(latitude, longitude);

    Museum museum = service.getClosestMuseum(coordinate, maxDistanceKm);
    MuseumDto museumDto = ModelDtoConverter.modelToDto(museum);
    return ResponseEntity.ok(museumDto);
  }

  /**
   * Rota que retorna um museu a partir de um id.
   *
   * @param id do tipo Long.
   */
  @GetMapping("/{id}")
  public ResponseEntity<MuseumDto> getMuseum(@PathVariable Long id) {
    Museum museum = service.getMuseum(id);

    MuseumDto museumDto = ModelDtoConverter.modelToDto(museum);

    return ResponseEntity.ok(museumDto);
  }
}
