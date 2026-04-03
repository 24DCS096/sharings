function loadFromDB() {
  fetch("GetVideo")
    .then(res => res.json())
    .then(data => {
      document.getElementById("ytPlayer").src =
        "https://www.youtube.com/embed/" + data.id;
    });
}
