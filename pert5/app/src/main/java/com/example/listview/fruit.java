package com.example.listview;

public class fruit {
    private int photoId;
    private String name;
    private String price;

    public fruit(int photoId, String name, String price) {
        this.photoId = photoId;
        this.name = name;
        this.price = price;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
