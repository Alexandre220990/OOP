package problemsolvingweek5.exerciseb;

//Dimension.java
/*This instantiable class represents the dimensions of an object in terms of length, width and height*/

public class Dimension {
    private int length;
    private int width;
    private int height;

    public Dimension(int length, int width, int height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String toString() {
        return  "Length: " + getLength() + "  Width: " + getWidth() + "  Height: " + getHeight();
    }
}
