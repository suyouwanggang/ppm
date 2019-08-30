import javax.ejb.Local;

@Local
public class HelloManagerEJB  implements  HelloManager{

    @Override
    public String sayHello(String name) {
        return "hello"+name;
    }
}
