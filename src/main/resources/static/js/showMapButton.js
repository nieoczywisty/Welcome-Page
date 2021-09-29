let vehicles;

    window.onload = function () {
    let tableData = document.getElementById("tableJson").innerHTML;
    //console.log(tableData);
    vehicles = JSON.parse(tableData);
    let mapButton = document.getElementById("showMap");
    mapButton.onclick = drawMap;
    //console.log(mapButton);
}
function drawMap(){

    let mapFrame = document.createElement('iframe');

    mapFrame.id = "mapFrame";
    mapFrame.src = "/getGpsData"
    document.getElementById("mapPlaceholder").appendChild(mapFrame);
    document.getElementById("showMap").classList.add("hidden");
    //console.log(document.getElementById("mapPlaceholder"));
    generateTableHead();
}

function generateTableHead() {
    let table = document.createElement("table");
    table.id = "table";
    let thead = table.createTHead();

    let row_1 = document.createElement('tr');
    let heading_1 = document.createElement('th');
    heading_1.innerHTML = "Line No.";
    let heading_2 = document.createElement('th');
    heading_2.innerHTML = "Speed [km/h]";
    let heading_3 = document.createElement('th');
    heading_3.innerHTML = "Delay [sec]";

    row_1.appendChild(heading_1);
    row_1.appendChild(heading_2);
    row_1.appendChild(heading_3);
    thead.appendChild(row_1);
    table.appendChild(thead);
    document.getElementById("mapPlaceholder").appendChild(table);

    generateTable();

}

function generateTable() {

    let tbody = document.createElement('tbody');

    for (let i = 0; i < 10 ; i++) {
        let row_2 = document.createElement('tr');
        let row_2_data_1 = document.createElement('td');
        row_2_data_1.innerHTML = vehicles[i].line;
        let row_2_data_2 = document.createElement('td');
        row_2_data_2.innerHTML = vehicles[i].speed;
        let row_2_data_3 = document.createElement('td');
        row_2_data_3.innerHTML = vehicles[i].delay;

        row_2.appendChild(row_2_data_1);
        row_2.appendChild(row_2_data_2);
        row_2.appendChild(row_2_data_3);
        tbody.appendChild(row_2);

        document.getElementById("table").appendChild(tbody);
    }
}
