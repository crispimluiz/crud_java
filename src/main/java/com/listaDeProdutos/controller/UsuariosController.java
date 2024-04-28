package com.aula42.listaDeProdutos.controller;

import com.aula42.listaDeProdutos.model.ProdutosModel;
import com.aula42.listaDeProdutos.model.UsuariosModel;
import com.aula42.listaDeProdutos.service.ProdutosService;
import com.aula42.listaDeProdutos.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    @GetMapping(path = "/usuarios")
    public List<UsuariosModel> buscarTodosProdutos(){
        return usuariosService.buscarTodos();
    }

    @GetMapping(path = "/usuarios/{codigo}")
    public Optional<UsuariosModel> buscarPorId(@PathVariable Long codigo){
        return usuariosService.buscarId(codigo);
    }

    @PostMapping(path = "/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuariosModel cadastrarProdutos(@RequestBody UsuariosModel usuarioModel){
        return usuariosService.cadastrar(usuarioModel);
    }

    @PutMapping(path = "/usuarios/{codigo}")
    public UsuariosModel alterarProdutos(@RequestBody UsuariosModel usuariosModel){
        return usuariosService.alterar(usuariosModel);
    }

    @DeleteMapping(path = "/usuarios/{codigo}")
    public void deletarProdutos(@PathVariable Long codigo){
        usuariosService.deletar(codigo);
    }
}
