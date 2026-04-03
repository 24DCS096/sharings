<?php
$conn = new mysqli("localhost", "root", "", "video_db");

$result = $conn->query("SELECT * FROM videos LIMIT 1");
$row = $result->fetch_assoc();

echo json_encode($row);
?>
