import org.flywaydb.core.Flyway;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class FlywayListener implements ServletContextListener {

    public static Flyway flyway;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        flyway = Flyway.configure().dataSource("jdbc:postgresql://localhost:5432/Media", "postgres", "512HzFe935Aman").load();
        flyway.migrate();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
