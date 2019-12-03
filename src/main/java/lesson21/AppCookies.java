package lesson21;

import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * servlet located at:
 * http://localhost:9001/c?x=2
 * http://localhost:9001/c?x=2&y=3
 */
public class AppCookies {
  public static void main(String[] args) throws Exception {
    DataStorage ds = new DataStorage();
    ServletContextHandler handler = new ServletContextHandler();
    handler.addServlet(LoginServlet.class , "/login/*");
    handler.addServlet(LogoutServlet.class , "/logout/*");
    handler.addServlet(new ServletHolder(new CalcServlet(ds)), "/c/*");
    handler.addServlet(new ServletHolder(new HistoryServlet(ds)), "/h/*");
  }
}