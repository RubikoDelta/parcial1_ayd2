package xyz.luis.persona.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import xyz.luis.persona.model.Estado;
import xyz.luis.persona.model.Pais;
import xyz.luis.persona.repository.EstadoRepository;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class EstadoServiceTest {


    @Mock
    private EstadoRepository estadoRepository;

    @InjectMocks
    private EstadoService estadoService;

    private Estado estado;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        estado = new Estado();
        estado.setPais(new Pais());
        estado.setNombre("Luis Lobos");
        estado.setId(new Long(11));
    }

    @Test
    void findAll() {
        when(estadoRepository.findAll()).thenReturn(Arrays.asList(estado));
        assertNotNull(estadoService.findAll());
    }
}