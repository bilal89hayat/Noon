package com.library.management.controller;


import com.library.management.model.Fine;
import com.library.management.service.FineService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fine")
public class FineController {

    private FineService fineService;

    public FineController(FineService fineService) {
        this.fineService = fineService;
    }

    @PostMapping
    public void saveFine(@RequestBody Fine fine){
        fineService.save(fine);
    }

    @GetMapping(value = "/{userId}")
    public void getFine(@PathVariable Long userId){
        fineService.findByUserId(userId);
    }
}
