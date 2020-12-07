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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, intial-scale=1.0\">\r\n");
      out.write("        <title>Sign in Page</title>\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/64d58efce2.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"cssAll.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"cssSignIn.css\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Poppins:600&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"forms-container\">\r\n");
      out.write("                <div class=\"signin-signup\">\r\n");
      out.write("                    <form action=\"LoginControl\" class=\"sign-in-form\"> ");
      out.write("\r\n");
      out.write("                        <h2 class=\"title\">Sign in</h2>\r\n");
      out.write("                        <div class=\"input-field\">\r\n");
      out.write("                            <i class=\"fas fa-user\"></i>\r\n");
      out.write("                            <input type=\"text\" placeholder=\"Username\" name=\"username\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-field\">\r\n");
      out.write("                            <i class=\"fas fa-lock\"></i>\r\n");
      out.write("                            <input type=\"password\" placeholder=\"Password\" name=\"password\" id=\"password\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <input type=\"checkbox\" onclick=\"myFunction()\"> Show Password\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <input type=\"submit\" value=\"Sign in\" class=\"btn solid\">\r\n");
      out.write("                        <a href=\"/reset_password\" style=\"font-family: initial;\">I forgot my password</a>\r\n");
      out.write("\r\n");
      out.write("                        <p class=\"social-text\">Or Sign in With social platforms</p>\r\n");
      out.write("                        <div class=\"social-media\">\r\n");
      out.write("                            <a href=\"#\" class=\"social-icon\">\r\n");
      out.write("                                <i class=\"fab fa-facebook-f\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"#\" class=\"social-icon\">\r\n");
      out.write("                                <i class=\"fab fa-twitter\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"#\" class=\"social-icon\">\r\n");
      out.write("                                <i class=\"fab fa-google\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"#\" class=\"social-icon\">\r\n");
      out.write("                                <i class=\"fab fa-linkedin-in\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"panels-container\">\r\n");
      out.write("                <div class=\"panel left-panel\">\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <h3>New here?</h3>\r\n");
      out.write("                        <p>\r\n");
      out.write("                            If you do not have an account,\r\n");
      out.write("                            please press this button to register an new account!\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <button class=\"btn transparent\" onclick=\"location.href = 'SignUp.jsp'\">Sign up</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <img src=\"signIn.svg\" class=\"image\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>  \r\n");
      out.write("        <script type=\"text/javascript\" src=\"js2.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
