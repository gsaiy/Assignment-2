import java.util.ArrayList;
import propertymanagement.Apartments;
import propertymanagement.Bungalow;
import propertymanagement.Property;
import propertymanagement.Tenaments;

public class Application {
    public static void main(String[] args) {
        ArrayList <Property> lis=new ArrayList<>();
        Tenaments tenobj=new Tenaments();
        Apartments apaobj=new Apartments();
        Bungalow bunobj=new Bungalow();
        lis.add(tenobj);
        lis.add(apaobj);
        lis.add(bunobj);
        for(Property x: lis)
        {
            x.buy();
            x.sell();
        }
    }
}
