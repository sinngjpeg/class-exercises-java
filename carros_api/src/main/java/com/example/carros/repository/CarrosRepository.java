package com.example.carros.repository;

import com.example.carros.domain.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarrosRepository extends JpaRepository<Carro, Long> {


    List<Carro> findByTipo(String tipo);

}
