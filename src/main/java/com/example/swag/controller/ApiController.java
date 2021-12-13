package com.example.swag.controller;

import com.example.swag.model.Client;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("Самый замечательный API")
public class ApiController {

    @GetMapping(value = "/getClient")
    @ApiOperation("Получение клиента")
    public Client getClient() {
        return new Client("Sasha",  29, true);
    }

    @PostMapping(value = "/addClient")
    @ApiOperation("Добавлние клиента")
    public String addClient(@RequestBody Client client) {
        return String.format("Client %s was added", client.getName());
    }
}
