<html>
    <head>
        <title>Centraprise</title>  
        <link rel="icon" href="/images/logo.gif">
        <meta charset="utf-8" />
        <meta http-equiv="Content-type" content="text/html" />
        <meta name="viewport" content="user-scalable=no, initial-scale=1, minimal-ui, maximum-scale=1, minimum-scale=1" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet" />
        <script src="/javascript/2.1.1.jquery.min.js"></script>
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js"></script>
        <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
         <!-- Export data -->
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" crossorigin="anonymous">
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" crossorigin="anonymous">
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" crossorigin="anonymous"></script>

        <!-- Custom Theme Style -->
        <link href="/css/styles.css" rel="stylesheet">
        
        <script type="text/javascript" language="javascript">
            $('[data-toggle=offcanvas]').click(function() {
                $('.row-offcanvas').toggleClass('active');
                $('.collapse').toggleClass('in').toggleClass('hidden-xs').toggleClass('visible-xs');
            });

        </script>
    </head>
<body lang="en">

    <div class="container">
<div class="wrapper">
<div class="row row-offcanvas row-offcanvas-left">

<div class="user-list" id="user_list">
<div class="user-table">

<div class="text-left">Employee Details</div>
   <div class="text-right">
        <form action="" method="post">
            <input class="btn-src" type="text" name="valueToSearch" placeholder="Search" />
            <input class = "btn btn-info" type="submit" name="search" value="search"><br><br>
   </form> 
</div>
         
         <form class="form-horizontal" action="functions.php" method="post" name="upload-excel" enctype="multipart/form-data">
<br>
<div class="add-user-btn">
<a type="button" class="btn btn-info" href="add_company.php">Add Employee</a>
</div>

</form>
     
                    <div class="form-field">
                    <table class='table table-hover table-bordered size'>
                        <thead>
                        <tr>
                            <th><center><strong>ID</strong></center></th>
                            <th><center><strong>Name</strong></center></th>
                            <th><center><strong>Employee ID</strong></center></th>
                            <th><center><strong>Email Address</strong></center></th>
                            <th><center><strong>Phone Number</strong></center></th>
                            <th><center><strong>Joining Date</strong></center></th>
                            <th><center><strong>Salary</strong></center></th>
                            <th><center><strong>Update</strong></center></th>
                            <th><center><strong>Delete</strong></center></th>

                            </tr>
                        </thead>
                        <tbody>
                       
                        
                        </tbody>
                    </table>
                           </div>


            <div class="footer">
                 <p>Copyright &copy; <script>document.write(new Date().getFullYear())</script> Centraprise. All Rights Reserved.</p>
                </div>

      </div>
     </div>
    </div>
   </div>
  </div>
 </div>
</body>
</html>
