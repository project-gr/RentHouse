package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignIn_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, intial-scale=1.0\">\n");
      out.write("        <title>Sign in Page</title>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/64d58efce2.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"cssAll.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Poppins:600&display=swap\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"forms-container\">\n");
      out.write("                <div class=\"signin-signup\">\n");
      out.write("                    <form action=\"LoginControl\" class=\"sign-in-form\"> ");
      out.write("\n");
      out.write("                        <h2 class=\"title\">Sign in</h2>\n");
      out.write("                        <div class=\"input-field\">\n");
      out.write("                            <i class=\"fas fa-user\"></i>\n");
      out.write("                            <input type=\"text\" placeholder=\"Username\" name=\"username\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-field\">\n");
      out.write("                            <i class=\"fas fa-lock\"></i>\n");
      out.write("                            <input type=\"password\" placeholder=\"Password\" name=\"password\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" value=\"Sign in\" class=\"btn solid\">\n");
      out.write("\n");
      out.write("                        <p class=\"social-text\">Or Sign in With social platforms</p>\n");
      out.write("                        <div class=\"social-media\">\n");
      out.write("                            <a href=\"#\" class=\"social-icon\">\n");
      out.write("                                <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"#\" class=\"social-icon\">\n");
      out.write("                                <i class=\"fab fa-twitter\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"#\" class=\"social-icon\">\n");
      out.write("                                <i class=\"fab fa-google\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"#\" class=\"social-icon\">\n");
      out.write("                                <i class=\"fab fa-linkedin-in\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"panels-container\">\n");
      out.write("                <div class=\"panel left-panel\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <h3>New here?</h3>\n");
      out.write("                        <p>\n");
      out.write("                            If you do not have an account,\n");
      out.write("                            please press this button to register an new account!\n");
      out.write("                        </p>\n");
      out.write("                        <button class=\"btn transparent\" onclick=\"location.href = 'SignUp.jsp'\">Sign up</button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <img src=\"signIn.svg\" class=\"image\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
