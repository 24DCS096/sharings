<button onclick="playVideo()">Play</button>
<button onclick="pauseVideo()">Pause</button>

<script>
  const video = document.querySelector("video");

  function playVideo() {
    video.play();
  }

  function pauseVideo() {
    video.pause();
  }

fetch("getVideo.php")
  .then(res => res.json())
  .then(data => {
    document.querySelector("video source").src = data.video_url;
  });
</script>
