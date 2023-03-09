package com.tfriends.root.restapi;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tfriends.dto.ErrorDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RestController
public class ErrorLoad implements ErrorController {
    @PostMapping("/error")
    public ErrorDTO errorAPI(HttpServletRequest req) {
        ErrorDTO dto = new ErrorDTO();

        int cod = Integer.valueOf(req.getAttribute(RequestDispatcher.ERROR_STATUS_CODE).toString());

        dto.setCod(cod);
        if (cod == 400) {
            dto.setMes("Invalid Info.");
        } else if (cod == 500) {
            dto.setMes("Data processing error! Will be fix it.");
        } else {
            dto.setMes("Wrong access.");
        }

        return dto;
    }
}
