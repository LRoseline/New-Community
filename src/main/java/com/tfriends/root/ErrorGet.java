package com.tfriends.root;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ErrorGet implements ErrorController {

    @GetMapping("/error")
    public String ErrorPage(HttpServletRequest req, Model mdl) throws Exception {
        int status = Integer.valueOf(req.getAttribute(RequestDispatcher.ERROR_STATUS_CODE).toString());

        mdl.addAttribute("cod", status + " ERROR!!");
        return "/default/error";
    }
}
