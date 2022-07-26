/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-07-21 03:06:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<link href=\"../assets/css/login.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("	<div class=\"joincontainer\">\n");
      out.write("		<div class=\"overlay\" id=\"overlay\">\n");
      out.write("			<div class=\"sign-in\" id=\"sign-in\">\n");
      out.write("				<h1>Welcome Back!</h1>\n");
      out.write("				<p>To keep connected with us please login with your personal\n");
      out.write("					info</p>\n");
      out.write("				<button class=\"switch-button\" id=\"slide-right-button\">Sign\n");
      out.write("					In</button>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"sign-up\" id=\"sign-up\">\n");
      out.write("				<h1>Hello, Friend!</h1>\n");
      out.write("				<p>Enter your personal details and start a journey with us</p>\n");
      out.write("				<button class=\"switch-button\" id=\"slide-left-button\">Sign\n");
      out.write("					Up</button>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"form\">\n");
      out.write("			<div class=\"sign-in\" id=\"sign-in-info\">\n");
      out.write("				<h1>Sign In</h1>\n");
      out.write("				<div class=\"social-media-buttons\">\n");
      out.write("					<div class=\"icon\">\n");
      out.write("						<svg viewBox=\"0 0 24 24\">\n");
      out.write("            <path fill=\"#000000\"\n");
      out.write("								d=\"M17,2V2H17V6H15C14.31,6 14,6.81 14,7.5V10H14L17,10V14H14V22H10V14H7V10H10V6A4,4 0 0,1 14,2H17Z\" />\n");
      out.write("        </svg>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"icon\">\n");
      out.write("						<svg viewBox=\"0 0 24 24\">\n");
      out.write("            <path fill=\"#000000\"\n");
      out.write("								d=\"M23,11H21V9H19V11H17V13H19V15H21V13H23M8,11V13.4H12C11.8,14.4 10.8,16.4 8,16.4C5.6,16.4 3.7,14.4 3.7,12C3.7,9.6 5.6,7.6 8,7.6C9.4,7.6 10.3,8.2 10.8,8.7L12.7,6.9C11.5,5.7 9.9,5 8,5C4.1,5 1,8.1 1,12C1,15.9 4.1,19 8,19C12,19 14.7,16.2 14.7,12.2C14.7,11.7 14.7,11.4 14.6,11H8Z\" />\n");
      out.write("        </svg>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"icon\">\n");
      out.write("						<svg viewBox=\"0 0 24 24\">\n");
      out.write("          <path fill=\"#000000\"\n");
      out.write("								d=\"M21,21H17V14.25C17,13.19 15.81,12.31 14.75,12.31C13.69,12.31 13,13.19 13,14.25V21H9V9H13V11C13.66,9.93 15.36,9.24 16.5,9.24C19,9.24 21,11.28 21,13.75V21M7,21H3V9H7V21M5,3A2,2 0 0,1 7,5A2,2 0 0,1 5,7A2,2 0 0,1 3,5A2,2 0 0,1 5,3Z\" />\n");
      out.write("        </svg>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("				<p class=\"small\">or use your email account:</p>\n");
      out.write("				<form id=\"sign-in-form\">\n");
      out.write("					<input type=\"email\" placeholder=\"Email\" /> <input type=\"password\"\n");
      out.write("						placeholder=\"Password\" />\n");
      out.write("					<p class=\"forgot-password\">Forgot your password?</p>\n");
      out.write("					<button class=\"control-button in\">Sign In</button>\n");
      out.write("				</form>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"sign-up\" id=\"sign-up-info\">\n");
      out.write("				<h1>Create Account</h1>\n");
      out.write("				<div class=\"social-media-buttons\">\n");
      out.write("					<div class=\"icon\">\n");
      out.write("						<svg viewBox=\"0 0 24 24\">\n");
      out.write("            <path fill=\"#000000\"\n");
      out.write("								d=\"M17,2V2H17V6H15C14.31,6 14,6.81 14,7.5V10H14L17,10V14H14V22H10V14H7V10H10V6A4,4 0 0,1 14,2H17Z\" />\n");
      out.write("        </svg>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"icon\">\n");
      out.write("						<svg viewBox=\"0 0 24 24\">\n");
      out.write("            <path fill=\"#000000\"\n");
      out.write("								d=\"M23,11H21V9H19V11H17V13H19V15H21V13H23M8,11V13.4H12C11.8,14.4 10.8,16.4 8,16.4C5.6,16.4 3.7,14.4 3.7,12C3.7,9.6 5.6,7.6 8,7.6C9.4,7.6 10.3,8.2 10.8,8.7L12.7,6.9C11.5,5.7 9.9,5 8,5C4.1,5 1,8.1 1,12C1,15.9 4.1,19 8,19C12,19 14.7,16.2 14.7,12.2C14.7,11.7 14.7,11.4 14.6,11H8Z\" />\n");
      out.write("        </svg>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"icon\">\n");
      out.write("						<svg viewBox=\"0 0 24 24\">\n");
      out.write("          <path fill=\"#000000\"\n");
      out.write("								d=\"M21,21H17V14.25C17,13.19 15.81,12.31 14.75,12.31C13.69,12.31 13,13.19 13,14.25V21H9V9H13V11C13.66,9.93 15.36,9.24 16.5,9.24C19,9.24 21,11.28 21,13.75V21M7,21H3V9H7V21M5,3A2,2 0 0,1 7,5A2,2 0 0,1 5,7A2,2 0 0,1 3,5A2,2 0 0,1 5,3Z\" />\n");
      out.write("        </svg>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("				<p class=\"small\">or use your email for registration:</p>\n");
      out.write("				<form id=\"sign-up-form\">\n");
      out.write("					<input type=\"text\" placeholder=\"Name\" /> <input type=\"email\"\n");
      out.write("						placeholder=\"Email\" /> <input type=\"password\"\n");
      out.write("						placeholder=\"Password\" />\n");
      out.write("					<button class=\"control-button up\">Sign Up</button>\n");
      out.write("				</form>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write("\n");
      out.write("	  <script  src=\"./script.js\"></script>\n");
      out.write("	\n");
      out.write("</body>\n");
      out.write("</html>");
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
