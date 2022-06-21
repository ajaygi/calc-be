package com.redhat.openinnovationlabs.microservice.calculator.service;

import com.redhat.openinnovationlabs.microservice.calculator.model.ApiResult;
import com.redhat.openinnovationlabs.microservice.calculator.model.ResultBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Slf4j
@Service
public class SubService {

    public ApiResult subCalc(BigDecimal operand_1, BigDecimal operand_2){
//        log.info("SubService subCalc method called....");
        return ResultBuilder.getResult(operand_1.subtract(operand_2));
    }
}
