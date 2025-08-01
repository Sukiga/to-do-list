var now = new Date();

var day = now.getDate();
var month = now.getMonth();
var year = now.getFullYear();

document.getElementById("day").innerHTML = `${day}`;
document.getElementById("month").innerHTML = `${month}`;
document.getElementById("year").innerHTML = `${year}`;

// event handler for adding a task
document.getElementById("addTask").onclick = function() {addTask()}

// function for adding a task
const listCon = document.getElementById("list-con");

function addTask() {
    let div = document.createElement("div");
    div.classList.add("newTask");
    div.classList.add("checked");
    div.contentEditable = "true";
    div.innerHTML = "Add";
    listCon.appendChild(div);
    let deletes = document.createElement("span");
    deletes.classList.add("deletes");
    deletes.innerHTML = "\u00d7";
    div.appendChild(deletes);
}