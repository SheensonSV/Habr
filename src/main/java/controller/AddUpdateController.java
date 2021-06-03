package controller;

import model.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AddUpdateController
{
    @Autowired
    private Repository repository;

    @PostMapping("/add_deal")
    public String addDeal(@RequestParam String name, @RequestParam String fullText)
    {
        return "index";
    }

    @PutMapping("/deal_add/{id}")
    public String edit(@PathVariable String id, @RequestParam String name, @RequestParam String fullText)
    {
        return "index";
    }
}
