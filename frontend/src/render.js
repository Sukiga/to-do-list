var now = new Date();

var day = now.getDate();
var month = now.getMonth();
var year = now.getFullYear();

document.getElementById("day").innerHTML = `${day}`;
document.getElementById("month").innerHTML = `${month}`;
document.getElementById("year").innerHTML = `${year}`;
