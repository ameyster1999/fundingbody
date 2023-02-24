package com.example.fundingbody.controller;

import com.example.fundingbody.model.FundingBody;
import com.example.fundingbody.service.FundingBodyService;
import javax.validation.Valid;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funders")
public class FundingBodyController {
    @Autowired private FundingBodyService fundingBodyService;

    @PostMapping(value = "/add")
    @ResponseStatus(HttpStatus.CREATED)
    @SneakyThrows
    public ResponseEntity<Long> createFunder(@Valid @RequestBody FundingBody fundingBody) {
        Long id = fundingBodyService.createFunder(fundingBody);
        return ResponseEntity.ok().body(id);
    }
}
