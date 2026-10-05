package hu.example;

public class Table {
    private int width, length, height, currentHeight;
    private boolean isAdjustable;

    public Table(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.currentHeight = height;
        this.isAdjustable = false;
    }
    public Table(int width, int length, int height, int currentHeight) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.currentHeight = currentHeight;
        this.isAdjustable = true;
    }

    public void setHeight(int newHeight) {
        if (this.isAdjustable && newHeight >= 0 && newHeight <= 200) {
            this.currentHeight = newHeight;
        }
    }
    public int area() {
        return this.width * this.length;
    }
    public int getCapacity () {
        int person = 2 * (this.width + this.length);
        return person / 60; 
    }
    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }
    public int getLength() {
        return this.length;

    }
    public int getCurrentHeight() {
        return  this.currentHeight;
    }
    public boolean isAdjustable() {
        return  this.isAdjustable;
    }
}
