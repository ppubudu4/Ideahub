package org.apache.jsp.Events;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Connection;
import com.dea.bean.user;

public final class Industry_005fEvent_005fView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <title>Company Dashboard | Smart Hub of NSBM Green University Town </title>\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("    <meta name=\"mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-title\" content=\"NSBM\">\r\n");
      out.write("    <meta name=\"application-name\" content=\"NSBM\">\r\n");
      out.write("\r\n");
      out.write("    <meta property=\"og:type\" content=\"website\" />\r\n");
      out.write("    <meta property=\"og:url\" content=\"news.jsp\" />\r\n");
      out.write("    <meta property=\"og:title\" content=\"NSBM: News and Events\" />\r\n");
      out.write("    <meta property=\"og:description\" content=\"Stay connected with latest announcements and events.\" />\r\n");
      out.write("    <meta property=\"og:image\" content=\"img/about/84573268.jpg\" />\r\n");
      out.write("    <meta property=\"fb:app_id\" content=\"833486563412429\" />\r\n");
      out.write("    <meta name=\"twitter:card\" content=\"summary_large_image\" />\r\n");
      out.write("    <meta name=\"twitter:site\" content=\"@nsbmlk\" />\r\n");
      out.write("    <meta name=\"twitter:creator\" content=\"@nsbmlk\" />\r\n");
      out.write("    <meta name=\"msapplication-TileColor\" content=\"#ffffff\">\r\n");
      out.write("    <meta name=\"msapplication-TileImage\" content=\"img/favicons/mstile-144x144.jsp\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"../img/favicons/apple-touch-icon-57x57.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"../img/favicons/apple-touch-icon-114x114.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"../img/favicons/apple-touch-icon-72x72.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"../img/favicons/apple-touch-icon-144x144.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"60x60\" href=\"../img/favicons/apple-touch-icon-60x60.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"../img/favicons/apple-touch-icon-120x120.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"../img/favicons/apple-touch-icon-76x76.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"152x152\" href=\"../img/favicons/apple-touch-icon-152x152.png\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"../img/favicons/favicon-196x196.png\" sizes=\"196x196\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"../img/favicons/favicon-96x96.png\" sizes=\"96x96\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"../img/favicons/favicon-32x32.png\" sizes=\"32x32\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"../img/favicons/favicon-16x16.png\" sizes=\"16x16\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"../img/favicons/favicon-128x128.png\" sizes=\"128x128\">\r\n");
      out.write("\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,400,600|Roboto:700' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link rel=\"stylesheet\" media=\"screen\" href=\"../build/css/site-19b297a2bc.css\">\r\n");
      out.write("\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"file:///E|/OneDrive/My Uni Life/Projects/2nd Year/J2EE/J2EE Project/apis.google.com/js/platform.js\" async defer></script>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("\r\n");
      out.write("        /* Google Analytics */\r\n");
      out.write("\r\n");
      out.write("        (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function() {\r\n");
      out.write("            (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\r\n");
      out.write("            m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\r\n");
      out.write("        })(window,document,'script','../www.google-analytics.com/analytics.js','ga');\r\n");
      out.write("        ga('create', 'UA-48138541-2', 'auto');\r\n");
      out.write("        ga('send', 'pageview');\r\n");
      out.write("\r\n");
      out.write("        /* Social Media Share Buttons */\r\n");
      out.write("\r\n");
      out.write("        window.fbAsyncInit = function() {\r\n");
      out.write("            FB.init({\r\n");
      out.write("                appId      : '833486563412429',\r\n");
      out.write("                xfbml      : true,\r\n");
      out.write("                version    : 'v2.3'\r\n");
      out.write("            });\r\n");
      out.write("        };\r\n");
      out.write("        (function(d, s, id){\r\n");
      out.write("            var js, fjs = d.getElementsByTagName(s)[0];\r\n");
      out.write("            if (d.getElementById(id)) {return;}\r\n");
      out.write("            js = d.createElement(s); js.id = id;\r\n");
      out.write("            js.src = \"../connect.facebook.net/en_US/sdk.js\";\r\n");
      out.write("            fjs.parentNode.insertBefore(js, fjs);\r\n");
      out.write("        }(document, 'script', 'facebook-jssdk'));\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"fb-root\"></div>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <!--[if lte IE 9]>\r\n");
      out.write("        <p class=\"browsehappy\">You are using an <strong>outdated</strong> browser. Please <a href=\"http://browsehappy.com/\">upgrade your browser</a> to improve your experience.</p>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\t\r\n");
      out.write("    <!-- <div class=\"preloader\"><div class=\"loading-effect\"></div></div> -->\r\n");
      out.write("\r\n");
      out.write("    <div id=\"main-container\">\r\n");
      out.write("\r\n");
      out.write("         <header class=\"hidden-xs\" style=\"height: 92px;\">\r\n");
      out.write("\r\n");
      out.write("       <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-sm-2 col-lg-2\">\r\n");
      out.write("                    <a id=\"logo\" class=\"pull-left img-responsive\" href=\"index.jsp\"><img src=\"../img/logos/nsbm-logo.png\" alt=\"NSBM Logo\" /></a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-sm-10 col-lg-10\" style=\"padding-right: 0px;\">\r\n");
      out.write("\r\n");
      out.write("                   \r\n");
      out.write("\r\n");
      out.write("                    <nav id=\"main-menu\" class=\"pull-right\">\r\n");
      out.write("\r\n");
      out.write("                        <ul class=\"nav-list\">\r\n");
      out.write("\r\n");
      out.write("                            <li class=\"\">\r\n");
      out.write("                                <a href=\"../index.jsp\">Home</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                            <li class=\"\">\r\n");
      out.write("                                <a href=\"#\">Discover NSBM</a>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li class=\"\">\r\n");
      out.write("                                        <a href=\"../about-us.jsp\"><span>About NSBM</span></a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"\">\r\n");
      out.write("                                        <a href=\"../board-of-directors.jsp\"><span>Board of Directors</span></a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"\">\r\n");
      out.write("                                        <a href=\"../faculty.jsp\"><span>Faculty</span></a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"\">\r\n");
      out.write("                                        <a href=\"../green-university.jsp\"><span>Green University</span></a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"\">\r\n");
      out.write("                                        <a href=\"../affiliated-universities.jsp\"><span>Affiliated Universities</span></a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"\">\r\n");
      out.write("                                        <a href=\"../well-wishes.jsp\"><span>Well Wishes</span></a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                            <li class=\"\">\r\n");
      out.write("                                <a href=\"../ideahub/index.jsp\">Idea Hub</a>\r\n");
      out.write("                                \r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                          \r\n");
      out.write("                            \r\n");
      out.write("\r\n");
      out.write("                            <li class=\"\">\r\n");
      out.write("                                <a href=\"../contact.jsp\">Contact Us</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                        </ul> <!-- end.nav-list -->\r\n");
      out.write("\r\n");
      out.write("                    </nav> <!-- end#main-menu -->\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div> <!-- end.row -->\r\n");
      out.write("\r\n");
      out.write("        </div> <!-- end.container -->\r\n");
      out.write("\r\n");
      out.write("    </header>\r\n");
      out.write("        <header class=\"mobile-nav visible-xs\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                        <span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"../index.jsp\">NSBM</a>\r\n");
      out.write("\r\n");
      out.write("                </div> <!-- end.navbar-header -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"collapse navbar-collapse\">\r\n");
      out.write("\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("\r\n");
      out.write("                        <li class=\"\">\r\n");
      out.write("                            <a href=\"../index.jsp\">Home</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li class=\"dropdown \">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Discover NSBM <b class=\"caret\"></b></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li class=\"\">\r\n");
      out.write("                                    <a href=\"../about-us.jsp\"><span>About NSBM</span></a></li>\r\n");
      out.write("                                <li class=\"\">\r\n");
      out.write("                                    <a href=\"../student-life.jsp\"><span>Student Life</span></a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"\">\r\n");
      out.write("                                    <a href=\"../board-of-directors.jsp\"><span>Board of Directors</span></a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"\">\r\n");
      out.write("                                    <a href=\"../faculty.jsp\"><span>Faculty</span></a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"\">\r\n");
      out.write("                                    <a href=\"../green-university.jsp\"><span>Green University</span></a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"\">\r\n");
      out.write("                                    <a href=\"../affiliated-universities.jsp\"><span>Affiliated Universities</span></a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"\">\r\n");
      out.write("                                    <a href=\"../well-wishes.jsp\"><span>Well Wishes</span></a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li class=\"dropdown \">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Faculties <b class=\"caret\"></b></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li class=\"\">\r\n");
      out.write("                                    <a href=\"../school-of-business.jsp\"><span>School of Business</span></a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"\">\r\n");
      out.write("                                    <a href=\"../school-of-computing.jsp\"><span>School of Computing</span></a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"\">\r\n");
      out.write("                                    <a href=\"../school-of-engineering.jsp\"><span>School of Engineering</span></a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li class=\"\">\r\n");
      out.write("                            <a href=\"../programmes.jsp\">Programmes</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li class=\"active\">\r\n");
      out.write("                            <a href=\"../news.jsp\">News &amp; Events</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li class=\"\">\r\n");
      out.write("                            <a href=\"../career-guidance-and-industrial-training.jsp\">Career Guidance</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li class=\"dropdown \">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">To Students <b class=\"caret\"></b></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li class=\"\">\r\n");
      out.write("                                    <a href=\"../dress-code.jsp\"><span>Dress Code</span></a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"\">\r\n");
      out.write("                                    <a href=\"../exams.jsp\"><span>Exams</span></a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"\">\r\n");
      out.write("                                    <a href=\"../library.jsp\"><span>Library</span></a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"\">\r\n");
      out.write("                                    <a href=\"../research.jsp\"><span>Research</span></a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"http://www.emeraldinsight.com/\" target=\"_blank\"><span>Electronic Databases</span></a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li class=\"\">\r\n");
      out.write("                            <a href=\"../contact.jsp\">Contact</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <hr style=\"margin: 10px 0px\">\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"http://lms.nsbm.lk/\"><span class=\"glyphicon glyphicon-book small\"></span> e-Learning</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                </div> <!-- end.navbar-collapse -->\r\n");
      out.write("\r\n");
      out.write("            </div> <!-- end.container -->\r\n");
      out.write("\r\n");
      out.write("        </div> <!-- end.navbar -->\r\n");
      out.write("\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"sub-header\" class=\"hidden-xs\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-6 hidden-sm\">\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("            <div id=\"header-breadcrumb\">\r\n");
      out.write("\r\n");
      out.write("                 <ol class=\"breadcrumb\">\r\n");
      out.write("                    <li><a href=\"index.jsp\"><span class=\"glyphicon glyphicon-home\"></span></a></li>\r\n");
      out.write("\r\n");
      out.write("                        <li class=\"active\">\r\n");
      out.write("                                                \r\n");
      out.write("                          Company Dashboard\r\n");
      out.write("                        \r\n");
      out.write("                                            </li>\r\n");
      out.write("                      \r\n");
      out.write("                       \r\n");
      out.write("                    </ol>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div> <!-- end#header-breadcrumb -->\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-sm-12 col-md-6\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"pull-right\">\r\n");
      out.write("\r\n");
      out.write("            <strong>You are logged in as Guest!</strong>\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("                </div> <!-- end.row -->\r\n");
      out.write("\r\n");
      out.write("            </div> <!-- end.container -->\r\n");
      out.write("\r\n");
      out.write("        </div> <!-- end#sub-header -->\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    <div class=\"inner-container\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"content-wrapper\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("<h1>Hi, 99x Technology </h1>\r\n");
      out.write("                    <div class=\"col-md-8 left-aside\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("<hr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("<center>\r\n");
      out.write("              <form action=\"Industry_Event_View.jsp\" >\r\n");
      out.write("            \r\n");
      out.write("            <table>\r\n");
      out.write("            \r\n");
      out.write("                <tr><td>Date of the event</td><td><input type=\"date\" name=\"date\" value=\"\" /></td></tr>\r\n");
      out.write("                <tr><td>Events</td><td><textarea rows=\"4\" cols=\"50\" name=\"events\" value=\"\" ></textarea></td></tr>\r\n");
      out.write("                \r\n");
      out.write("                 <tr><td></td><td><input type=\"submit\" value=\"submit\" /></td></tr>\r\n");
      out.write("             \r\n");
      out.write("            </table>\r\n");
      out.write("        </form>\r\n");
      out.write("          </center>\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  ");

                
             
                
                  Connection con=null;
              PreparedStatement pst=null;
              ResultSet rs=null;
              
              try{
           
             Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dea","root",""); 
            
              }
            
             catch(Exception e){
                out.print("Submition Failed");
            }
              
              
            
              String date=request.getParameter("date");
              String events=request.getParameter("events");
              
             
              
              if(date!="" && events!=""){
              
              try{
                  String sql1="INSERT INTO dates (date,events) VALUES ('"+date+"','"+events+"')";
        
               pst=con.prepareStatement(sql1);
                pst.execute();
               
              }
              catch(Exception e){
                  out.print("qqqq");
              }
                
                   try{
          String sql="SELECT * FROM dates";
         
               pst=con.prepareStatement(sql);
                rs = pst.executeQuery();
                
                
      out.write("\r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("            <table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\">\r\n");
      out.write("              <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <th>date</th>\r\n");
      out.write("                  <th>Event_id</th>\r\n");
      out.write("                  <th>events</th>\r\n");
      out.write("                  \r\n");
      out.write("                </tr>\r\n");
      out.write("              </thead>\r\n");
      out.write("              \r\n");
      out.write("              <tbody>\r\n");
      out.write("               \r\n");
      out.write("                  ");

                
          while(rs.next()){
                 
              
      out.write("\r\n");
      out.write("              \r\n");
      out.write("              <tr>\r\n");
      out.write("                        <td>");
      out.print( rs.getString(1));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( rs.getString(2));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( rs.getString(3));
      out.write("</td>\r\n");
      out.write("                       \r\n");
      out.write("                        <td><a href='Eventcomment.jsp?id=");
      out.print( rs.getString(2));
      out.write("'>Add Comment</a></td>\r\n");
      out.write("                       \r\n");
      out.write("                    </tr>\r\n");
      out.write("           ");

             
            }
            
      out.write("\r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("              </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            \r\n");
      out.write("             ");

            
                con.close();
                
            
            }
            catch(Exception e){
                System.out.println("something went wrong");
            }     

               

            }
            

                
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("<hr>\r\n");
      out.write("                        \r\n");
      out.write("                      \r\n");
      out.write("                          <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"news-card bxsw-1x\">\r\n");
      out.write("\r\n");
      out.write("                                        <a class=\"img-wrapper\" href=\"../news/nsbm-swimming-team-became-the-overall-champions.jsp\" title=\"NSBM Swimming Team became the overall Champions\">\r\n");
      out.write("                                                                                    </a>                                        <!-- end.inner-card -->\r\n");
      out.write("\r\n");
      out.write("                                    </div> <!-- end.news-card -->\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"news-card bxsw-1x\">\r\n");
      out.write("\r\n");
      out.write("                                        <a class=\"img-wrapper\" href=\"../news/introduction-to-electronics-and-arduino.jsp\" title=\"Workshop on Introduction to Electronics and Arduino\">\r\n");
      out.write("                                                                                    </a>\r\n");
      out.write("\r\n");
      out.write("                                      <!-- end.inner-card -->\r\n");
      out.write("\r\n");
      out.write("                                  </div> \r\n");
      out.write("                                    <!-- end.news-card -->\r\n");
      out.write("\r\n");
      out.write("                          </div>\r\n");
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"news-card bxsw-1x\">\r\n");
      out.write("\r\n");
      out.write("                                        <a class=\"img-wrapper\" href=\"../news/nsbm-initiate-drug-control-degree-programmes-business-it-creative-architecture.jsp\" title=\"NSBM joins hands to initiate Drug control\">\r\n");
      out.write("                                                                                    </a>\r\n");
      out.write("\r\n");
      out.write("                                      <!-- end.inner-card -->\r\n");
      out.write("\r\n");
      out.write("                                  </div> \r\n");
      out.write("                                    <!-- end.news-card -->\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                                <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"news-card bxsw-1x\">\r\n");
      out.write("\r\n");
      out.write("                                        <a class=\"img-wrapper\" href=\"../news/gdg-sri-lanka-workshop-on-google-cloud-platform-at-nsbm.jsp\" title=\"GDG Sri Lanka workshop on Google Cloud Platform\">\r\n");
      out.write("                                                                                    </a>\r\n");
      out.write("\r\n");
      out.write("                                      <!-- end.inner-card -->\r\n");
      out.write("\r\n");
      out.write("                                  </div> \r\n");
      out.write("                                    <!-- end.news-card -->\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                        </div> <!-- end#posts -->\r\n");
      out.write("\r\n");
      out.write("                    </div> <!-- end#section-news -->\r\n");
      out.write("\r\n");
      out.write("                </div> <!-- end.row -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row text-center\">\r\n");
      out.write("                    <ul class=\"pagination\"><li class=\"disabled\"><span>&laquo;</span></li> <li class=\"active\"><span>1</span></li><li><a href=\"#\">2</a></li></ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div> <!-- end.container -->\r\n");
      out.write("\r\n");
      out.write("        </div> <!-- end.content-wrapper -->\r\n");
      out.write("\r\n");
      out.write("    </div> <!-- end.inner-container -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("         <footer>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"footer-top\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"quick-links\" class=\"row\">\r\n");
      out.write("\r\n");
      out.write("        <ul class=\"col-xs-12 col-sm-3\">\r\n");
      out.write("            <li><h3><a href=\"contact\">Contact Us</a></h3></li>\r\n");
      out.write("            <li>Smart Valley Sri Lanka,</li>\r\n");
      out.write("            <li>NSBM Green University Town,</li>\r\n");
      out.write("            <li>Homagama,</li>\r\n");
      out.write("            <li>Sri Lanka.</li>\r\n");
      out.write("            <br>\r\n");
      out.write("            <li>Hotline: <a href=\"tel:+94773063552\">+94 (77) 431 9431</a></li>\r\n");
      out.write("            <li>Tel: <a href=\"tel:+94114876339\">+94 (11) 487 6339</a></li>\r\n");
      out.write("            <li>Fax: <a href=\"tel:+94112395348\">+94 (11) 239 5348</a></li>\r\n");
      out.write("            <br>\r\n");
      out.write("            <li>Email: <a href=\"mailto:hello@smarthub.lk\">hello@smarthub.lk</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("        <ul class=\"col-xs-12 col-sm-3\">\r\n");
      out.write("            <li><h3><a class=\"unlink\" href=\"#\"> Parties</a></h3></li>\r\n");
      out.write("            <li><a href=\"products-coir\"><span class=\"glyphicon glyphicon-link\"></span> Students</a></li>\r\n");
      out.write("            <li><a href=\"products-horticultural\"><span class=\"glyphicon glyphicon-link\"></span> Universities</a></li>\r\n");
      out.write("            <li><a href=\"products-errosion\"><span class=\"glyphicon glyphicon-link\"></span>Industries</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("        <ul class=\"col-xs-12 col-sm-3\">\r\n");
      out.write("            <li><h3><a class=\"unlink\" href=\"#\">Quick Links</a></h3></li>\r\n");
      out.write("            <li><a href=\"index\"><span class=\"glyphicon glyphicon-link\"></span> Home</a></li>\r\n");
      out.write("            <li><a href=\"about-us\"><span class=\"glyphicon glyphicon-link\"></span> About</a></li>\r\n");
      out.write("            <li><a href=\"products\"><span class=\"glyphicon glyphicon-link\"></span> Public Posts</a></li>\r\n");
      out.write("        \r\n");
      out.write("            <li><a href=\"career-guidance-and-industrial-training\"><span class=\"glyphicon glyphicon-link\"></span> Career Guidance</a></li>\r\n");
      out.write("            <li><a href=\"contact\"><span class=\"glyphicon glyphicon-link\"></span> Contact Us</a></li>\r\n");
      out.write("            <li><a href=\"sitemap\"><span class=\"glyphicon glyphicon-link\"></span> Sitemap</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("        <ul class=\"col-xs-12 col-sm-3 col-social\">\r\n");
      out.write("            <li><h3><a class=\"unlink\" href=\"#\">Find Us On</a></h3></li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a class=\"url\" href=\"http://www.facebook.com/\" target=\"_blank\"><span id=\"icon-facebook\"></span> Facebook</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a class=\"url\" href=\"https://twitter.com/\" target=\"_blank\"><span id=\"icon-twitter\"></span> Twitter</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a class=\"url\" href=\"https://www.linkedin.com/profile/\" target=\"_blank\"><span id=\"icon-linkedin\"></span> LinkedIn</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a class=\"url\" href=\"http://www.youtube.com/channel/\" target=\"_blank\"><span id=\"icon-youtube\"></span> YouTube</a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("    </div> <!-- end.row -->\r\n");
      out.write("\r\n");
      out.write("    <div id=\"branding\" class=\"row\">\r\n");
      out.write("       <!--<p class=\"col-xs-12\"><img class=\"img-responsive\" src=\"img/logos/\" alt=\"Branding\" /></p> -->\r\n");
      out.write("    </div> <!-- end.row -->\r\n");
      out.write("\r\n");
      out.write("                </div> <!-- end.container -->\r\n");
      out.write("\r\n");
      out.write("            </div> <!-- end#footer-top -->\r\n");
      out.write("\r\n");
      out.write("            <div id=\"cpyr-bar\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                      <p id=\"cpyr\" class=\"col-sm-7 col-md-8\">Copyright &copy; 2018 Smart Valley. All Rights Reserved.</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"devs col-sm-5 col-md-4 text-right hidden-xs\">System develop &amp; maintain with <span class=\"glyphicon glyphicon-heart\"></span> by <a href=\"http://smartvalley.lk\" target=\"_blank\"><font color=\"#FFB406\">Smart Valley</font></a></p>\r\n");
      out.write("                      <p class=\"devs col-md-4 visible-xs\">System develop &amp; maintain with <span class=\"glyphicon glyphicon-heart\"></span> by <a href=\"http://smartvalley.lk\" target=\"_blank\"><font color=\"#FFB406\">Smart Valley</font></a></p>\r\n");
      out.write("    </div> <!-- end.row -->\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div> <!-- end#cpyr-bar -->\r\n");
      out.write("\r\n");
      out.write("        </footer>\r\n");
      out.write("\r\n");
      out.write("    </div> <!-- end#main-container -->\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    <a id=\"back2top\" class=\"back2top hidden-xs\" href=\"#nav-home\">Top</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("    <script type=\"text/javascript\" src=\"build/js/site-4dd49a43b0.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("        jQuery(document).ready(function($){\r\n");
      out.write("\r\n");
      out.write("            // Back to Top\r\n");
      out.write("\r\n");
      out.write("            var offset = 300,\r\n");
      out.write("                    offset_opacity = 1200,\r\n");
      out.write("                    scroll_top_duration = 700,\r\n");
      out.write("                    $back_to_top = $('.back2top');\r\n");
      out.write("\r\n");
      out.write("            $(window).scroll(function(){\r\n");
      out.write("                ( $(this).scrollTop() > offset ) ? $back_to_top.addClass('back2top-visible') : $back_to_top.removeClass('back2top-visible back2top-fadeout');\r\n");
      out.write("                if( $(this).scrollTop() > offset_opacity ) {\r\n");
      out.write("                    $back_to_top.addClass('back2top-fadeout');\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $back_to_top.on('click', function(event){\r\n");
      out.write("                event.preventDefault();\r\n");
      out.write("                $('body,html').animate({\r\n");
      out.write("                            scrollTop: 0 ,\r\n");
      out.write("                        }, scroll_top_duration\r\n");
      out.write("                );\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write(" \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("        $( document ).ready(function() {\r\n");
      out.write("\r\n");
      out.write("            // Sets Cover Image\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            $('#hero-cover-course-apply').css('background','url(\"../../img/course/ZM4AZ70ql5eMmkQBgI9k9Hd6qZRCBczh.jpg\") no-repeat center center');\r\n");
      out.write("\r\n");
      out.write("            // Datetimepicker\r\n");
      out.write("\r\n");
      out.write("            $('.datetimepicker').datetimepicker({\r\n");
      out.write("                format: 'YYYY-MM-DD'\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            // SelectOrDie\r\n");
      out.write("\r\n");
      out.write("            $(\"select\").selectOrDie();\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function googleTranslateElementInit() {\r\n");
      out.write("  new google.translate.TranslateElement({pageLanguage: 'en', includedLanguages: 'de,fr,id,it,ja,jv,ko,zh-CN,zh-TW', layout: google.translate.TranslateElement.InlineLayout.SIMPLE}, 'google_translate_element');\r\n");
      out.write("}\r\n");
      out.write("</script><script type=\"text/javascript\" src=\"//translate.google.com/translate_a/element.js?cb=googleTranslateElementInit\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
