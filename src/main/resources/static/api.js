
function createNode(element) {
    return document.createElement(element); // Create the type of element you pass in the parameters
}

function append(parent, el) {
    return parent.appendChild(el); // Append the second parameter(element) to the first one
}

const ad = document.getElementById('alldata');

fetch("/alloption")
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

const opt2 = document.getElementById('alloption2');

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
            append(opt2, li);
        })
    });

const opt3 = document.getElementById('alloption3');

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
            append(opt3, li);
        })
    });


function calculate2(){
  var rate2 = document.getElementById("alloption2").value
  var cash2 = document.getElementById("cash2").value ;
  var rate3 = document.getElementById("alloption3").value
  var result = cash2 * rate2 / rate3;
  document.getElementById("result2").innerHTML = result.toFixed(2);

}

const gp = document.getElementById('goldresult');

fetch("/goldprice")
    .then((resp) => resp.json()) // Transform the data into json
    .then(function (data) {
        let rates = data; // Get the results
        return rates.map(function (rate) { // Map through the results and for each run the code below
            let li = createNode('li'), //  Create the elements we need
                span = createNode('span');
            li.innerHTML = `${rate.price}`; // Make the HTML of our span to be the first and last name of our author
            append(li, span);
            append(gp, li);
        })
    });

const btc = document.getElementById('btcrate');

fetch("/coinrate?symbol=BTCUSDT")
    .then((resp) => resp.json()) // Transform the data into json
    .then(function (data) {
        let rates = data; // Get the results
        return rates.map(function (rate) { // Map through the results and for each run the code below
            let li = createNode('li'), //  Create the elements we need
                span = createNode('span');
            li.innerHTML = `${rate.price} oo`; // Make the HTML of our span to be the first and last name of our author
            append(li, span);
            append(btc, li);
        })
    });

const eth = document.getElementById('ethrate');

fetch("/coinrate?symbol=ETHUSDT")
    .then((resp) => resp.json()) // Transform the data into json
    .then(function (ethdata) {
        let ethrates = data; // Get the results
        return ethrates.map(function (ethrate) { // Map through the results and for each run the code below
            let li = createNode('li'), //  Create the elements we need
                span = createNode('span');
            li.innerHTML = `${ethrate.symbol}${ethrate.cena} oo`; // Make the HTML of our span to be the first and last name of our author
            append(li, span);
            append(eth, li);
        })
    });
