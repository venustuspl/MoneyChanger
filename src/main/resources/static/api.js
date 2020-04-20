
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
            li.innerHTML = `${rate.currency} : ${rate.code} : ${rate.mid} `; // Make the HTML of our span to be the first and last name of our author
            append(li, span);
            append(opt, li);
        })
    });
