package io.swagger.petstore.crudtest;

import io.restassured.response.Response;
import io.swagger.petstore.model.PetPojo;
import io.swagger.petstore.testbase.TestBase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class PetsCURDTest extends TestBase {


    @Test
    public void AddNewPet_post() {


        PetPojo petPojo = new PetPojo();
        HashMap<String, Object> pet = new HashMap<String, Object>();
        pet.put("id", "21");
        pet.put("name", "abcd");

        List<String> name = new ArrayList<String>();
        name.add("puppy");

        List<HashMap<String, Object>> petList = new ArrayList<HashMap<String, Object>>();
        petList.add(pet);

        petPojo.setId(22);
        petPojo.setCategory(pet);
        petPojo.setName("Tiger");
        petPojo.setPhotoUrls(name);
        petPojo.setTags(petList);
        petPojo.setStatus("Ok");
        Response response = given()
                .header("Content-Type", "application/json")
                .header("accept", "application/json")
                .when()
                .body(petPojo)
                .post("/pet");
        response.then().statusCode(200);
        response.prettyPrint();


    }


    @Test
    public void UpdateExistingPetDetails_put() {

        PetPojo petPojo = new PetPojo();
        HashMap<String, Object> pet = new HashMap<String, Object>();
        pet.put("id", "23");
        pet.put("name", "Dog");


        List<String> name = new ArrayList<String>();
        name.add("Adefg");

        List<HashMap<String, Object>> petList = new ArrayList<HashMap<String, Object>>();
        petList.add(pet);


        petPojo.setId(0);
        petPojo.setCategory(pet);
        petPojo.setName("Dolby");
        petPojo.setPhotoUrls(name);
        petPojo.setTags(petList);
        petPojo.setStatus("Ready");

        Response response = given()
                .header("Content-Type", "application/json")
                .header("accept", "application/json")
                .when()
                .body(petPojo)
                .put("/pet");
        response.then().statusCode(200);
        response.prettyPrint();


    }
    @Test
    public void FindPetById_get() {

        Response response = given()
                .header("Content-Type", "application/json")
                .header("accept", "application/json")
                .when()
               // .pathParam("id", "21")
                .get("/pet/22");
        response.then().statusCode(200);
        response.prettyPrint();


    }


    @Test
    public void deletePet_delete() {


        Response response = given()
                .header("Content-Type", "application/json")
                .header("accept", "application/json")
                .when()
               // .pathParam("id", "22")
                .delete("/pet/22");
        response.then().statusCode(200);
        response.prettyPrint();


    }

}
