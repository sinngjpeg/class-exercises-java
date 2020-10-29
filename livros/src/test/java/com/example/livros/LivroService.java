package com.example.livros;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

public class LivroService {

    @Test
    public void deveRetornarUmaListaDeLivros(){
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro(2L, "Dom Casmurro","Machado De Assis"));
        livros.add(new Livro(3L,"O Colecionador de Ossos","Jeffery Deaver"));

    }
}
