package practice.geometric_objects.shape;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape(){
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        if (filled){
            return "A Shape with color of " + color +
                    " and filled";
        } else {
            return "A Shape with color of " + color +
                    " and not filled";
        }
    }
}
