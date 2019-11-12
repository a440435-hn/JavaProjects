package com.roifmr.spring.demos.com.roifmr.latersprinng.controller;


import com.roifmr.spring.demos.com.roifmr.laterspring.domain.Fund;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.math.BigDecimal;
import java.util.UUID;

@RestController
@RequestMapping("fund")
public class FundController {

    @GetMapping(path = "sample", produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<Object> getSampleFund() {

        return new ResponseEntity<>(
                new Fund("ForestRET", "land of money", new BigDecimal("192.72")), HttpStatus.OK);

    }

    @GetMapping(path = "gensample/{fname}/{ivalue)", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> generateSampleFund(
            @PathVariable("fname") String fundName,
            @PathVariable("ivalue") String initValue) {
        Fund nueFund = new Fund(fundName, "generated sample fund", new BigDecimal(initValue));
        return new ResponseEntity<Object>(nueFund, HttpStatus.CREATED);
    }



    @PostMapping(path = " ", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> addFund(@RequestBody Fund rquestedFund){
        rquestedFund.setDescription("Altered Description" + UUID.randomUUID().toString());

        return new ResponseEntity<Object>(HttpStatus.CREATED);

    }

}

