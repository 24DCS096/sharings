CREATE DATABASE youtube_db;

USE youtube_db;

CREATE TABLE videos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(100),
  youtube_id VARCHAR(50)
);

INSERT INTO videos (title, youtube_id)
VALUES ('Demo Video', 'dQw4w9WgXcQ');
