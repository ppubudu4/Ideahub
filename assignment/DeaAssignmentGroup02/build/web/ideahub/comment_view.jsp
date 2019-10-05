<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en">


<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title> Idea Hub | Smart Hub of NSBM Green University Town </title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-title" content="NSBM">
    <meta name="application-name" content="NSBM">

    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="msapplication-TileImage" content="../img/favicons/mstile-144x144.jsp">

    <link rel="apple-touch-icon" sizes="57x57" href="../img/favicons/apple-touch-icon-57x57.png">
    <link rel="apple-touch-icon" sizes="114x114" href="../img/favicons/apple-touch-icon-114x114.png">
    <link rel="apple-touch-icon" sizes="72x72" href="../img/favicons/apple-touch-icon-72x72.png">
    <link rel="apple-touch-icon" sizes="144x144" href="../img/favicons/apple-touch-icon-144x144.png">
    <link rel="apple-touch-icon" sizes="60x60" href="../img/favicons/apple-touch-icon-60x60.png">
    <link rel="apple-touch-icon" sizes="120x120" href="../img/favicons/apple-touch-icon-120x120.png">
    <link rel="apple-touch-icon" sizes="76x76" href="../img/favicons/apple-touch-icon-76x76.png">
    <link rel="apple-touch-icon" sizes="152x152" href="../img/favicons/apple-touch-icon-152x152.png">
    <link rel="icon" type="image/png" href="../img/favicons/favicon-196x196.png" sizes="196x196">
    <link rel="icon" type="image/png" href="../img/favicons/favicon-96x96.png" sizes="96x96">
    <link rel="icon" type="image/png" href="../img/favicons/favicon-32x32.png" sizes="32x32">
    <link rel="icon" type="image/png" href="../img/favicons/favicon-16x16.png" sizes="16x16">
    <link rel="icon" type="image/png" href="../img/favicons/favicon-128x128.png" sizes="128x128">

    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,400,600|Roboto:700' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" media="screen" href="../build/css/site-19b297a2bc.css">

    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <script src="../../apis.google.com/js/platform.js" async defer></script>

    <script>

        /* Google Analytics */

        (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function() {
            (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
            m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
        })(window,document,'script','../../www.google-analytics.com/analytics.js','ga');
        ga('create', 'UA-48138541-2', 'auto');
        ga('send', 'pageview');

        /* Social Media Share Buttons */

        window.fbAsyncInit = function() {
            FB.init({
                appId      : '833486563412429',
                xfbml      : true,
                version    : 'v2.3'
            });
        };
        (function(d, s, id){
            var js, fjs = d.getElementsByTagName(s)[0];
            if (d.getElementById(id)) {return;}
            js = d.createElement(s); js.id = id;
            js.src = "../../connect.facebook.net/en_US/sdk.js";
            fjs.parentNode.insertBefore(js, fjs);
        }(document, 'script', 'facebook-jssdk'));

    </script>

    <div id="fb-root"></div>

</head>

<body>

    <!--[if lte IE 9]>
        <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
    <![endif]-->

    
	
    <!-- <div class="preloader"><div class="loading-effect"></div></div> -->

    <div id="main-container">

        <header class="hidden-xs" style="height: 92px;">

        <div class="container">

            <div class="row">

                <div class="col-sm-2 col-lg-2">
                    <a id="logo" class="pull-left img-responsive" href="index.jsp"><img src="../img/logos/nsbm-logo.png" alt="NSBM Logo" /></a>
                </div>

                <div class="col-sm-10 col-lg-10" style="padding-right: 0px;">

                    <nav id="main-menu" class="pull-right">

                        <ul class="nav-list">

                            <li class="">
                                <a href="../index.jsp">Home</a>
                            </li>

                            <li class="">
                                <a href="#">Discover NSBM</a>
                                <ul>
                                    <li class="">
                                        <a href="../about-us.jsp"><span>About NSBM</span></a>
                                    </li>
                                    <li class="">
                                        <a href="board-of-directors.jsp"><span>Board of Directors</span></a>
                                    </li>
                                    <li class="">
                                        <a href="faculty.jsp"><span>Faculty</span></a>
                                    </li>
                                    <li class="">
                                        <a href="green-university.jsp"><span>Green University</span></a>
                                    </li>
                                    <li class="">
                                        <a href="affiliated-universities.jsp"><span>Affiliated Universities</span></a>
                                    </li>
                                    <li class="">
                                        <a href="well-wishes.jsp"><span>Well Wishes</span></a>
                                    </li>
                                </ul>
                            </li>

                           

                          
                            

                            <li class="">
                                <a href="../contact.jsp">Contact Us</a>
                            </li>

                        </ul> <!-- end.nav-list -->

                    </nav> <!-- end#main-menu -->

                </div>

            </div> <!-- end.row -->

        </div> <!-- end.container -->

    </header>

        <header class="mobile-nav visible-xs">

        <div class="navbar navbar-default" role="navigation">

            <div class="container">

                <div class="navbar-header">

                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="../index.jsp">NSBM</a>

                </div> <!-- end.navbar-header -->

                <div class="collapse navbar-collapse">

                    <ul class="nav navbar-nav">

                        <li class="">
                            <a href="../index.jsp">Home</a>
                        </li>

                        <li class="dropdown ">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Discover NSBM <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li class="">
                                    <a href="../about-us.jsp"><span>About NSBM</span></a></li>
                                <li class="">
                                    <a href="../student-life.jsp"><span>Student Life</span></a>
                                </li>
                                <li class="">
                                    <a href="../board-of-directors.jsp"><span>Board of Directors</span></a>
                                </li>
                                <li class="">
                                    <a href="../faculty.jsp"><span>Faculty</span></a>
                                </li>
                                <li class="">
                                    <a href="../green-university.jsp"><span>Green University</span></a>
                                </li>
                                <li class="">
                                    <a href="../affiliated-universities.jsp"><span>Affiliated Universities</span></a>
                                </li>
                                <li class="">
                                    <a href="../well-wishes.jsp"><span>Well Wishes</span></a>
                                </li>
                            </ul>
                        </li>

                        <li class="dropdown ">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Faculties <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li class="">
                                    <a href="../school-of-business.jsp"><span>School of Business</span></a>
                                </li>
                                <li class="">
                                    <a href="../school-of-computing.jsp"><span>School of Computing</span></a>
                                </li>
                                <li class="">
                                    <a href="../school-of-engineering.jsp"><span>School of Engineering</span></a>
                                </li>
                            </ul>
                        </li>

                        <li class="active">
                            <a href="../programmes.jsp">Programmes</a>
                        </li>

                        <li class="">
                            <a href="../news.jsp">News &amp; Events</a>
                        </li>

                        <li class="">
                            <a href="../career-guidance-and-industrial-training.jsp">Career Guidance</a>
                        </li>

                        <li class="dropdown ">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">To Students <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li class="">
                                    <a href="../dress-code.jsp"><span>Dress Code</span></a>
                                </li>
                                <li class="">
                                    <a href="../exams.jsp"><span>Exams</span></a>
                                </li>
                                <li class="">
                                    <a href="../library.jsp"><span>Library</span></a>
                                </li>
                                <li class="">
                                    <a href="../research.jsp"><span>Research</span></a>
                                </li>
                                <li>
                                    <a href="http://www.emeraldinsight.com/" target="_blank"><span>Electronic Databases</span></a>
                                </li>
                            </ul>
                        </li>

                        <li class="">
                            <a href="../contact.jsp">Contact</a>
                        </li>

                        <li>
                            <hr style="margin: 10px 0px">
                        </li>

                        <li>
                            <a href="http://lms.nsbm.lk/"><span class="glyphicon glyphicon-book small"></span> e-Learning</a>
                        </li>

                    </ul>

                </div> <!-- end.navbar-collapse -->

            </div> <!-- end.container -->

        </div> <!-- end.navbar -->

    </header>
          <center>
		  
           <%
                              
             String event_id=request.getParameter("idea_id");
             
            %>
            <center>
           <form action="comment_view.jsp">
        <table>
            
               
           
                <tr>
                    <td></td>
                    <td><input name="idea_id" type="hidden" value="<%= event_id %>"></td>
                </tr>
                
                <tr>
                    <td>Comments</td>
                    <td><textarea rows="4" cols="50" name="comment" value="" ></textarea></td>
                </tr>
                
                <tr>
                    <td></td>
                    <td><input type="submit" name="submit" value="submit" /></td>
                </tr>
           
        </table>
        </form>
            </center>
                  <%
            
            
    
              Connection conn=null;
              PreparedStatement pst=null;
              ResultSet rs=null;
              
              try{
            
            Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dea","root","");
            
              }
             catch(Exception e){
                out.print("connection failed");
            }

            
            
            
            
            String comment=request.getParameter("comment");
            
            
            
            
          
                String sql="insert into idea_comment(event_id,comment) values('"+event_id+"','"+comment+"')";
               pst=conn.prepareStatement(sql);
                pst.execute();
                
            
             
            
                           
                try{
                
                
                String sql1="SELECT  * FROM idea_comment where event_id='"+event_id+"'";
                
                  pst=conn.prepareStatement(sql1);
                rs = pst.executeQuery();
                
                %>
                
             
		  
        <div class="card-body">
          <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
              <thead>
                <tr>
                  <th>Event Id</th>
                  <th>Comment</th>
                 
                 
                </tr>
              </thead>
              
              <tbody>
                
                   <%
                
                while(rs.next()){
                    %>
                    
                 
            
                    <tr>
                       
                        <td><%= rs.getString(1)%></td>
                        <td><%= rs.getString(2)%></td>
                       
                    </tr>
                    
               
            <%
            }
%>
               
               
              </tbody>
            </table>

<%

               
                conn.close();
                
            
            }
            catch(Exception e){
                out.print("something went wrong");
            }


        %>
                       <hr>
						
					</div> <!-- END OF AN IDEA PANEL -->
						
						
                    </div> <!-- end.left-aside -->

                    <div class="col-md-4 panel-aside">

                        <div class="mb-lg visible-xs visible-sm"></div>


                        <div class="mb-lg visible-xs visible-sm"></div>

<!-- <div class="panel-widget">

    <div class="panel-heading">
        <p class="h3 panel-title">Explorer Your Career Path with NSBM</p>
    </div>

    <div class="panel-body">

        <p>Walkthrough exceptional education options we offer at NSBM to choose most suitable path to develop your career. We guide to find you the most suitable career pathway.</p>

        <a class="btn btn-sm link" href="#">Explore Now <span class="glyphicon glyphicon-chevron-right small"></span></a>

    </div>

</div> --> <!-- end.panel-widget -->

<!-- <div class="panel-widget">

    <div class="panel-heading">
        <p class="h3 panel-title">Student Workshops</p>
    </div>

    <div class="panel-body">

        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci ab vero corporis perspiciatis, quia consequatur. Corporis numquam nemo sequi.</p>

        <p>Veniam delectus porro illum distinctio soluta blanditiis quasi nihil fuga esse architecto ipsa, numquam dolor qui in fugit dolorem.</p>

        <img class="img-responsive" src="http://nsbm.lk/img/aside/45987348.jpg" alt="">

    </div>

</div> --> <!-- end.panel-widget -->

<!-- <div class="panel-widget">

    <div class="panel-heading">
        <p class="h3 panel-title">Facilities</p>
    </div>

    <div class="panel-body">

        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>

        <ul>
            <li>Lorem ipsum dolor sit amet, consectetur.</li>
            <li>Itaque reprehenderit minima fuga alias.</li>
            <li>Delectus nulla quia dignissimos maxime.</li>
            <li>Pariatur harum est error quam facere.</li>
        </ul>

    </div>

</div> --> <!-- end.panel-widget -->

<div class="panel-widget">
	
	
		
	
    <div class="panel-heading">
		
		
		
		<hr>
		
		
        <p class="h3 panel-title">Industrial Training</p>
    </div>

    <div class="panel-body">

        <p>Lay strong foundations for a successful career, using our extensive industry links to secure industrial training giving you the vital industry experience and connections you'll need when you graduate.</p>

        <img class="img-responsive" src="../img/aside/43092758.jpg" alt="">

    </div> <!-- end.panel-body -->

</div> <!-- end.panel-widget -->

                    </div> <!-- end.panel-aside -->

                </div> <!-- end.row -->

            </div> <!-- end.container -->

        </div> <!-- end.full-width -->

    </div> <!-- end.content-wrapper -->


        <footer>

            <div id="footer-top">

                <div class="container">

                    <div id="quick-links" class="row">

        <ul class="col-xs-12 col-sm-3">
            <li><h3><a href="../contact.jsp">Contact Us</a></h3></li>
            <li>309, High Level Road</li>
            <li>Colombo 05</li>
            <li>00500</li>
            <li>Sri Lanka</li>
            <li>Tel: <a href="tel:+94115445000">+94 (11) 544 5000</a></li>
            <li>Fax: <a href="tel:+94115445009">+94 (11) 544 5009</a></li>
            <li>Email: <a href="mailto:info@nsbm.lk">info@nsbm.lk</a></li>
        </ul>

        <ul class="col-xs-12 col-sm-3">
            <li><h3><a class="unlink" href="#">Faculties</a></h3></li>
            <li><a href="../school-of-business.jsp"><span class="glyphicon glyphicon-link"></span> School of Business</a></li>
            <li><a href="../school-of-computing.jsp"><span class="glyphicon glyphicon-link"></span> School of Computing</a></li>
            <li><a href="../school-of-engineering.jsp"><span class="glyphicon glyphicon-link"></span> School of Engineering</a></li>
        </ul>

        <ul class="col-xs-12 col-sm-3">
            <li><h3><a class="unlink" href="#">Quick Links</a></h3></li>
            <li><a href="../index.jsp"><span class="glyphicon glyphicon-link"></span> Home</a></li>
            <li><a href="../about-us.jsp"><span class="glyphicon glyphicon-link"></span> About</a></li>
            <li><a href="../programmes.jsp"><span class="glyphicon glyphicon-link"></span> Programmes</a></li>
            <li><a href="../green-university.jsp"><span class="glyphicon glyphicon-link"></span> Green University</a></li>
            <li><a href="../student-life.jsp"><span class="glyphicon glyphicon-link"></span> Student Life</a></li>
            <li><a href="../news.jsp"><span class="glyphicon glyphicon-link"></span> News &amp; Events</a></li>
            <li><a href="../contact.jsp"><span class="glyphicon glyphicon-link"></span> Contact Us</a></li>
            <li><a href="../sitemap.jsp"><span class="glyphicon glyphicon-link"></span> Sitemap</a></li>
        </ul>

        <ul class="col-xs-12 col-sm-3 col-social">
            <li><h3><a class="unlink" href="#">Find Us On</a></h3></li>
            <li>
                <a class="url" href="http://www.facebook.com/nsbm.lk" target="_blank"><span id="icon-facebook"></span> Facebook</a>
            </li>
            <li>
                <a class="url" href="https://twitter.com/NSBM_SriLanka" target="_blank"><span id="icon-twitter"></span> Twitter</a>
            </li>
            <li>
                <a class="url" href="https://www.linkedin.com/profile/view?id=434204105&amp;trk=nav_responsive_tab_profile_pic" target="_blank"><span id="icon-linkedin"></span> LinkedIn</a>
            </li>
            <li>
                <a class="url" href="http://www.youtube.com/channel/UCHsodhRyiuri2jD7H7nfsRg/feed" target="_blank"><span id="icon-youtube"></span> YouTube</a>
            </li>
        </ul>

    </div> <!-- end.row -->

    <div id="branding" class="row">
        <p class="col-xs-12"><img class="img-responsive" src="../img/logos/uni-logos.png" alt="" /></p>
    </div> <!-- end.row -->

                </div> <!-- end.container -->

            </div> <!-- end#footer-top -->

            <div id="cpyr-bar">

                <div class="container">

                    <div class="row">
        <p id="cpyr" class="col-sm-7 col-md-8">Copyright &copy; 2016 National School of Business Management. All Rights Reserved.</p>
        <p class="devs col-sm-5 col-md-4 text-right hidden-xs"><a href="http://olionsoft.com.lk/services/web-design-and-development" target="_blank">Web design &amp; develop</a> with <span class="glyphicon glyphicon-heart"></span> by <a href="http://olionsoft.com.lk/" target="_blank">Olionsoft</a></p>
        <p class="devs col-md-4 visible-xs"><a href="http://olionsoft.com.lk/services/web-design-and-development" target="_blank">Web design &amp; develop</a> with <span class="glyphicon glyphicon-heart"></span> by <a href="http://olionsoft.com.lk/" target="_blank">Olionsoft</a></p>
    </div> <!-- end.row -->

                </div>

            </div> <!-- end#cpyr-bar -->

        </footer>

    </div> <!-- end#main-container -->

    <!-- Modal Dev Profiles -->

    <div id="modal-devs" class="modal fade" role="dialog" aria-hidden="true">

        <div class="modal-dialog">

            <div class="modal-content">

                <div class="modal-body">

                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>

                    <div class="row">
                        <div class="col-sm-10 col-sm-offset-1 col-xs-12">
                            <p class="text-center"><img id="cup" src="../img/icons/trophy.png" alt="" /></p>
                            <p class="h1 text-center lead">Designed &amp; Developed by Winners of NSC 2014.</p>
                        </div>
                    </div>

                    <div class="row">

                        <div class="col-xs-6 profile">
                            <p class="text-center"><a href="https://www.linkedin.com/in/milroyfraser" target="_blank"><img class="avatar img-circle" src="../img/profiles/devs/profile-milroy.jpg" alt="Milroy Fraser" /></a></p>
                            <p class="text-center name"><a href="https://www.linkedin.com/in/milroyfraser" target="_blank">Milroy</a></p>
                            <p class="text-center title">Software Engineer</p>
                        </div>

                        <div class="col-xs-6 profile">
                            <p class="text-center"><a href="https://www.linkedin.com/in/ruwanlokubalasooriya" target="_blank"><img class="avatar img-circle" src="../img/profiles/devs/profile-ruwan.jpg" alt="Ruwan Lokubalasooriya" /></a></p>
                            <p class="text-center name"><a href="https://www.linkedin.com/in/ruwanlokubalasooriya" target="_blank">Ruwan</a></p>
                            <p class="text-center title">UI Engineer</p>
                        </div>

                    </div>

                </div> <!-- end.modal-body -->

            </div> <!-- end.modal-content -->

        </div> <!-- end.modal-dialog -->

    </div> <!-- end.modal -->

    <a id="back2top" class="back2top hidden-xs" href="#nav-home">Top</a>


	
    <script type="text/javascript" src="../build/js/site-4dd49a43b0.js"></script>

    <script type="text/javascript">

        jQuery(document).ready(function($){

            // Back to Top

            var offset = 300,
                    offset_opacity = 1200,
                    scroll_top_duration = 700,
                    $back_to_top = $('.back2top');

            $(window).scroll(function(){
                ( $(this).scrollTop() > offset ) ? $back_to_top.addClass('back2top-visible') : $back_to_top.removeClass('back2top-visible back2top-fadeout');
                if( $(this).scrollTop() > offset_opacity ) {
                    $back_to_top.addClass('back2top-fadeout');
                }
            });

            $back_to_top.on('click', function(event){
                event.preventDefault();
                $('body,html').animate({
                            scrollTop: 0 ,
                        }, scroll_top_duration
                );
            });

        });

    </script>


	
<script type="text/javascript">

    $( document ).ready(function() {

        
        $('#hero-cover-course-info').css('background','url("../img/course/4XgfVGQTMp1k2uPzJ4vM65Ul8xhxcN6W.jpg") no-repeat center center');

    });

</script>


</body>


<!-- Mirrored from nsbm.lk/programmes/bsc-in-multimedia by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 12 Sep 2016 00:41:19 GMT -->
</html>
