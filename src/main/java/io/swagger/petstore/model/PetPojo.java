package io.swagger.petstore.model;

import java.util.HashMap;
import java.util.List;

public class PetPojo {

    private int id;

    private HashMap<String,Object> category;

    private String name ;

    private List<String> photoUrls;

    private List<HashMap<String, Object>> tags;

    private String status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<String, Object> getCategory() {
        return category;
    }

    public void setCategory(HashMap<String, Object> category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public List<HashMap<String, Object>> getTags() {
        return tags;
    }

    public void setTags(List<HashMap<String, Object>> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    private Integer id2;
//    private String name1;
//
//    public Integer getId2() {
//        return id2;
//    }
//
//    public void setId2(Integer id2) {
//        this.id2 = id2;
//    }
//
//    public String getName1() {
//        return name1;
//    }
//
//    public void setName1(String name1) {
//        this.name1 = name1;
//    }
//
//    private Long id1;
//    private String category;
//    private String name2;
//    private List<String> photoUrls = null;
//    private List<?> tags = null;
//    private String status;
//
//    public Long getId1() {
//        return id1;
//    }
//
//    public void setId1(Integer id1) {
//        this.id1 = Long.valueOf(id1);
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public String getName2() {
//        return name2;
//    }
//
//    public void setName2(String name2) {
//        this.name2 = name2;
//    }
//
//    public List<String> getPhotoUrls() {
//        return photoUrls;
//    }
//
//    public void setPhotoUrls(List<String> photoUrls) {
//        this.photoUrls = photoUrls;
//    }
//
//    public List<?> getTags() {
//        return tags;
//    }
//
//    public void setTags(List<?> tags) {
//        this.tags = tags;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    private Integer id3;
//    private String name3;
//
//    public Integer getId3() {
//        return id3;
//    }
//
//    public void setId3(Integer id3) {
//        this.id3 = id3;
//    }
//
//    public String getName3() {
//        return name3;
//    }
//
//    public void setName3(String name3) {
//        this.name3 = name3;
//    }
}
