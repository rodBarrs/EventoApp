package co.eventoapp.eventoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {

    @RequestMapping("/cadastrarEvento")
    public String form(){
        return "evento/formEvento";
    }

}
