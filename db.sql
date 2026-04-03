CREATE TABLE youtube_videos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(100),
  video_id VARCHAR(50)
);

INSERT INTO youtube_videos (title, video_id)
VALUES ('My Video', 'TCE-4UzrEGw');
