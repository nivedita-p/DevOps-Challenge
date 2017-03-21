package com.nivedita.springrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/devops")
    public String getOpenJobs() {
    	String url = "https://boards.greenhouse.io/definiens#.WNAYbFUrLX5";
    	String searchResult = SearchDevops.scanPage(url);
        return searchResult;
    }
    
}

