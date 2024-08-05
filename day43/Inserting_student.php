<?php

require_once 'Connection.php';

$sql="Insert into students (firstname, lastname, email) values('Harikrishna', 'Gautam',
'harishgautam@gmail.com')";

if($conn->query($sql)==true)
{
echo"student record inserted successfully";
}
else
{
echo"Eroor inserting record".$conn->error;
}

?>