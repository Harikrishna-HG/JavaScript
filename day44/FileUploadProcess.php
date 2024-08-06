<!DOCTYPE html>
<html>
<body>
<form action="#" method="POST" enctype="multipart/form-data">
    <input type="file" name="image">
    <input type="submit" value="Upload">
</form>
</body>
</html>

<?php
if (isset($_FILES['image'])) {
    $errors = array();
    $file_name = $_FILES['image']['name'];
    $file_size = $_FILES['image']['size'];
    $file_temp = $_FILES['image']['tmp_name'];
    $file_type = $_FILES['image']['type'];

    // Check file size (greater than 2MB)
    if ($file_size > 2097152) {
        $errors[] = "File size must be less than 2MB.";
    }

    if (empty($errors) == true) {
        move_uploaded_file($file_temp, "images/" . $file_name);
        echo "Successfully uploaded file.";
    } else {
        print_r($errors);
    }
}
?>
