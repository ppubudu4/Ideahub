package org.apache.jsp.ideahub;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <title> Idea Hub | Smart Hub of NSBM Green University Town </title>\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("    <meta name=\"mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-title\" content=\"NSBM\">\r\n");
      out.write("    <meta name=\"application-name\" content=\"NSBM\">\r\n");
      out.write("\r\n");
      out.write("    <meta name=\"msapplication-TileColor\" content=\"#ffffff\">\r\n");
      out.write("    <meta name=\"msapplication-TileImage\" content=\"../img/favicons/mstile-144x144.jsp\">\r\n");
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
      out.write("    <script src=\"../../apis.google.com/js/platform.js\" async defer></script>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("\r\n");
      out.write("        /* Google Analytics */\r\n");
      out.write("\r\n");
      out.write("        (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function() {\r\n");
      out.write("            (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\r\n");
      out.write("            m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\r\n");
      out.write("        })(window,document,'script','../../www.google-analytics.com/analytics.js','ga');\r\n");
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
      out.write("            js.src = \"../../connect.facebook.net/en_US/sdk.js\";\r\n");
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
      out.write("        <header class=\"hidden-xs\" style=\"height: 92px;\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-sm-2 col-lg-2\">\r\n");
      out.write("                    <a id=\"logo\" class=\"pull-left img-responsive\" href=\"index.jsp\"><img src=\"../img/logos/nsbm-logo.png\" alt=\"NSBM Logo\" /></a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-sm-10 col-lg-10\" style=\"padding-right: 0px;\">\r\n");
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
      out.write("                                        <a href=\"board-of-directors.jsp\"><span>Board of Directors</span></a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"\">\r\n");
      out.write("                                        <a href=\"faculty.jsp\"><span>Faculty</span></a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"\">\r\n");
      out.write("                                        <a href=\"green-university.jsp\"><span>Green University</span></a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"\">\r\n");
      out.write("                                        <a href=\"affiliated-universities.jsp\"><span>Affiliated Universities</span></a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"\">\r\n");
      out.write("                                        <a href=\"well-wishes.jsp\"><span>Well Wishes</span></a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                           \r\n");
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
      out.write("\r\n");
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
      out.write("                        <li class=\"active\">\r\n");
      out.write("                            <a href=\"../programmes.jsp\">Programmes</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li class=\"\">\r\n");
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
      out.write("        ");

            
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
              
              
          try{
            
              
          String sql2="SELECT * FROM idea ";
         
               pst=con.prepareStatement(sql2);
                rs = pst.executeQuery();
                
                
      out.write("\r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("                    \r\n");
      out.write("               \r\n");
      out.write("         \r\n");
      out.write("                \r\n");
      out.write("\t\t  \r\n");
      out.write("       \r\n");
      out.write("            <table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\">\r\n");
      out.write("              <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <th>Event Id</th>\r\n");
      out.write("                  <th>Idea</th>\r\n");
      out.write("                  <th>Name</th>\r\n");
      out.write("                 \r\n");
      out.write("                </tr>\r\n");
      out.write("              </thead>\r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("              <tbody>\r\n");
      out.write("               \r\n");
      out.write("                ");

                
          while(rs.next()){
                 
              
      out.write("\r\n");
      out.write("              \r\n");
      out.write("              <tr>\r\n");
      out.write("                      \r\n");
      out.write("                        <td>");
      out.print( rs.getString(1));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( rs.getString(2));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( rs.getString(3));
      out.write("</td>\r\n");
      out.write("                        <td><a href='comment.jsp?id=");
      out.print( rs.getString(1));
      out.write("'>Add Comment</a></td>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                       \r\n");
      out.write("                    </tr>\r\n");
      out.write("           ");

             
            }
            
      out.write("\r\n");
      out.write("                 </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            ");

                
                    con.close();
                
            
            }
             catch(Exception e){
                System.out.println("something wrong");
            }
           

            
                
      out.write("\r\n");
      out.write("            \r\n");
      out.write("         \r\n");
      out.write("                \r\n");
      out.write("\t\t  \r\n");
      out.write("    \r\n");
      out.write("            \r\n");
      out.write("               \r\n");
      out.write("\r\n");
      out.write("                       <hr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div> <!-- END OF AN IDEA PANEL -->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("                   \r\n");
      out.write("<hr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("        <p class=\"h3 panel-title\">Industrial Training</p>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"panel-body\">\r\n");
      out.write("\r\n");
      out.write("        <p>Lay strong foundations for a successful career, using our extensive industry links to secure industrial training giving you the vital industry experience and connections you'll need when you graduate.</p>\r\n");
      out.write("\r\n");
      out.write("        <img class=\"img-responsive\" src=\"../img/aside/43092758.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("    </div> <!-- end.panel-body -->\r\n");
      out.write("\r\n");
      out.write("</div> <!-- end.panel-widget -->\r\n");
      out.write("\r\n");
      out.write("                    </div> <!-- end.panel-aside -->\r\n");
      out.write("\r\n");
      out.write("                </div> <!-- end.row -->\r\n");
      out.write("\r\n");
      out.write("            </div> <!-- end.container -->\r\n");
      out.write("\r\n");
      out.write("        </div> <!-- end.full-width -->\r\n");
      out.write("\r\n");
      out.write("    </div> <!-- end.content-wrapper -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <footer>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"footer-top\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"quick-links\" class=\"row\">\r\n");
      out.write("\r\n");
      out.write("        <ul class=\"col-xs-12 col-sm-3\">\r\n");
      out.write("            <li><h3><a href=\"../contact.jsp\">Contact Us</a></h3></li>\r\n");
      out.write("            <li>309, High Level Road</li>\r\n");
      out.write("            <li>Colombo 05</li>\r\n");
      out.write("            <li>00500</li>\r\n");
      out.write("            <li>Sri Lanka</li>\r\n");
      out.write("            <li>Tel: <a href=\"tel:+94115445000\">+94 (11) 544 5000</a></li>\r\n");
      out.write("            <li>Fax: <a href=\"tel:+94115445009\">+94 (11) 544 5009</a></li>\r\n");
      out.write("            <li>Email: <a href=\"mailto:info@nsbm.lk\">info@nsbm.lk</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("        <ul class=\"col-xs-12 col-sm-3\">\r\n");
      out.write("            <li><h3><a class=\"unlink\" href=\"#\">Faculties</a></h3></li>\r\n");
      out.write("            <li><a href=\"../school-of-business.jsp\"><span class=\"glyphicon glyphicon-link\"></span> School of Business</a></li>\r\n");
      out.write("            <li><a href=\"../school-of-computing.jsp\"><span class=\"glyphicon glyphicon-link\"></span> School of Computing</a></li>\r\n");
      out.write("            <li><a href=\"../school-of-engineering.jsp\"><span class=\"glyphicon glyphicon-link\"></span> School of Engineering</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("        <ul class=\"col-xs-12 col-sm-3\">\r\n");
      out.write("            <li><h3><a class=\"unlink\" href=\"#\">Quick Links</a></h3></li>\r\n");
      out.write("            <li><a href=\"../index.jsp\"><span class=\"glyphicon glyphicon-link\"></span> Home</a></li>\r\n");
      out.write("            <li><a href=\"../about-us.jsp\"><span class=\"glyphicon glyphicon-link\"></span> About</a></li>\r\n");
      out.write("            <li><a href=\"../programmes.jsp\"><span class=\"glyphicon glyphicon-link\"></span> Programmes</a></li>\r\n");
      out.write("            <li><a href=\"../green-university.jsp\"><span class=\"glyphicon glyphicon-link\"></span> Green University</a></li>\r\n");
      out.write("            <li><a href=\"../student-life.jsp\"><span class=\"glyphicon glyphicon-link\"></span> Student Life</a></li>\r\n");
      out.write("            <li><a href=\"../news.jsp\"><span class=\"glyphicon glyphicon-link\"></span> News &amp; Events</a></li>\r\n");
      out.write("            <li><a href=\"../contact.jsp\"><span class=\"glyphicon glyphicon-link\"></span> Contact Us</a></li>\r\n");
      out.write("            <li><a href=\"../sitemap.jsp\"><span class=\"glyphicon glyphicon-link\"></span> Sitemap</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("        <ul class=\"col-xs-12 col-sm-3 col-social\">\r\n");
      out.write("            <li><h3><a class=\"unlink\" href=\"#\">Find Us On</a></h3></li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a class=\"url\" href=\"http://www.facebook.com/nsbm.lk\" target=\"_blank\"><span id=\"icon-facebook\"></span> Facebook</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a class=\"url\" href=\"https://twitter.com/NSBM_SriLanka\" target=\"_blank\"><span id=\"icon-twitter\"></span> Twitter</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a class=\"url\" href=\"https://www.linkedin.com/profile/view?id=434204105&amp;trk=nav_responsive_tab_profile_pic\" target=\"_blank\"><span id=\"icon-linkedin\"></span> LinkedIn</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a class=\"url\" href=\"http://www.youtube.com/channel/UCHsodhRyiuri2jD7H7nfsRg/feed\" target=\"_blank\"><span id=\"icon-youtube\"></span> YouTube</a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("    </div> <!-- end.row -->\r\n");
      out.write("\r\n");
      out.write("    <div id=\"branding\" class=\"row\">\r\n");
      out.write("        <p class=\"col-xs-12\"><img class=\"img-responsive\" src=\"../img/logos/uni-logos.png\" alt=\"\" /></p>\r\n");
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
      out.write("        <p id=\"cpyr\" class=\"col-sm-7 col-md-8\">Copyright &copy; 2016 National School of Business Management. All Rights Reserved.</p>\r\n");
      out.write("        <p class=\"devs col-sm-5 col-md-4 text-right hidden-xs\"><a href=\"http://olionsoft.com.lk/services/web-design-and-development\" target=\"_blank\">Web design &amp; develop</a> with <span class=\"glyphicon glyphicon-heart\"></span> by <a href=\"http://olionsoft.com.lk/\" target=\"_blank\">Olionsoft</a></p>\r\n");
      out.write("        <p class=\"devs col-md-4 visible-xs\"><a href=\"http://olionsoft.com.lk/services/web-design-and-development\" target=\"_blank\">Web design &amp; develop</a> with <span class=\"glyphicon glyphicon-heart\"></span> by <a href=\"http://olionsoft.com.lk/\" target=\"_blank\">Olionsoft</a></p>\r\n");
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
      out.write("    <!-- Modal Dev Profiles -->\r\n");
      out.write("\r\n");
      out.write("    <div id=\"modal-devs\" class=\"modal fade\" role=\"dialog\" aria-hidden=\"true\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-10 col-sm-offset-1 col-xs-12\">\r\n");
      out.write("                            <p class=\"text-center\"><img id=\"cup\" src=\"../img/icons/trophy.png\" alt=\"\" /></p>\r\n");
      out.write("                            <p class=\"h1 text-center lead\">Designed &amp; Developed by Winners of NSC 2014.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-xs-6 profile\">\r\n");
      out.write("                            <p class=\"text-center\"><a href=\"https://www.linkedin.com/in/milroyfraser\" target=\"_blank\"><img class=\"avatar img-circle\" src=\"../img/profiles/devs/profile-milroy.jpg\" alt=\"Milroy Fraser\" /></a></p>\r\n");
      out.write("                            <p class=\"text-center name\"><a href=\"https://www.linkedin.com/in/milroyfraser\" target=\"_blank\">Milroy</a></p>\r\n");
      out.write("                            <p class=\"text-center title\">Software Engineer</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-xs-6 profile\">\r\n");
      out.write("                            <p class=\"text-center\"><a href=\"https://www.linkedin.com/in/ruwanlokubalasooriya\" target=\"_blank\"><img class=\"avatar img-circle\" src=\"../img/profiles/devs/profile-ruwan.jpg\" alt=\"Ruwan Lokubalasooriya\" /></a></p>\r\n");
      out.write("                            <p class=\"text-center name\"><a href=\"https://www.linkedin.com/in/ruwanlokubalasooriya\" target=\"_blank\">Ruwan</a></p>\r\n");
      out.write("                            <p class=\"text-center title\">UI Engineer</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div> <!-- end.modal-body -->\r\n");
      out.write("\r\n");
      out.write("            </div> <!-- end.modal-content -->\r\n");
      out.write("\r\n");
      out.write("        </div> <!-- end.modal-dialog -->\r\n");
      out.write("\r\n");
      out.write("    </div> <!-- end.modal -->\r\n");
      out.write("\r\n");
      out.write("    <a id=\"back2top\" class=\"back2top hidden-xs\" href=\"#nav-home\">Top</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../build/js/site-4dd49a43b0.js\"></script>\r\n");
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
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    $( document ).ready(function() {\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        $('#hero-cover-course-info').css('background','url(\"../img/course/4XgfVGQTMp1k2uPzJ4vM65Ul8xhxcN6W.jpg\") no-repeat center center');\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Mirrored from nsbm.lk/programmes/bsc-in-multimedia by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 12 Sep 2016 00:41:19 GMT -->\r\n");
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
