/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.12.v20180830
 * Generated at: 2024-03-28 06:14:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;
import uts.isd.model.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("uts.isd.model");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Random");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                background: url('feit.jpg') no-repeat center center; /*center center fixed; */\r\n");
      out.write("                /*\r\n");
      out.write("                -webkit-background-size: cover;\r\n");
      out.write("                -moz-background-size: cover;\r\n");
      out.write("                -o-background-size: cover;\r\n");
      out.write("                background-size: cover;  \r\n");
      out.write("                */\r\n");
      out.write("                width: 200px;\r\n");
      out.write("                height: 200px;\r\n");
      out.write("                background-size: contain;\r\n");
      out.write("                border-radius: 50%;\r\n");
      out.write("                letter-spacing: 4px;\r\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #bar {\r\n");
      out.write("                position: fixed;\r\n");
      out.write("                background-color: #134c5b;\r\n");
      out.write("                padding: 10px 5px 6px 15px;\r\n");
      out.write("                color: white;\r\n");
      out.write("                font-size: 30px;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                top: 0;\r\n");
      out.write("                left: 0;\r\n");
      out.write("                right: 0;\r\n");
      out.write("                opacity: 0.7;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #links {\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("                padding: 5px;\r\n");
      out.write("                word-spacing: 2px;\r\n");
      out.write("                float: right;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .footer {\r\n");
      out.write("                position: fixed;\r\n");
      out.write("                background-color: #134c5b;\r\n");
      out.write("                left: 0;\r\n");
      out.write("                right: 0;\r\n");
      out.write("                bottom: 0;\r\n");
      out.write("                font-size: 36px;\r\n");
      out.write("                color: #afeb00;\r\n");
      out.write("                padding: 3px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                opacity: 0.7;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .message {\r\n");
      out.write("                color: #4caf50;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                font-size: 20px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            input {\r\n");
      out.write("                margin-bottom: 16px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("        <title>Register</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body >\r\n");
      out.write("        ");

            String email = request.getParameter("email");
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            String tos = request.getParameter("tos");
            String submitted = request.getParameter("submitted");

            if (submitted != null){
                User user = new User(email, name, password);
                session.setAttribute("user", user);
            }
        
      out.write("\r\n");
      out.write("        ");
 if (submitted != null) { 
      out.write("\r\n");
      out.write("            <h1>Welcome</h1>\r\n");
      out.write("            <h2>You have succesfully registered!</h2>\r\n");
      out.write("            <button><a href=\"/login.jsp\">Login.</a></button>\r\n");
      out.write("            </br>\r\n");
      out.write("            </br>\r\n");
      out.write("            <button><a href=\"/logout.jsp\">Logout.</a>\r\n");
      out.write("\r\n");
      out.write("        ");
 } else { 
      out.write("\r\n");
      out.write("        <form>\r\n");
      out.write("            <label for=\"email\">Email:</label>\r\n");
      out.write("            <input type=\"email\" name=\"email\" id=\"email\" placeholder=\"email\" required/>\r\n");
      out.write("            <label for=\"name\">Name:</label>\r\n");
      out.write("            <input name=\"name\" id=\"name\" placeholder=\"name\" />\r\n");
      out.write("            <label for=\"password\">Password:</label>\r\n");
      out.write("            <input type=\"password\" name=\"password\" id=\"password\" placeholder=\"password\" />\r\n");
      out.write("            <br/>\r\n");
      out.write("            <label for=\"tos\">TOS:</label>\r\n");
      out.write("            <input type=\"checkbox\" name=\"tos\" id=\"tos\" placeholder=\"tos\" />\r\n");
      out.write("            <br/>\r\n");
      out.write("            <input type=\"hidden\" name=\"submitted\" id=\"submitted\" value=\"true\" />\r\n");
      out.write("            <button type=\"submit\">Register Account</button>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <button><a href=\"/\">Cancel Registration</a></button>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
