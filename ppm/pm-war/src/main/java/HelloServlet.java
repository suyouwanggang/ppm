import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(  urlPatterns = {"/Hello","/Test"} )
public class HelloServlet extends HttpServlet {

    @EJB
    private HelloManager helloManager;

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        HttpServletResponse response=(HttpServletResponse  )res;

    }
}
