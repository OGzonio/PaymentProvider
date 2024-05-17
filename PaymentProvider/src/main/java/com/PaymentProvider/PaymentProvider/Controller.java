package com.PaymentProvider.PaymentProvider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/receive-request")
    public String receiveRequest() {
        // Process the request and prepare the response
        return "dupa!";
    }
}
