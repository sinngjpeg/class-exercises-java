package com.example.carros.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Data
@Table(name = "carro")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tipo;
    private String descricao;
    @Column(name = "url_foto")
    private String urlFoto;
    @Column(name = "url_video")
    private String urlVideo;
    private String latitude;
    private String longitude;


}
