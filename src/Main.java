import jdk.jfr.Name;
import jdk.jfr.DataAmount;
import java.util.ArrayList;
@Name ("Ruslan"
)
@DataAmount("21/04/2004")



public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        ArrayList<String> name = new ArrayList<String>();
        name.add("10000000");
        name.add("10100002200");
        name.add("9000000");
        name.add("2000000");
        for (int i = 0; i < name.size(); i++) {
        }
            ArrayList<String> mame = new ArrayList<String>();
            for (int i = 0; i < name.size(); i++) {
                mame.add("chill");
                mame.add("FunChill");
                mame.add("Fune");
                mame.add("qdfw");
                System.out.println(name.get(i) + "" + cars.get(i)+ "" + mame.get(i));
            }
        }
    }
