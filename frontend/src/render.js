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
let number = 0;

function addTask() {
    let div = document.createElement("div");
    div.classList.add("task");
    div.id = generateId();
    div.innerHTML = "<div id='input' contentEditable='true'></div>";
    listCon.appendChild(div);
    let deletes = document.createElement("span");
    deletes.classList.add("deletes");
    deletes.innerHTML = "\u00d7";
    div.appendChild(deletes);
}

function generateId() {
    number ++;
    return "task-" + number;
}

listCon.addEventListener("click", function(e) {
    if (e.target.classList.contains("task")){
        e.target.classList.toggle("checked");
    }
    else if (e.target.tagName == "SPAN"){
        e.target.parentElement.remove();
    }
}, false);

