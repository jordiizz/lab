package com.jordiizz.misapps.lab.optional;

import com.jordiizz.misapps.lab.optional.repository.UsuarioRespository;

import java.util.Optional;

import com.jordiizz.misapps.lab.optional.pojo.Usuario;

public class App {
    public static void main( String[] args )
        {
            UsuarioRespository uRepository = new UsuarioRespository();
            Optional<Usuario> uEncontrado = uRepository.findById(0);

            uEncontrado.ifPresent(u -> System.out.println("Encontrado: " + u.getNombre()));

            uEncontrado = uRepository.findById(22);

            uEncontrado.ifPresent(u -> System.out.println("Encontrado: " + u.getNombre()));

            Usuario uEncontrado2 = uRepository.findByIdUsuario(22);
            System.out.println("Encontrado: " + uEncontrado2);
          
        }
}
