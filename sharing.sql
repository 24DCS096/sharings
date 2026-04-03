CREATE TABLE videos (
  id INT PRIMARY KEY AUTO_INCREMENT,
  title VARCHAR(100),
  video_url VARCHAR(255)
);

INSERT INTO videos (title, video_url)
VALUES ('Sample Video', 'videos/video.mp4');
