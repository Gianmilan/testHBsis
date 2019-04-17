package com.example.demo.documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "cidades")
public class CidadeDocument {

    private String _id;
    private String cidade;
    private String temperaturaMaxima;
    private String temperaturaMinima;
}
