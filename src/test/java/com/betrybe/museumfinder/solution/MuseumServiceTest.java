package com.betrybe.museumfinder.solution;

import com.betrybe.museumfinder.database.MuseumFakeDatabase;
import com.betrybe.museumfinder.evaluation.utils.TestHelpers;
import com.betrybe.museumfinder.exception.MuseumNotFoundException;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.service.MuseumServiceInterface;
import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
@DisplayName("Teste da MuseumService")
public class MuseumServiceTest {

  @MockBean
  MuseumFakeDatabase museumFakeDatabase;

  @Autowired
  MuseumServiceInterface service;

  @Test

  @DisplayName("Testa getMuseum da classe de serviço implamentada")
  void testGetMuseum() {
    testGetMuseumOk();
    testGetMuseumNotFoundException();
  }

  private void testGetMuseumOk() {
    Museum museum = TestHelpers.createMockMuseum(44L);

    Mockito.when(museumFakeDatabase.getMuseum(44L))
        .thenReturn(Optional.of(museum));
    Museum returnedMuseum = service
        .getMuseum(44L);

    Assertions.assertEquals(museum.getName(), returnedMuseum.getName());
  }

  private void testGetMuseumNotFoundException() {
    Mockito.reset(museumFakeDatabase);

    Mockito.when(museumFakeDatabase.getMuseum(999L))
        .thenReturn(Optional.empty());
    Assertions.assertThrows(MuseumNotFoundException.class, () -> {
      service.getMuseum(999L);
    });
  }
}
