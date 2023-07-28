package ru.mortihead.controller;

import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.server.ResponseStatusException;
import ru.mortihead.model.CityEntity;
import ru.mortihead.model.CityRequest;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "api/v1/", produces = "application/json")
@Slf4j
public class CityController {

    @PostMapping("/city")
    @ApiOperation("Получение города по почтовому индексу (try 450077 or 624930) - DTO")
    public CityEntity getCity(@ApiParam(value = "Структура индекса") @RequestBody CityRequest request) {
        log.info("=> Request: {}", request);
        if (Objects.isNull(request)) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Empty request");
        else if ("450077".equals(request.getIndex())) {
            CityEntity city = new CityEntity(1, "Уфа", 1200000);
            return city;
        } else if ("624930".equals(request.getIndex())) {
            CityEntity city = new CityEntity(2, "Карпинск", 20000);
            return city;
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Unknown index city");
        }
    }

    @PostMapping("/city2")
    @ApiOperation("Получение города по почтовому индексу (try 450077 or 624930) - RAW структура")
    public CityEntity getCity(@ApiParam(value = "Структура индекса") @RequestBody Map<String, Object> input) {
        log.info("=> Request: {}", input);
        log.info("========\n"+ Arrays.asList(input));
        CityEntity city = new CityEntity(1, "Уфа", 1200000);
        return city;
    }


}
