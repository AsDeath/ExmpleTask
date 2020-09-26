// Chapter 8 task 4
// Chapter 8 task 4
// Chapter 8 task 4

public class Rectangle {
    private float length = (float) 1.0;
    private float width = (float) 1.0;
    Rectangle(float length, float width){
        setLength(length);
        setWidth(width);
    }

    public float calculatePerimeter(){
        float perimeter = 2*(length+width);
        return perimeter;
    }

    public float calculateArea(){
        float area = length*width;
        return area;
    }

    public void setLength(float length){
        if(length>0.0 && length<20.0){
            this.length = length;
        } else System.out.println("Wrong length");
    }
    public void setWidth(float width){
        if(width>0.0 && width<20.0){
            this.width = width;
        } else System.out.println("Wrong width");
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }
}
