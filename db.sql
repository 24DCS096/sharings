CREATE DATABASE video_db;

USE video_db;

CREATE TABLE videos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(100),
  video_url VARCHAR(255)
);

INSERT INTO videos (title, video_url)
VALUES ('Demo Video', 'videos/sample.mp4');
