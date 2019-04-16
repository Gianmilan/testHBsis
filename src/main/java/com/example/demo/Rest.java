package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("cidade")
public class Rest {

    private final WeatherFeignClient weatherFeignClient;

    @Autowired
    public Rest(WeatherFeignClient weatherFeignClient) {
        this.weatherFeignClient = weatherFeignClient;
    }

    @Value("${weather.appid}")
    private String id;

    @GetMapping
    public WeatherDTO buscaPorCidade(@RequestParam String cidade){
        return weatherFeignClient.buscaTempoPorCidade(cidade, id);
    }

    @PostMapping
    public void cadastrarCidade(@RequestBody CidadeDTO cidade){

    }

    @GetMapping
    public List<String> listarCidades(){
        return null;
    }
}
