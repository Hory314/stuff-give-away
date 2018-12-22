package pl.hordyjewicz.stuffgiveaway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController
{
    @RequestMapping
    public String mianSite()
    {
        return "index";
    }
}
