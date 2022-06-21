package com.redhat.openinnovationlabs.microservice.calculator.basic;

import com.redhat.openinnovationlabs.microservice.calculator.model.ApiResult;
import com.redhat.openinnovationlabs.microservice.calculator.service.MulService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@Slf4j
@RestController
@Profile("mul")
public class MulController {

    @Autowired private MulService mulService;

    @GetMapping("/multiply")
    public ApiResult multiply(@RequestParam BigDecimal operand_1, @RequestParam BigDecimal operand_2){
        return mulService.mulCalc(operand_1, operand_2);
    }
}
