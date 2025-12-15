package com.jordiizz.misapps.lab.optional.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.jordiizz.misapps.lab.optional.pojo.Usuario;

public class UsuarioRespository {

    private List<Usuario> usuarios = new ArrayList<>();


    public UsuarioRespository(){
        usuarios.add(new Usuario(0, "Juan"));
        usuarios.add(new Usuario(1, "José"));
    }

    public Optional<Usuario> findById(int idUsuario){
        return usuarios.stream().filter(u -> u.getId() == idUsuario).findFirst();
    }

    public Usuario findByIdUsuario(int idUsuario){
        return usuarios.stream().filter(u -> u.getId() == idUsuario).findFirst().orElse(null);
    }
}
