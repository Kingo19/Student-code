public class encapslation {

 private int x = 5;
 private String y = "King";

public int getX() {
 return x;

}
public void setX(int x) {
 this.x = x;
}

public String getY() {
 return y;
}

public void setY(String y) {

 this.y = y;
}

 public int addTo () {
 return x + 2;

 }

public static void main(String[] args) {
 encapslation Yotor = new encapslation();
 System.out.println(Yotor.x);
 System.out.println(Yotor.addTo());
}
}
