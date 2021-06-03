package controller;

import model.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController
{
    @Autowired
    private Repository repository;

    @GetMapping("/")
    public String index(Model model)
    {
        return "index";
    }

//    @ResponseBody
//    @GetMapping("/get_data")
//    public ArrayList<Deal> indexOnlyData()
//    {
//        Iterable<Deal> iterable = repository.findAll();
//
//        ArrayList<Deal> dealList = new ArrayList<Deal>();
//        for (Deal deal : iterable) {
//            dealList.add(deal);
//        }
//        return dealList;
//    }
//
//    @ResponseBody
//    @GetMapping("/get_data/{id}")
//    public Deal getOneDeal(@PathVariable String id)
//    {
//        int intID = Integer.parseInt(id);
//        Optional<Deal> optional = repository.findById(intID);
//        if (optional.isPresent())
//        {
//            return optional.get();
//        }
//        return null;
//    }
}