package com.example.swag;

import com.example.swag.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping(value = "/getClient")
    public Client getClient() {
        return new Client("Sasha",  29, true);
    }

    @PostMapping(value = "/addClient")
    public String addClient(@RequestBody Client client) {
        return String.format("Client %s was added", client.getName());
    }
}
