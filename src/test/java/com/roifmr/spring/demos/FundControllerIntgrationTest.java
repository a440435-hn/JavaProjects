package com.roifmr.spring.demos;


import com.roifmr.spring.demos.com.roifmr.laterspring.domain.Fund;
import com.roifmr.spring.demos.com.roifmr.latersprinng.controller.FundController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static  org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class FundControllerIntegrationTest {
    @Autowired
    private FundController currentController;

    @Test
    void sampleFundRequestReturnTest() {
        ResponseEntity<Object> rtnValue = currentController.getSampleFund();
        Fund rtn = (Fund) rtnValue.getBody();
    }

}