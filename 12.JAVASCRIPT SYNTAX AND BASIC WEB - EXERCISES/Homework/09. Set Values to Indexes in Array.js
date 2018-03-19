function setValuesToIndexesInArray(lines) {
    let count = Number(lines[0]);
    let nums = [];
    for (let line of lines) {
        let splitet = line.split(" - ");
        let index = Number(splitet[0]);
        let value = splitet[1];
        nums[index] = value;
    }

    for (var i = 0; i < count; i++) {
        let num = nums[i];
        if(num !== undefined){
            console.log(num);
        } else {
            console.log(0);
        }
    }
}

//setValuesToIndexesInArray(["3", "0 - 5", "1 - 6", "2 - 7"])
setValuesToIndexesInArray(["3", "0 - 5", "0 - 6", "0 - 7"])