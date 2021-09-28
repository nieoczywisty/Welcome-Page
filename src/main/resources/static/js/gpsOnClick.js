window.onload = function () {

    let mapButton = document.getElementById("showMap");
    mapButton.onclick = drawMap;
}
function drawMap(){

    let mapFrame = document.createElement('iframe');
    mapFrame.id = "mapFrame";
    mapFrame.width="800"
    mapFrame.height="600"
    mapFrame.src = "/getGpsData"
    document.getElementById("mapPlaceholder").appendChild(mapFrame);
    console.log(document.getElementById("mapPlaceholder"));
}