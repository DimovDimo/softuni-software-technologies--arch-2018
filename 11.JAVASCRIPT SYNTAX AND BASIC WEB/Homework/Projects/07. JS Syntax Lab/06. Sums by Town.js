function sumsByTown(inputArr) {
    //console.log(inputArr);
    //let obgects = inputArr.map(JSON.parse);
    //console.log(obgects);
    let sums = {};
    for (let obj of inputArr) {
        obj = JSON.parse(obj);
        //console.log(obj);
        if (obj.town in sums){
            sums[obj.town] += obj.income;
        } else {
            sums[obj.town] = obj.income;
        }
    }
    //console.log(towns);
    let towns = Object.keys(sums).sort();
    for (let town of towns) {
        console.log(`${town} -> ${sums[town]}`)
    }
}