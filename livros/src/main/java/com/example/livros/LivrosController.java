package com.example.livros;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/livros")
public class LivrosController {


    private LivroService service = new LivroService();

    @GetMapping
    public ResponseEntity<List<Livro>> get() {
        List<Livro> livros = service.getLivros();
        return new ResponseEntity(livros, HttpStatus.OK);
    }
}
