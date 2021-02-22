import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.Cookie;

public class RegistrationFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        PrintWriter out=resp.getWriter();
        resp.setContentType("text/html");

        String name = req.getParameter("name");
        String lastName = req.getParameter("lastName");
        String password = req.getParameter("password");

        out.println("Validation (Filter) <br>");

        if(name.length()<2 || lastName.length()<2 || password.length()<6){
            out.print("Weak password");
            RequestDispatcher rd=req.getRequestDispatcher("registration.jsp");
            rd.include(req, resp);
        }else{
            chain.doFilter(req,resp);
        }
    }

    @Override
    public void destroy() {

    }
}
