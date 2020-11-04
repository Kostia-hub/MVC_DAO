package lesson.controller;

import lesson.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("message", "My message Test random UUID-> " + UUID.randomUUID());
        //model.addAttribute("message", "22" + Product.class.getFields());
        return "index";
    }
}
