<?php

$hostname = "localhost";
$username = "root";
$password = "";
$database = "classroom";

// creating connection
$conn = new mysqli($hostname, $username, $password, $database);

// checking  connection
if ($conn->connect_error) {
    die("Connection Error: " . $conn->connect_error);
}

echo "Connected to the database successfully!";

// closing the connection
$conn->close();
?>
