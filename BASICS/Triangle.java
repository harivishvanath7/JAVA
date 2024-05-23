class AreaTriangle{
    int x;
    int y;
    void calcArea(){
        System.out.println("The Area is : " + (x * y)/2);
    }
}

public class Triangle {
    public static void main(String[]args){
        AreaTriangle a = new AreaTriangle();
        a.x = 20;
        a.y = 40;

        a.calcArea();
    }
}
