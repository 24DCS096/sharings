function loadVideo() {
  fetch("backend/getVideos.php")
    .then(response => response.json())
    .then(data => {
      document.getElementById("videoSource").src = data.video_url;
      document.getElementById("videoPlayer").load();
    });
}
