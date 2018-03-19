function parseJSONObjects(text) {
    //let str = "{\"name\":\"Nakov\",\"age\":24}"
    //let obj = JSON.parse(str)
    //console.log(obj)
    for (let line of text) {
        //console.log(line);
        //let jsonParse = line;
        let currentObject = JSON.parse(line);
        //console.log(currentObject);
        console.log(`Name: ${currentObject.name}`);
        console.log(`Age: ${currentObject.age}`);
        console.log(`Date: ${currentObject.date}`);
    }
}

//parseJSONObjects(["{\"name\":\"Gosho\",\"age\":10,\"date\":\"19/06/2005\"}"]);
parseJSONObjects(["{\"name\":\"Nakov\",\"age\":24}"]);