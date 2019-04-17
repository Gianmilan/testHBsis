package com.example.demo.rest;

import com.example.demo.documents.CidadeDocument;
import com.example.demo.integration.dto.WeatherDTO;
import com.example.demo.integration.WeatherFeignClient;
import com.example.demo.services.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cidade")
public class Rest {

    private final CidadeService cidadeService;
    private final WeatherFeignClient weatherFeignClient;

    @Autowired
    public Rest(CidadeService cidadeService,
                WeatherFeignClient weatherFeignClient) {
        this.cidadeService = cidadeService;
        this.weatherFeignClient = weatherFeignClient;
    }

    @Value("${weather.appid}")
    private String id;

    @GetMapping(value = "tempo", produces = MediaType.APPLICATION_JSON_VALUE)
    public WeatherDTO buscaPorCidade(@RequestParam(value = "cidade") String cidade){
        return weatherFeignClient.buscaTempoPorCidade(cidade, id);
    }

    @PostMapping(value = "cadastrar")
    public void cadastrarCidade(@RequestBody CidadeDocument cidade){
        this.cidadeService.cadastrarCidade(cidade);
    }

    @GetMapping(value = "listar")
    public List<CidadeDocument> listarCidades(){
        return this.cidadeService.listarCidades();
    }
}
