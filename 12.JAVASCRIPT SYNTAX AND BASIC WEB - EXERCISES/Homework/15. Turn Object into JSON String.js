function turnObjectIntoJSONString(lines) {
    let object = {};
    for (let line of lines) {
        let splited = line.split(" -> ");
        let key = splited[0];
        let value = splited[1];
        if(value == Number(value)){
            value = Number(value);
        }

        object[key] = value;
    }

    //JSONParseNumberAsString(object);
    let jsonString = JSON.stringify(object);
    console.log(jsonString);
    //function JSONParseNumberAsString(obj) {
    //    let elements = [];
    //    for(let key in obj){
    //        let val = obj[key];
    //        elements.push(`${key}":"${val}`);
    //    }
//
    //    console.log("{\"" + elements.join("\",\"") + "}\"");
    //}
}

turnObjectIntoJSONString(["er -> 6.00", "er -> ef43e"])