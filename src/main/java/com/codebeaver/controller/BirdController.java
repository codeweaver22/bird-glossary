package com.codebeaver.controller;

import com.codebeaver.model.Bird;
import com.codebeaver.service.BirdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/birds")
public class BirdController {

    @Autowired
    private BirdService birdService;

    @GetMapping
    public List<Bird> getBirds() {
        List<Bird> birds = birdService.getBirds();
        return birds;
    }

    @GetMapping("/{name}")
    public List<Bird> getBirdsByName(@PathVariable String name) {
        List<Bird> birds = birdService.getBirdByName(name);
        return birds;
    }

}
