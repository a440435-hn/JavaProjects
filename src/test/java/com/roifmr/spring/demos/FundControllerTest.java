package com.roifmr.spring.demos;

import static org.junit.jupiter.api.Assertions.*;
import static io.restassured.RestAssured.*;

import com.roifmr.spring.demos.com.roifmr.laterspring.domain.Fund;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.math.BigDecimal;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.DEFINED_PORT)
class FundControllerTest {

    @Test
    void  getSampleFundTest(){
        Fund rtnValue =
                given()
                .accept(MediaType.APPLICATION_JSON_VALUE)
                .when()
                .get("/fund/sample")
                .then()
                .statusCode(HttpStatus.OK.value())
                .and()
                .extract().as(Fund.class);
                assertTrue(rtnValue.getCurrentValue().compareTo(BigDecimal.ZERO)==1);

    }
}
