function multipleValuesForAKey(lines) {
    let object =  {};
    for (let i = 0; i < lines.length - 1; i++) {
        let splited = lines[i].split(" ");
        let key = splited[0];
        let value = splited[1];
        let currentArr = object[key];
        if(currentArr === undefined){
            currentArr = [];
        }

        currentArr.push(value);
        object[key] = currentArr;
    }

    let keyForPrint = lines[lines.length - 1];
    let valuesForPrint = object[keyForPrint];
    if(valuesForPrint !== undefined){
        for (let value of valuesForPrint) {
            console.log(value);
        }
    } else {
        console.log("None");
    }
}

multipleValuesForAKey(["3 test", "3 test1", "4 test2", "4 test3", "4 test5", "4"])