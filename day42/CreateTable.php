<?php

require_once 'connection.php';

$sql = "Create table students(id int(6) unsigned auto_increment primary key, firstname varchar(30) not null, email varchar(50), reg_date timestamp)";

if($conn->query($sql)==true)
{
  echo"Student table created successfully";
}
else
{
  echo"error: ".$conn->error;
}
?>