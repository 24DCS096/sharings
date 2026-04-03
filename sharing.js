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
</script>
