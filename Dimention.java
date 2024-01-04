public class Dimention { // classes are blueprints or design to objects nothing more

    private int height; // understanding concept of data hiding properly
    private int radius; // access is limited with in the class only

    public Dimention(int height, int radius){ // constructor are for each object to have diffrent values as properties when
        // created in the heap
        this.height = height;
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public int getRadius(){
        return radius;
    }

    public void setHeight(int height){ // data hiding are used to set some rules to how data is manuepulate
        // with no direct access
        if(height > 0){
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public void setRadius(int radius){
        if(radius >0){
            this.radius = radius;
        }else {
            this.radius = 0;
        }
    }


    public static void main(String[] args) {


    }
}
