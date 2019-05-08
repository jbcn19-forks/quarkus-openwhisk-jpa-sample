package com.ibm.openwhisk.quarkus.jpa.sample;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class OpenWhiskRunTest {

    @Test
    public void testHelloEndpoint() {
//        given()
//          .when().get("/run")
//          .then()
//             .statusCode(200)
//             .body(is("hello"));
    }

}
