package com.redhat.openinnovationlabs.microservice.calculator.basic;

import com.redhat.openinnovationlabs.microservice.calculator.model.ApiResult;
import com.redhat.openinnovationlabs.microservice.calculator.service.AddService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@Slf4j
@RestController
@Profile("add")
public class AddController {

    @Autowired private AddService addService;

    @GetMapping("/addition")
    public ApiResult add(@RequestParam BigDecimal operand_1, @RequestParam BigDecimal operand_2){
        return addService.addCalc(operand_1, operand_2);
    }
}
