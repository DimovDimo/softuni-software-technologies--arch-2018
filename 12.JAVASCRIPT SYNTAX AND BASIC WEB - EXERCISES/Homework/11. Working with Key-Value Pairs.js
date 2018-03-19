function workingWithKeyValuePairs(lines) {
    let object =  {};
    for (let i = 0; i < lines.length - 1; i++) {
        let splited = lines[i].split(" ");
        let key = splited[0];
        let value = splited[1];
        object[key] = value;
    }

    let keyForPrint = lines[lines.length - 1];
    let valueForPrint = object[keyForPrint];
    if(valueForPrint !== undefined){
        console.log(valueForPrint);
    } else {
        console.log("None");
    }
}