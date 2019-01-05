package pl.hordyjewicz.stuffgiveaway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/giveaway")
public class GiveAwayController
{
    @GetMapping
    public String prepareMultiFrom()
    {
        return "giveaway";
    }

    @PostMapping
    public String collectFromData()
    {
        return "giveaway-end";
    }
}
