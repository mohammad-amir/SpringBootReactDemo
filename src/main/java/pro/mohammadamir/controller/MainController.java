package pro.mohammadamir.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import static java.util.Arrays.asList;

@Controller
public class MainController {
    @Value("${spring.profiles.active:}")
    private String activeProfile;

    @ModelAttribute("isDev")
    public boolean isDev() {
        return StringUtils.isEmpty (activeProfile) ||
                !asList ("prod", "production", "heroku","test", "staging").contains (activeProfile.toLowerCase ());
    }

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/admin")
    public String admin() {
        return "admin";
    }

    @RequestMapping(value = "/swagger")
    public String swagger() {
        return "redirect:swagger-ui.html";
    }
}
