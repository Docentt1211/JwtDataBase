package com.jwtdatabase.controller;

import com.jwtdatabase.service.DeezerAPIEndpoints;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class SearchController {

    private final DeezerAPIEndpoints dc = new DeezerAPIEndpoints();


    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public String search(@RequestParam String q){

        try {
            return dc.search(q);
        } catch(Exception e){
            e.printStackTrace();
        }
        return "No Results";
    }



}
