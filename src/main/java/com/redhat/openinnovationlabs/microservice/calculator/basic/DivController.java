package com.redhat.openinnovationlabs.microservice.calculator.basic;

import com.redhat.openinnovationlabs.microservice.calculator.model.ApiResult;
import com.redhat.openinnovationlabs.microservice.calculator.model.ResultBuilder;
import com.redhat.openinnovationlabs.microservice.calculator.service.DivService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@Slf4j
@RestController
@Profile("div")
public class DivController {

    @Autowired private DivService divService;

    @GetMapping("/divide")
    public ApiResult divide(@RequestParam BigDecimal operand_1, @RequestParam BigDecimal operand_2){
        if(operand_2.equals(BigDecimal.ZERO)){
            return ResultBuilder.getResultFromError("No division by null");
        }
        return divService.divCalc(operand_1, operand_2);
    }
}
