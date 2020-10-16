package com.example.carros.domain.DTO;

import com.example.carros.domain.Carro;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class CarroDTO {
    private Long id;
    private String nome;
    private String tipo;
    private String descricao;
    private String urlFoto;
    private String urlVideo;
    private String latitude;
    private String longitude;

    public static CarroDTO create(Carro c) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(c, CarroDTO.class);
    }


}
