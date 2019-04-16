package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@FeignClient(
        name = "ApiWeather",
        url = "http://api.openweathermap.org/data/2.5/"
)
public interface WeatherFeignClient {

    @GetMapping(value = "weather", produces = APPLICATION_JSON_VALUE)
    WeatherDTO buscaTempoPorCidade(@RequestParam String q, @RequestParam String appid);
}
