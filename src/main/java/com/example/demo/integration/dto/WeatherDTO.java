package com.example.demo.integration.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDTO {

    private String id;
    private String name;
    private Date dt;
}
