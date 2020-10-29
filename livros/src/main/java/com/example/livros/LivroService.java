package com.example.livros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class LivroService {


    public List<Livro> getLivros(){
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro(1L, "Iracema","José De Alencar"));
        livros.add(new Livro(2L, "Dom Casmurro","Machado De Assis"));
        livros.add(new Livro(3L,"O Colecionador de Ossos","Jeffery Deaver"));

        return livros;
    }
}
