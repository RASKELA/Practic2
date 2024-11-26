package org.colladge.practice2.task1;

import java.util.ArrayList;
import java.util.HashMap;

class Gallery {
    private static HashMap<String, Gallery> instances = new HashMap<>();
    private ArrayList<Picture> pictures;
    private String name;
    private String article;

    private Gallery(String name) {
        this.name = name;
        this.pictures = new ArrayList<>();
    }

    public static Gallery getInstance(String name) {
        if (!instances.containsKey(name)) {
            instances.put(name, new Gallery(name));
        }
        return instances.get(name);
    }

    public boolean addPicture(Picture picture) {
        return pictures.add(picture);
    }

    public boolean removePicture(Picture picture) {
        return pictures.remove(picture);
    }

    public String describePicture(Picture picture) {
        if (pictures.contains(picture)) {
            return picture.toString();
        }
        return "org.colladge.practice2.task1.Picture not found in the gallery.";
    }

    public Picture getPicture(String name) {
        for (Picture picture : pictures) {
            if (picture.getName().equals(name)) {
                return picture;
            }
        }
        return null;
    }

    public Picture[] getPictures() {
        return pictures.toArray(new Picture[0]);
    }

    public long getPictureCount() {
        return pictures.size();
    }

    public String getName() {
        return name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }
}