package org.najot.model;

public class ImageUpload {
    private String imageName;
    private StringBuilder message;

    public ImageUpload() {
    }

    public ImageUpload(String imageName, StringBuilder message) {
        this.imageName = imageName;
        this.message = message;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public StringBuilder getMessage() {
        return message;
    }

    public void setMessage(StringBuilder message) {
        this.message = message;
    }
}
