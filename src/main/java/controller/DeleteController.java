package controller;

import model.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DeleteController
{
    @Autowired
    private Repository repository;
    //должна удалять все дела
    @DeleteMapping("/remove_all")
    public String deleteAllDeals(Model model)
    {
        repository.deleteAll();
//        DealRepository.deleteAllDealsFromArrayList();
        return "index";
    }

    @DeleteMapping("/remove/{id}")
    public String deleteOneDeal(@PathVariable String id)
    {
        int intID = Integer.parseInt(id);
        repository.deleteById(intID);
//        DealRepository.deleteOneDealFromArrayLIst(intID);

        return "index";
    }


}
