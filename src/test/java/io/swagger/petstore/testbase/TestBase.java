package io.swagger.petstore.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {

    @BeforeClass
    public static void inIt() {

        RestAssured.baseURI="https://petstore.swagger.io/v2";

        //https://petstore.swagger.io/v2/user

    }

}
