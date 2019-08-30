import javax.ejb.Stateless;

@Stateless
public interface HelloManager {
    public String sayHello(String name);
}
