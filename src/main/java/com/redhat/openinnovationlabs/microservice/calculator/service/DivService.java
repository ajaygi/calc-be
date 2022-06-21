package com.redhat.openinnovationlabs.microservice.calculator.service;

import com.redhat.openinnovationlabs.microservice.calculator.model.ApiResult;
import com.redhat.openinnovationlabs.microservice.calculator.model.ResultBuilder;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DivService {

    public ApiResult divCalc(BigDecimal operand_1, BigDecimal operand_2){
        return ResultBuilder.getResult(operand_1.divide(operand_2));
    }
}
