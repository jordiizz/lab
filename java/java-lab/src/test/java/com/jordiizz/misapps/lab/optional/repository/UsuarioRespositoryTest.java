package com.jordiizz.misapps.lab.optional.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.jordiizz.misapps.lab.optional.pojo.Usuario;

public class UsuarioRespositoryTest {

    private UsuarioRespository uRepository;

    @BeforeEach
    void setUp(){
        uRepository = new UsuarioRespository();
    }

    @Test
    void findById(){
        Optional<Usuario> usuario = uRepository.findById(0);
        assertTrue(usuario.isPresent());
        assertEquals("Juan", usuario.get().getNombre());
        Optional<Usuario> usuario2 = uRepository.findById(20);
        assertTrue(usuario2.isEmpty());

    }
}
