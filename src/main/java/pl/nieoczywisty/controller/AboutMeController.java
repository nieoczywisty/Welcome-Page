package pl.nieoczywisty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.nieoczywisty.model.AboutMe;

@Controller
public class AboutMeController {

    private String aboutMeString = "lalalala";

    @GetMapping("/aboutMe")
    public String aboutMe(Model model) {
        model.addAttribute("page","aboutMe");
        model.addAttribute("aboutMeString",aboutMeString);
        return "index";
    }
}
