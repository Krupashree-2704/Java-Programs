/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2024-03-27 16:18:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class ActivityYoga_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/Header.jsp", Long.valueOf(1491890180000L));
    _jspx_dependants.put("/MainHeader.jsp", Long.valueOf(1491890180000L));
    _jspx_dependants.put("/GFooter.jsp", Long.valueOf(1491890180000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Guest | Yoga</title>\n");
      out.write("<link rel=\"icon\" href=\"photo's/goldenGym1.ico\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	");
      out.write('\n');
      out.write("<link rel=\"stylesheet\" href=\"css/w3.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"css/font-awesome-4.5.0/css/font-awesome.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />\n");
      out.write("<link src=\"css/GoldenGym.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<link rel=\"icon\" href=\"photo's/goldenGym1.ico\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"css/w3-theme-teal.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />	\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" <!-- \n");
      out.write("<link href=\"css/w3-theme-blue.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />\n");
      out.write(" -->\n");
      out.write("<!-- \n");
      out.write("<link href=\"css/w3-theme-yellow.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />	\n");
      out.write("\n");
      out.write("<link href=\"css/w3-theme-w3schools.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />	\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"css/w3-theme-teal.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />	\n");
      out.write("\n");
      out.write("<link href=\"css/w3-theme-red.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />	\n");
      out.write("\n");
      out.write("<link href=\"css/w3-theme-purple.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />	\n");
      out.write("\n");
      out.write("<link href=\"css/w3-theme-pink.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />	\n");
      out.write("\n");
      out.write("<link href=\"css/w3-theme-orange.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />	\n");
      out.write("\n");
      out.write("<link href=\"css/w3-theme-lime.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />	\n");
      out.write("\n");
      out.write("<link href=\"css/w3-theme-light-green.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />	\n");
      out.write("\n");
      out.write("<link href=\"css/w3-theme-light-blue.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />	\n");
      out.write("\n");
      out.write("<link href=\"css/w3-theme-khaki.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />	\n");
      out.write("\n");
      out.write("<link href=\"css/w3-theme-indigo.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />	\n");
      out.write("\n");
      out.write("<link href=\"css/w3-theme-grey.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />	\n");
      out.write("\n");
      out.write("<link href=\"css/w3-theme-green.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />	\n");
      out.write("\n");
      out.write("<link href=\"css/w3-theme-deep-purple.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />\n");
      out.write("\n");
      out.write(" \n");
      out.write("<link href=\"css/w3-theme-dark-grey.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />\n");
      out.write("\n");
      out.write("<link href=\"css/w3-theme-cyan.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />\n");
      out.write("\n");
      out.write("<link href=\"css/w3-theme-brown.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />\n");
      out.write("	\n");
      out.write("<link href=\"css/w3-theme-blue.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />\n");
      out.write("\n");
      out.write("<link href=\"css/w3-theme-black.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"css/w3-theme-blue-grey.css\" rel=\"stylesheet\"\n");
      out.write("	type=\"text/css\" />\n");
      out.write(" -->\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"icon\" href=\"photo's/goldenGym1.ico\" />\n");
      out.write("<body onload=\"logoEffect()\">\n");
      out.write("	<img src=\"photo's/goldenGym.PNG\" id=\"logo\" height=\"100\" width=\"230\"\n");
      out.write("		class=\"w3-animate-top\" />\n");
      out.write("	\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("   \n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<noscript>\n");
      out.write("	<meta HTTP-EQUIV=\"Refresh\" CONTENT=\"0;URL=JavaScriptErrorPage.html\">\n");
      out.write("</noscript>\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("input {\n");
      out.write("	outline: 0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("textarea {\n");
      out.write("	outline: 0px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("	function logoEffect() {\n");
      out.write("		$(\"#logo\").css({\n");
      out.write("			\"transition\" : \"2s all\",\n");
      out.write("			\"transform\" : \"rotateY(360deg)\"\n");
      out.write("		});\n");
      out.write("	}\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("	<nav class=\" navbar navbar-default w3-theme w3-card-8 w3-animate-top\">\n");
      out.write("		<div class=\"container-fluid \">\n");
      out.write("			<div class=\"navbar-header\">\n");
      out.write("				<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("					data-target=\"#myNavbar\">\n");
      out.write("					<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("						class=\"icon-bar\"></span>\n");
      out.write("				</button>\n");
      out.write("\n");
      out.write("			</div>\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("				<ul class=\"nav navbar-nav\" id=\"menu\">\n");
      out.write("					<li><a href=\"index.jsp\" id=\"home\"><i class=\"fa-home fa\"\n");
      out.write("							style=\"font-size: 24px\"> Home</i></a></li>\n");
      out.write("					<li class=\"dropdown\" id=\"activity\"><a class=\"dropdown-toggle\"\n");
      out.write("						data-toggle=\"dropdown\" href=\"#\"><i class=\"fa fa-sitemap\"\n");
      out.write("							style=\"font-size: 24px\"> Activity</i><span class=\"caret\"></span></a>\n");
      out.write("						<ul class=\"dropdown-menu\">\n");
      out.write("							<li><a href=\"ActivityYoga.jsp\">Yoga</a></li>\n");
      out.write("							<li><a href=\"ActivityPranayam.jsp\">Pranayam</a></li>\n");
      out.write("							<li><a href=\"ActivityStretching.jsp\">Stretching</a></li>\n");
      out.write("							<li><a href=\"#\">CARDAIO</a></li>\n");
      out.write("						</ul></li>\n");
      out.write("					<li class=\"dropdown\" id=\"activity\"><a class=\"dropdown-toggle\"\n");
      out.write("						data-toggle=\"dropdown\" href=\"#\"><i class=\"fa-bolt fa\"\n");
      out.write("							style=\"font-size: 24px\"> Gym</i><span class=\"caret\"></span></a>\n");
      out.write("						<ul class=\"dropdown-menu\">\n");
      out.write("							<li class=\"w3-theme\"></li>\n");
      out.write("							<li><a href=\"Equipments.jsp\">Equipment</a></li>\n");
      out.write("							<li><a href=\"UserPackageListServlet\">Package</a></li>\n");
      out.write("							<li><a href=\"GuestScheduleListServlet\">Schedule</a></li>\n");
      out.write("							<li><a href=\"GuestTrainerIntro.jsp\">Trainer</a></li>\n");
      out.write("\n");
      out.write("						</ul></li>\n");
      out.write("\n");
      out.write("					<li id=\"About\"><a href=\"AboutUS.jsp\"><i class=\"fa-user fa\"\n");
      out.write("							style=\"font-size: 24px;\"> About Us</i></a></li>\n");
      out.write("					<li id=\"Contact\"><a href=\"Contact-us.jsp\"><i\n");
      out.write("							class=\"fa-phone fa\" style=\"font-size: 24px;\"> Contact Us</i></a></li>\n");
      out.write("				</ul>\n");
      out.write("				<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("					<li id=\"logIn\"><a href=\"LoginPage.jsp\"><span\n");
      out.write("							class=\"fa fa-lock\"></span> Login</a></li>\n");
      out.write("				</ul>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</nav>\n");
      out.write("	<script>\n");
      out.write("		$(document)\n");
      out.write("				.ready(\n");
      out.write("						function() {\n");
      out.write("							$(\n");
      out.write("									\"#home,#logIn ,  #activity ,#Equipment , #gym , #About ,#Contact , #member\")\n");
      out.write("									.mouseleave(function() {\n");
      out.write("										$(this).addClass(\"w3-theme \");\n");
      out.write("										$(this).css({\n");
      out.write("											\"transition\" : \"1s\"\n");
      out.write("										});\n");
      out.write("										$(this).removeClass(\"w3-card-16 \");\n");
      out.write("									});\n");
      out.write("\n");
      out.write("							$(\n");
      out.write("									\"#home,#logIn  , #activity ,#Equipment , #gym, #About ,#Contact , #member\")\n");
      out.write("									.mouseenter(\n");
      out.write("											function() {\n");
      out.write("												$(this).addClass(\n");
      out.write("														\"w3-white w3-card-16\");\n");
      out.write("												$(this).removeClass(\"w3-theme\");\n");
      out.write("											});\n");
      out.write("						});\n");
      out.write("	</script>");
      out.write("\n");
      out.write("	<div class=\"w3-container\">\n");
      out.write("		<div class=\"w3-quarter \">\n");
      out.write("			<img class=\"w3-circle  w3-animate-zoom\" alt=\"yoga\"\n");
      out.write("				src=\"photo's/Yoga2.jpg\" width=\"90%\" />\n");
      out.write("		</div>\n");
      out.write("		<div class=\"w3-half\">\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div>\n");
      out.write("					<strong>Intensity Level: </strong>Medium\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<br />\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div class=\"w3-col m11\">\n");
      out.write("					<p style=\"text-align: justify;\">The intensity of your yoga\n");
      out.write("						workout depends on which form of yoga you choose. Techniques like\n");
      out.write("						hatha and iyengar yoga are gentle and slow. Bikram and power yoga\n");
      out.write("						are faster and more challenging.</p>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div>\n");
      out.write("					<strong>Areas It Targets Core :</strong>Yes\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<br />\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div class=\"w3-col m11\">\n");
      out.write("					<p style=\"text-align: justify;\">There are yoga poses to target\n");
      out.write("						just about every core muscle. Want to tighten those love handles?\n");
      out.write("						Then prop yourself up on one arm and do a side plank. To really\n");
      out.write("						burn out the middle of your abs, you can do boat pose, in which\n");
      out.write("						you balance on your sit bones and hold your legs up in the air.</p>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			<br />\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div>\n");
      out.write("					<strong>Arms :</strong>Yes\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<br />\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div class=\"w3-col m11\">\n");
      out.write("					<p style=\"text-align: justify;\">With yoga, you don't build arm\n");
      out.write("						strength with free weights or machines, but with the weight of\n");
      out.write("						your own body. Some poses, like the plank, spread your weight\n");
      out.write("						equally between your arms and legs. Others, like the crane and\n");
      out.write("						crow poses, challenge your arms even more by making them support\n");
      out.write("						your full body weight.</p>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("			<br />\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div>\n");
      out.write("					<strong>Legs : </strong>Yes\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<br />\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div class=\"w3-col m11\">\n");
      out.write("					<p style=\"text-align: justify;\">Yoga poses work all sides of\n");
      out.write("						the legs, including your quadriceps, hips, and thighs.</p>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			<br />\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div>\n");
      out.write("					<strong>Glutes:</strong>Yes\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<br />\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div class=\"w3-col m11\">\n");
      out.write("					<p style=\"text-align: justify;\">Yoga squats, bridges, and\n");
      out.write("						warrior poses involve deep knee bends, which give you a more\n");
      out.write("						sculpted rear.</p>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			<br />\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div>\n");
      out.write("					<strong>Back : </strong>Yes\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<br />\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div class=\"w3-col m11\">\n");
      out.write("					<p style=\"text-align: justify;\">Moves like downward-facing dog,\n");
      out.write("						child's pose, and cat/cow give your back muscles a good stretch.\n");
      out.write("						It's no wonder that research finds yoga is good for relieving a\n");
      out.write("						sore back.</p>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			<br />\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div>\n");
      out.write("					<strong>Type Flexibility: </strong>Yes\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<br />\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div class=\"w3-col m11\">\n");
      out.write("					<p style=\"text-align: justify;\">Yoga poses stretch your muscles\n");
      out.write("						and increase your range of motion. With regular practice, they'll\n");
      out.write("						improve your flexibility.</p>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			<br />\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div>\n");
      out.write("					<strong> Aerobic: </strong>No\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<br />\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div class=\"w3-col m11\">\n");
      out.write("					<p style=\"text-align: justify;\">Yoga isn't considered aerobic\n");
      out.write("						exercise, but the more athletic varieties, like power yoga, will\n");
      out.write("						make you sweat. And even though yoga is not aerobic, research\n");
      out.write("						finds it's just as good as aerobic exercise for improving health.\n");
      out.write("					</p>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			<br />\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div>\n");
      out.write("					<strong> Strength: </strong>Yes\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<br />\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div class=\"w3-col m11\">\n");
      out.write("					<p style=\"text-align: justify;\">It takes a lot of strength to\n");
      out.write("						hold your body in a balanced pose. Regular practice will\n");
      out.write("						strengthen the muscles of your arms, back, legs, and core.</p>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			<br />\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div>\n");
      out.write("					<strong> Sport: </strong>No\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<br />\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div class=\"w3-col m11\">\n");
      out.write("					<p style=\"text-align: justify;\">Yoga is not competitive. Focus\n");
      out.write("						on your own practice and don't compare yourself to other people in\n");
      out.write("						your class.</p>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			<br />\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div>\n");
      out.write("					<strong> Low-Impact: </strong>Yes\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<br />\n");
      out.write("			<div class=\"w3-row\">\n");
      out.write("				<div class=\"w3-col m11\">\n");
      out.write("					<p style=\"text-align: justify;\">Although yoga will give you a\n");
      out.write("						full-body workout, it won't put any impact on your joints. .</p>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("		</div>\n");
      out.write("		<div class=\"w3-quarter\">&nbsp;</div>\n");
      out.write("	</div>\n");
      out.write("	<div style=\"margin-top: 160px;\">\n");
      out.write("\n");
      out.write("		");
      out.write("\n");
      out.write("<footer class=\"w3-container w3-theme-d4\">\n");
      out.write("	<div class=\"w3-row\"\n");
      out.write("		style=\"font-family: cursive; font-stretch: wider; font-size: 25px;\">\n");
      out.write("		<div class=\"w3-col m3\">&nbsp; Gym</div>\n");
      out.write("		<div class=\"w3-col s1\">&nbsp;</div>\n");
      out.write("		<div class=\"w3-col m2 \">\n");
      out.write("			<i class=\"fa fa-sitemap\"></i> Activity\n");
      out.write("		</div>\n");
      out.write("		<div class=\"w3-col s1\">&nbsp;</div>\n");
      out.write("		<div class=\"w3-col m2 \">\n");
      out.write("			");

				if (session.getAttribute("memberBean") == null
						&& session.getAttribute("adminBean") == null
						&& session.getAttribute("trainerBean") == null) {
			
      out.write("\n");
      out.write("			<i class=\"fa fa-phone\"></i> <a href=\"Contact-us.jsp\"\n");
      out.write("				style=\"cursor: help;\"> Contact Us</a>\n");
      out.write("			");

				} else if (session.getAttribute("trainerBean") != null) {
			
      out.write("\n");
      out.write("			<i class=\"fa fa-phone\"></i> <a href=\"TrainerContact-US.jsp\"\n");
      out.write("				style=\"cursor: help;\"> Contact Us</a>\n");
      out.write("			 		\n");
      out.write("			 		");
} 
      out.write("\n");
      out.write("			 		</div>\n");
      out.write("		<div class=\"w3-col s1\">&nbsp;</div>\n");
      out.write("		<div class=\"w3-col m2\">\n");
      out.write("			<a href=\"AboutUS.jsp\"><i class=\"fa-group fa\"></i> About Us</a>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	<div class=\"w3-row\" style=\"font-family: cursive; font-stretch: wider;\">\n");
      out.write("		<div class=\"w3-col m3 \">\n");
      out.write("			&nbsp;<a href=\"Equipments.jsp\"> Equipment</a>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"w3-col s1\">&nbsp;</div>\n");
      out.write("		<div class=\"w3-col m2 \">\n");
      out.write("			<a href=\"AboutUS.jsp\">Yoga</a>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"w3-col s1\">&nbsp;</div>\n");
      out.write("		<div class=\"w3-col m2 \">&nbsp;</div>\n");
      out.write("		<div class=\"w3-col s1\">&nbsp;</div>\n");
      out.write("		<div class=\"w3-col m2 \">&nbsp;</div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	<div class=\"w3-row\" style=\"font-family: cursive; font-stretch: wider;\">\n");
      out.write("		<div class=\"w3-col m3 \">\n");
      out.write("			&nbsp;<a href=\"GuestTrainerIntro.jsp\"> Trainers</a>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"w3-col s1\">&nbsp;</div>\n");
      out.write("		<div class=\"w3-col m2 \">\n");
      out.write("			<a href=\"#\">Pranayam</a>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	<div class=\"w3-row\" style=\"font-family: cursive; font-stretch: wider;\">\n");
      out.write("		<div class=\"w3-col m3 \">\n");
      out.write("			<a href=\"#\"> &nbsp; Schedule</a>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"w3-col s1\">&nbsp;</div>\n");
      out.write("		<div class=\"w3-col m2 \">\n");
      out.write("			<a href=\"#\">Stretching</a>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	<div class=\"w3-row\" style=\"font-family: cursive; font-stretch: wider;\">\n");
      out.write("		<div class=\"w3-col m3 \">&nbsp;</div>\n");
      out.write("		<div class=\"w3-col s1\">&nbsp;</div>\n");
      out.write("		<div class=\"w3-col m2 \">\n");
      out.write("			<a href=\"#\">ABS</a>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	<div class=\"w3-row\" style=\"font-family: cursive; font-stretch: wider;\">\n");
      out.write("		<div class=\"w3-col m3 \">&nbsp;</div>\n");
      out.write("		<div class=\"w3-col s1\">&nbsp;</div>\n");
      out.write("		<div class=\"w3-col m2 \">\n");
      out.write("			<a href=\"#\">CARDAIO</a>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("	</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
