'use strict';

function price1() {
	let num = document.getElementById("num1").value;
	let pri = document.getElementById("price1").getAttribute("value");
	let sum = num * parseInt(pri);
	
	document.getElementById("sum1").textContent = '￥' + formatter.format(sum);
	all = all + sum;
	document.getElementById('all').textContent = '￥' + formatter.format(all);
	
}

function price2() {
	let num = document.getElementById("num2").value;
	let pri = document.getElementById("price2").getAttribute("value");
	let sum = num * parseInt(pri);
	
	document.getElementById("sum2").textContent = '￥' + formatter.format(sum);
	all = all + sum;
	document.getElementById('all').textContent = '￥' + formatter.format(all);
	
	
}function price3() {
	let num = document.getElementById("num3").value;
	let pri = document.getElementById("price3").getAttribute("value");
	let sum = num * parseInt(pri);
	
	document.getElementById("sum3").textContent = '￥' + formatter.format(sum);
	all = all + sum;
	document.getElementById('all').textContent = '￥' + formatter.format(all);
	
}
var all = 0;
const formatter = new Intl.NumberFormat();

document.getElementById("num1").onchange = price1;
document.getElementById("num2").onchange = price2;
document.getElementById("num3").onchange = price3;


