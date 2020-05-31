package controller;

import service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/search")
public class searchcontroller {

    @Autowired
    SearchService searchService;

    @RequestMapping(value = "/binary")
    public String binarysearch () {
        searchService.BinarySearch();

        return "/index";
    }

    @RequestMapping(value = "/sequential")
    public String sequentialsearch() {
        searchService.SequentialSearch();

        return "/index";
    }

    @RequestMapping(value = "/npe")
    public String npetest() {
        searchService.NPEtest();

        return "/index";
    }
}
