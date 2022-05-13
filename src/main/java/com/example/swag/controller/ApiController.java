package com.example.swag.controller;

import com.example.swag.model.Client;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@RestController
@Api("Самый замечательный API")
public class ApiController {

    public static List<Client> CLIENTS = new LinkedList<>();
//            Arrays.asList(
//            new Client("Sasha",  30, true),
//            new Client("July",  27, true)
//    );

//    @GetMapping(value = "/getClient")
//    @ApiOperation("Получение клиента")
//    public Client getClient() {
//        return new Client("Sasha",  29, true);
//    }

    @GetMapping(value = "/getClients")
    @ApiOperation("Получение всех клиентов")
    public List<Client> getClients() {
        return CLIENTS;
    }

    @PostMapping(value = "/addClient")
    @ApiOperation("Добавлние клиента")
    public String addClient(@RequestBody Client client) {
        CLIENTS.add(client);
        return String.format("Client %s was added", client.getName());
    }
}
