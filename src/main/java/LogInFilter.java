import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.Cookie;

public class LogInFilter implements Filter{
    FilterConfig config;
    static int count=0;

    public void init(FilterConfig config) throws ServletException {
        this.config=config;
    }

    public void doFilter(ServletRequest req, ServletResponse resp,
                         FilterChain chain) throws IOException, ServletException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();

        String access = config.getInitParameter("access");
        if(access.equalsIgnoreCase("yes")){
            out.print("you have access(Filter) <br>");
            chain.doFilter(req,resp);
        }else
        {
            out.print("you haven't access (Filter)<br>");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
            requestDispatcher.include(req,resp);
        }

    }
    public void destroy() {}
}
