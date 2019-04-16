package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CidadeDTO {
    String cidade;
    String temperaturaMaxima;
    String temperaturaMinima;
}
