package com.aula42.listaDeProdutos.service;

import com.aula42.listaDeProdutos.model.ProdutosModel;
import com.aula42.listaDeProdutos.model.UsuariosModel;
import com.aula42.listaDeProdutos.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    public List<UsuariosModel> buscarTodos(){
        return usuariosRepository.findAll();
    }

    public Optional<UsuariosModel> buscarId(Long codigo){
        return usuariosRepository.findById(codigo);
    }

    public UsuariosModel cadastrar(UsuariosModel usuariosModel){

        usuariosModel.getCodigo();
        usuariosModel.getNomeUsuario();

        return usuariosRepository.save(usuariosModel);
    }

    public UsuariosModel alterar(UsuariosModel usuariosModel){

        usuariosModel.getCodigo();
        usuariosModel.getNomeUsuario();

        return usuariosRepository.save(usuariosModel);
    }

    public void deletar(Long codigo){
        usuariosRepository.deleteById(codigo);
    }
}
