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
    let li = document.createElement("li");
    li.classList.add("newTask");
    li.innerHTML = "Add Task one two three four five six seven";
    listCon.appendChild(li);
    let deletes = document.createElement("span");
    deletes.classList.add("deletes");
    deletes.innerHTML = "\u00d7";
    li.appendChild(deletes);
}