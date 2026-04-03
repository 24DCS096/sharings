function loadVideo() {
  const id = document.getElementById("videoId").value;
  const player = document.getElementById("ytPlayer");

  player.src = "https://www.youtube.com/embed/" + id;
}
