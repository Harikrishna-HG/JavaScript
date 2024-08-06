<?php
session_start();
require_once "../includes/connection.php";

if(isset($_SESSION['id'])){
     header('Location:dashboard.php');
     exit();
 }

if(isset($_POST['email'])){
    $email=$_POST['email'];
    $password=$_POST['password'];
    $password=md5($password);
    $sql= "Select * from student where Email='$email' and Password='$password'";
    $result= $conn->query($sql);
    
    if($result->num_rows==1){
      
        $row=$result->fetch_assoc();
        $_SESSION['id']=$row['Id'];
        $_SESSION['email']=$row['Email'];
        $_SESSION['Name']=$row['First_Name'].' '.$row['Last_Name'];
        //die('I AM HERE');
        header("Location:dashboard.php?success=Log In");
        
        exit();
    }
    else{
        $error="Invalid username or Password";
    }
}

?>
<?php
   if(isset($_GET['success'])){
      echo '<div class="success">'.$_GET['success'] .'</div>';

   }

   if(isset($error)){
      echo '<div class="error">'.$error .'</div>';

   }

   ?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <link rel="stylesheet" href="../assets/css/style2.css">
</head>
<body>
    <div class="login_box">
        <form class="form" action="" method="post" name="login">
            <h2>Login</h2>
            <div class="input">
                <label for="email">Username:</label>
                <input type="text" id="email" name="email" required>
            </div>
            <div class="input">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <button type="submit">Login</button>
            <br>
            <br>
            <div class="input">
            dont't have account? <a href="registration.php"> Register Now </a>

            </div>

            
        </form>
    </div>
</body>
</html>