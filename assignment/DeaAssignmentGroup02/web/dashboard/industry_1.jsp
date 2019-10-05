<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.dea.bean.user"%>
<!DOCTYPE html>
<html lang="en">


<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Company Dashboard | Smart Hub of NSBM Green University Town </title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-title" content="NSBM">
    <meta name="application-name" content="NSBM">

    <meta property="og:type" content="website" />
    <meta property="og:url" content="news.jsp" />
    <meta property="og:title" content="NSBM: News and Events" />
    <meta property="og:description" content="Stay connected with latest announcements and events." />
    <meta property="og:image" content="img/about/84573268.jpg" />
    <meta property="fb:app_id" content="833486563412429" />
    <meta name="twitter:card" content="summary_large_image" />
    <meta name="twitter:site" content="@nsbmlk" />
    <meta name="twitter:creator" content="@nsbmlk" />
    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="msapplication-TileImage" content="img/favicons/mstile-144x144.jsp">

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

    <script src="file:///E|/OneDrive/My Uni Life/Projects/2nd Year/J2EE/J2EE Project/apis.google.com/js/platform.js" async defer></script>

    <script>

        /* Google Analytics */

        (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function() {
            (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
            m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
        })(window,document,'script','../www.google-analytics.com/analytics.js','ga');
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
            js.src = "../connect.facebook.net/en_US/sdk.js";
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

                            <li class="">
                                <a href="../ideahub/index.jsp">Idea Hub</a>
                                
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

                        <li class="">
                            <a href="../programmes.jsp">Programmes</a>
                        </li>

                        <li class="active">
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

        <div id="sub-header" class="hidden-xs">

            <div class="container">

                <div class="row">

                    <div class="col-md-6 hidden-sm">

        
            <div id="header-breadcrumb">

                 <ol class="breadcrumb">
                    <li><a href="index.jsp"><span class="glyphicon glyphicon-home"></span></a></li>

                        <li class="active">
                                                
                          Company Dashboard
                        
                                            </li>
                      
                       
                    </ol>


            </div> <!-- end#header-breadcrumb -->

        
    </div>

                    <div class="col-sm-12 col-md-6">

        <div class="pull-right">

            <strong>You are logged in as Guest!</strong>

      
        </div>

                </div> <!-- end.row -->

            </div> <!-- end.container -->

        </div> <!-- end#sub-header -->

        
    <div class="inner-container">

        <div class="content-wrapper">
            <div class="container">

                <div class="row">
<h1>Hi, 99x Technology </h1>
                    <div class="col-md-8 left-aside">
						
<hr>
						
						
						<p class="h3 mb-lg">Event Calendar</p>
						
						
						<div id="calendar">
						
					
						
						
					 <form method="POST" action="" accept-charset="UTF-8"><input name="_token" type="hidden" value="">


                            <div class="row">

                                 <div class="form-group col-sm-6">
                                    <label>Check an event <span class="req">&#42;</span></label>
                                    <input type='date' class="form-control datetimepicker" name="event">
                                </div>
                               
                             <br>
                                <div class="form-group col-sm-3">
                                    
                                    <input class="btn btn-lg btn-block btn-green" class="form-control" type="submit" value="Search">
                                </div>
                               

                            </div>
						
                        
                        </form>
				
						
						
						</div>
                                                
                                                <%
            
      Connection conn=null;
              PreparedStatement pst=null;
              ResultSet rs=null;
           
            String dates=request.getParameter("event");
            
            
            Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dea","root","");
            
            
            try{
           String sql="SELECT  * FROM dates WHERE date='"+dates+"'";
         
               pst=conn.prepareStatement(sql);
                rs = pst.executeQuery();
                
           %>
             <table >
              <thead>
                <tr>
                  <th>Date</th>
                  <th>Event</th>
                  <th>University</th>
                   <th>Add Comments</th>
                </tr>
              </thead>
              
              <tbody>
                   <%
                
                while(rs.next()){
                    %>
                          <tr><td>
                    <%

             out.print(rs.getString(1));
            
             %>
                            </td>
                          <td>
                    <%

            
             out.print(rs.getString(2));
             
             %>
                            </td>
                          <td>
                    <%

             
             out.print(rs.getString(4));
             %>
                            </td>
                           <td>
                            <a href='../Events_comment/Industry_Event_comment.jsp?id=<%= rs.getString(3)%>'>Add Comment</a>
                            </td>
                          </tr>
             <%
           
             
            }
            %>
                          
               
            
            <%
             conn.close();
                
            
            }
            catch(Exception e){
                out.print("something went wrong");
            }


         %>
               
              </tbody>
            </table>
						
						
						
						
						
						
						
						
<hr>
                        
                        <form method="POST" action="" accept-charset="UTF-8"><input name="_token" type="hidden" value="" enctype="multipart/form-data">

                            <input name="course_id" type="hidden" value="7">

                            <p class="h3 mb-lg">Write a Post</p>

                            
            
                           

           

                                <div class="form-group col-sm-12">
                                    <label>Title <span class="req">&#42;</span></label>
                                    <input type="text" class="form-control" required="required" name="uname">
                                </div>

							
							 <div class="form-group col-sm-12">
                                    <label>Publish Date <span class="req">&#42;</span></label>
                                    <input type='text' class="form-control datetimepicker">
                                </div>
							
                              <div class="form-group fg-textarea col-sm-12">
                                <label>Description <span class="req">&#42;</span></label>
                                <textarea class="form-control" placeholder="What's on your mind..?" rows="6" style="height: 173px;" required name="message" cols="20" maxlength="5000"></textarea>
                            </div>
                           
                             <div class="form-group col-sm-12">
                                    <label>Add a Photo <span class="req">&#42;</span></label>
                                    <input type="file" class="form-control" required="required" name="image" accept="image/*">
                                </div>
                       

                           
                           
                              
                            <br>
 
                            <input class="btn btn-lg btn-block btn-green" type="submit" value="SHARE MY POST" col-sm-12>
							<input class="btn btn-lg btn-block btn-red" type="reset" value="RESET" col-sm-12>

                        </form>
<br><br><br><br><br>
                    </div> <!-- end.left-aside -->

                    <div class="col-md-4 panel-aside">

                        <div class="mb-lg visible-xs visible-sm"></div>


    <div class="panel-widget tmonials-panel" style="padding-top: 0px;">

        
      
    </div> <!-- end.panel-widget -->


                        <div class="mb-lg visible-xs visible-sm"></div>

<!-- <div class="panel-widget">

   
    

        <a class="btn btn-sm link" href="#">Explore Now <span class="glyphicon glyphicon-chevron-right small"></span></a>

    </div>

</div> --> <!-- end.panel-widget -->

<!-- <div class="panel-widget">

   

</div> --> <!-- end.panel-widget -->

<!-- <div class="panel-widget">

   

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
        <p class="h3 panel-title">Advertiesments</p>
    </div>

    <div class="panel-body">

        <p>Lay strong foundations for a successful career, using our extensive industry links to secure industrial training giving you the vital industry experience and connections you'll need when you graduate.</p>

        <img class="img-responsive" src="img/aside/aside1.jpg" alt="">

    </div> <!-- end.panel-body -->

</div> <!-- end.panel-widget -->

                    </div> <!-- end.panel-aside -->

                </div> <!-- end.row -->

            </div> <!-- end.container -->
            <div class="container">

                <div class="row">

                    <h1 class="h2 header section-title text-center">Published Posts </h1>

                    <br><br>

                </div> <!-- end.row -->

                <div class="row">

                    <div id="section-news">

                        <div id="posts">

                            
                                <div class="col-sm-6 col-md-4">

                                    <div class="news-card bxsw-1x">

                                        <a class="img-wrapper" href="../news/school-of-engineering.jsp" title="School of Engineering ">
                                                                                            <img class="img-responsive" src="../img/news/thumbs/lPnAqkJ3aPMAIxAtblAqQ2JwQkc67rTP.jpg" alt="">
                                                                                    </a>

                                        <div class="inner-card">
                                            <p class="title"><a href="../news/school-of-engineering.jsp" title="School of Engineering ">School of Engineering </a></p>
                                                                                        <p class="datetime"><small><span class="glyphicon glyphicon-calendar"></span> 14th of July 2018</small></p>
                                            <p class="desc">NSBM is working towards offering Degree programmes in Engineering. Initially, these programmes will be offered in the following three disciplines:

&middot;         Electrical...</p>
                                            <p><a class="url" href="../news/school-of-engineering.jsp"><i class="fa fa-chevron-circle-right small color-apple"></i> Read More</a></p>
                                        </div> <!-- end.inner-card -->

                                    </div> <!-- end.news-card -->

                                </div>

                            
                                <div class="col-sm-6 col-md-4">

                                    <div class="news-card bxsw-1x">

                                        <a class="img-wrapper" href="../news/ceovice-chancellor-of-nsbm-dr-e-a-weerasinghe-honoured-at-jayewardenepura-pradeepa-annual-awards-ceremony-of-the-alumni-association-of-usjp.jsp" title="CEO/Vice Chancellor of NSBM, Dr E A Weerasinghe honoured at &ldquo;Jayewardenepura Pradeepa&rdquo; &ndash; Annual Awards Ceremony of the Alumni Association of USJP">
                                                                                            <img class="img-responsive" src="../img/news/thumbs/LNnehY2GNuyt8bpXyEXL4pxiUXKMkBQV.jpg" alt="">
                                                                                    </a>

                                        <div class="inner-card">
                                            <p class="title"><a href="#">CEO/Vice Chancellor of NSBM, Dr E A Weerasinghe honoure...</a></p>
                                                                                        <p class="datetime"><small><span class="glyphicon glyphicon-calendar"></span> 14th of July 2018</small></p>
                                            <p class="desc">University of Sri Jayewardenepura has been home for many distinguished personalities throughout the ages, producing many visionary men and women who&rsquo;ve brightened the liv...</p>
                                            <p><a class="url" href="../news/ceovice-chancellor-of-nsbm-dr-e-a-weerasinghe-honoured-at-jayewardenepura-pradeepa-annual-awards-ceremony-of-the-alumni-association-of-usjp.jsp"><i class="fa fa-chevron-circle-right small color-apple"></i> Read More</a></p>
                                        </div> <!-- end.inner-card -->

                                    </div> <!-- end.news-card -->

                                </div>

                            
                                <div class="col-sm-6 col-md-4">

                                    <div class="news-card bxsw-1x">

                                        <a class="img-wrapper" href="../news/visit-to-stockholm-university.jsp" title="Visit to Stockholm University">
                                                                                            <img class="img-responsive" src="../img/news/thumbs/iPa3O4dDfrYQmwGwp2d96GjNcEOUPpLZ.jpg" alt="">
                                                                                    </a>

                                        <div class="inner-card">
                                            <p class="title"><a href="../news/visit-to-stockholm-university.jsp" title="Visit to Stockholm University">Visit to Stockholm University</a></p>
                                                                                        <p class="datetime"><small><span class="glyphicon glyphicon-calendar"></span> 14th of July 2018</small></p>
                                            <p class="desc">The Department of Computer and Systems Sciences and Stockholm University was visited by the Vice Chancellor of the National School of Business Management (NSBM) last week...</p>
                                            <p><a class="url" href="../news/visit-to-stockholm-university.jsp"><i class="fa fa-chevron-circle-right small color-apple"></i> Read More</a></p>
                                        </div> <!-- end.inner-card -->

                                    </div> <!-- end.news-card -->

                                </div>

                            
                                <div class="col-sm-6 col-md-4">

                                    <div class="news-card bxsw-1x">

                                        <a class="img-wrapper" href="../news/nsbm-corporate-planning-session.jsp" title="NSBM Corporate Planning session">
                                                                                    </a>

                                      <!-- end.inner-card -->

                                  </div> 
                                    <!-- end.news-card -->

                                </div>

                            
                                <div class="col-sm-6 col-md-4">

                                    <div class="news-card bxsw-1x">

                                        <a class="img-wrapper" href="../news/victoria-university-engineering-degrees-at-nsbm.jsp" title="Visit from the Victoria University">
                                                                                    </a>

                                      <!-- end.inner-card -->

                                  </div> 
                                    <!-- end.news-card -->

                                </div>

                            
                          <div class="col-sm-6 col-md-4">

                                    <div class="news-card bxsw-1x">

                                        <a class="img-wrapper" href="../news/nsbm-swimming-team-became-the-overall-champions.jsp" title="NSBM Swimming Team became the overall Champions">
                                                                                    </a>                                        <!-- end.inner-card -->

                                    </div> <!-- end.news-card -->

                                </div>

                            
                                <div class="col-sm-6 col-md-4">

                                    <div class="news-card bxsw-1x">

                                        <a class="img-wrapper" href="../news/introduction-to-electronics-and-arduino.jsp" title="Workshop on Introduction to Electronics and Arduino">
                                                                                    </a>

                                      <!-- end.inner-card -->

                                  </div> 
                                    <!-- end.news-card -->

                          </div>

                            
                                <div class="col-sm-6 col-md-4">

                                    <div class="news-card bxsw-1x">

                                        <a class="img-wrapper" href="../news/nsbm-initiate-drug-control-degree-programmes-business-it-creative-architecture.jsp" title="NSBM joins hands to initiate Drug control">
                                                                                    </a>

                                      <!-- end.inner-card -->

                                  </div> 
                                    <!-- end.news-card -->

                                </div>

                            
                                <div class="col-sm-6 col-md-4">

                                    <div class="news-card bxsw-1x">

                                        <a class="img-wrapper" href="../news/gdg-sri-lanka-workshop-on-google-cloud-platform-at-nsbm.jsp" title="GDG Sri Lanka workshop on Google Cloud Platform">
                                                                                    </a>

                                      <!-- end.inner-card -->

                                  </div> 
                                    <!-- end.news-card -->

                                </div>

                            
                        </div> <!-- end#posts -->

                    </div> <!-- end#section-news -->

                </div> <!-- end.row -->

                <div class="row text-center">
                    <ul class="pagination"><li class="disabled"><span>&laquo;</span></li> <li class="active"><span>1</span></li><li><a href="#">2</a></li></ul>
                </div>

            </div> <!-- end.container -->

        </div> <!-- end.content-wrapper -->

    </div> <!-- end.inner-container -->


         <footer>

            <div id="footer-top">

                <div class="container">

                    <div id="quick-links" class="row">

        <ul class="col-xs-12 col-sm-3">
            <li><h3><a href="contact">Contact Us</a></h3></li>
            <li>Smart Valley Sri Lanka,</li>
            <li>NSBM Green University Town,</li>
            <li>Homagama,</li>
            <li>Sri Lanka.</li>
            <br>
            <li>Hotline: <a href="tel:+94773063552">+94 (77) 431 9431</a></li>
            <li>Tel: <a href="tel:+94114876339">+94 (11) 487 6339</a></li>
            <li>Fax: <a href="tel:+94112395348">+94 (11) 239 5348</a></li>
            <br>
            <li>Email: <a href="mailto:hello@smarthub.lk">hello@smarthub.lk</a></li>
        </ul>

        <ul class="col-xs-12 col-sm-3">
            <li><h3><a class="unlink" href="#"> Parties</a></h3></li>
            <li><a href="products-coir"><span class="glyphicon glyphicon-link"></span> Students</a></li>
            <li><a href="products-horticultural"><span class="glyphicon glyphicon-link"></span> Universities</a></li>
            <li><a href="products-errosion"><span class="glyphicon glyphicon-link"></span>Industries</a></li>
        </ul>

        <ul class="col-xs-12 col-sm-3">
            <li><h3><a class="unlink" href="#">Quick Links</a></h3></li>
            <li><a href="index"><span class="glyphicon glyphicon-link"></span> Home</a></li>
            <li><a href="about-us"><span class="glyphicon glyphicon-link"></span> About</a></li>
            <li><a href="products"><span class="glyphicon glyphicon-link"></span> Public Posts</a></li>
        
            <li><a href="career-guidance-and-industrial-training"><span class="glyphicon glyphicon-link"></span> Career Guidance</a></li>
            <li><a href="contact"><span class="glyphicon glyphicon-link"></span> Contact Us</a></li>
            <li><a href="sitemap"><span class="glyphicon glyphicon-link"></span> Sitemap</a></li>
        </ul>

        <ul class="col-xs-12 col-sm-3 col-social">
            <li><h3><a class="unlink" href="#">Find Us On</a></h3></li>
            <li>
                <a class="url" href="http://www.facebook.com/" target="_blank"><span id="icon-facebook"></span> Facebook</a>
            </li>
            <li>
                <a class="url" href="https://twitter.com/" target="_blank"><span id="icon-twitter"></span> Twitter</a>
            </li>
            <li>
                <a class="url" href="https://www.linkedin.com/profile/" target="_blank"><span id="icon-linkedin"></span> LinkedIn</a>
            </li>
            <li>
                <a class="url" href="http://www.youtube.com/channel/" target="_blank"><span id="icon-youtube"></span> YouTube</a>
            </li>
        </ul>

    </div> <!-- end.row -->

    <div id="branding" class="row">
       <!--<p class="col-xs-12"><img class="img-responsive" src="img/logos/" alt="Branding" /></p> -->
    </div> <!-- end.row -->

                </div> <!-- end.container -->

            </div> <!-- end#footer-top -->

            <div id="cpyr-bar">

                <div class="container">

                    <div class="row">
                      <p id="cpyr" class="col-sm-7 col-md-8">Copyright &copy; 2018 Smart Valley. All Rights Reserved.</p>
						<p class="devs col-sm-5 col-md-4 text-right hidden-xs">System develop &amp; maintain with <span class="glyphicon glyphicon-heart"></span> by <a href="http://smartvalley.lk" target="_blank"><font color="#FFB406">Smart Valley</font></a></p>
                      <p class="devs col-md-4 visible-xs">System develop &amp; maintain with <span class="glyphicon glyphicon-heart"></span> by <a href="http://smartvalley.lk" target="_blank"><font color="#FFB406">Smart Valley</font></a></p>
    </div> <!-- end.row -->

                </div>

            </div> <!-- end#cpyr-bar -->

        </footer>

    </div> <!-- end#main-container -->

   

    <a id="back2top" class="back2top hidden-xs" href="#nav-home">Top</a>


	
    <script type="text/javascript" src="build/js/site-4dd49a43b0.js"></script>

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

            // Sets Cover Image
            
            
            $('#hero-cover-course-apply').css('background','url("../../img/course/ZM4AZ70ql5eMmkQBgI9k9Hd6qZRCBczh.jpg") no-repeat center center');

            // Datetimepicker

            $('.datetimepicker').datetimepicker({
                format: 'YYYY-MM-DD'
            });

            // SelectOrDie

            $("select").selectOrDie();

        });

    </script>

		
		
		


<script type="text/javascript">
function googleTranslateElementInit() {
  new google.translate.TranslateElement({pageLanguage: 'en', includedLanguages: 'de,fr,id,it,ja,jv,ko,zh-CN,zh-TW', layout: google.translate.TranslateElement.InlineLayout.SIMPLE}, 'google_translate_element');
}
</script><script type="text/javascript" src="//translate.google.com/translate_a/element.js?cb=googleTranslateElementInit"></script>




</body>



</html>
