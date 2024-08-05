<?php

require_once "Connection.php"; 

$sql = "SELECT * FROM students";

$result = $conn->query($sql);

if ($result->num_rows > 0) {
    while ($row = $result->fetch_assoc()) {
        echo "Student ID is " . $row['id'] . " - Name is " . $row['firstname'] . " " . $row['lastname'] . " - Email is " . $row['email'] . '<br>';
    }
} else {
    echo "No record found";
}

?>