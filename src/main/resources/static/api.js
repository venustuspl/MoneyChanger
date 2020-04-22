
function createNode(element) {
    return document.createElement(element); // Create the type of element you pass in the parameters
}

function append(parent, el) {
    return parent.appendChild(el); // Append the second parameter(element) to the first one
}

const ad = document.getElementById('alldata');

fetch("/alldata")
    .then((resp) => resp.json()) // Transform the data into json
    .then(function (data) {
        let rates = data; // Get the results
        return rates.map(function (rate) { // Map through the results and for each run the code below
            let li = createNode('li'), //  Create the elements we need
                span = createNode('span');
            li.innerHTML = `${rate.currency} : ${rate.code} : ${rate.mid} `; // Make the HTML of our span to be the first and last name of our author
            append(li, span);
            append(ad, li);
        })
    });

const opt = document.getElementById('alloption');

fetch("/alloption")
    .then((resp) => resp.json()) // Transform the data into json
    .then(function (data) {
        let rates = data; // Get the results
        return rates.map(function (rate) { // Map through the results and for each run the code below
            let li = createNode('option'), //  Create the elements we need
                span = createNode('span');
              li.value = `${rate.mid}`;
            li.innerHTML = `${rate.currency} : ${rate.code} : ${rate.mid}`; // Make the HTML of our span to be the first and last name of our author
            append(li, span);
            append(opt, li);
        })
    });

function calculate(){
  var rate = document.getElementById("alloption").value
  var cash = document.getElementById("cash").value ;
  var result = cash / rate;
  document.getElementById("result").innerHTML = result.toFixed(2);

}

const opt = document.getElementById('alloption2');

fetch("/alloption2")
    .then((resp) => resp.json()) // Transform the data into json
    .then(function (data) {
        let rates = data; // Get the results
        return rates.map(function (rate) { // Map through the results and for each run the code below
            let li = createNode('option'), //  Create the elements we need
                span = createNode('span');
              li.value = `${rate.mid}`;
            li.innerHTML = `${rate.currency} : ${rate.code} : ${rate.mid}`; // Make the HTML of our span to be the first and last name of our author
            append(li, span);
            append(opt, li);
        })
    });

const opt = document.getElementById('alloption3');

fetch("/alloption3")
    .then((resp) => resp.json()) // Transform the data into json
    .then(function (data) {
        let rates = data; // Get the results
        return rates.map(function (rate) { // Map through the results and for each run the code below
            let li = createNode('option'), //  Create the elements we need
                span = createNode('span');
              li.value = `${rate.mid}`;
            li.innerHTML = `${rate.currency} : ${rate.code} : ${rate.mid}`; // Make the HTML of our span to be the first and last name of our author
            append(li, span);
            append(opt, li);
        })
    });


function calculate2(){
  var rate2 = document.getElementById("alloption2").value
  var cash2 = document.getElementById("cash").value ;
  var rate3 = document.getElementById("alloption3").value
  var result = cash * rate2 / rate3;
  document.getElementById("result2").innerHTML = result.toFixed(2);

}
