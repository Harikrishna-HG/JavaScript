<?php
require_once 'Connection.php';

$sql = "SELECT * FROM students";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
  echo '<table border="2" cellpadding="10" cellspacing="0" style="border-color: black;">';
  echo '<tr><th>S.NO</th><th>Name</th><th>Email</th><th>Action</th></tr>';
  $i = 1;
  while ($row = $result->fetch_assoc()) {
    echo "<tr>";
    echo "<td>$i</td>";

    echo "<td>" . $row["firstname"] . " " . $row["lastname"] . "</td>";
    echo "<td>" . $row["email"] . "</td>";
    echo '<td><a href="edit.php?id=' . $row["id"] . '" style="text-decoration:none">Edit</a> <a href="delete.php?id=' . $row["id"] . '" style="color:red; text-decoration:none">Delete</a></td>';
    echo "</tr>";
    $i++;
  }
  echo "</table>";
} else {
  echo "No record found";
}
?>
