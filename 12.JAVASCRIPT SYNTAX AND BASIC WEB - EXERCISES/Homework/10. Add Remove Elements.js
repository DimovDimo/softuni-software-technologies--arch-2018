function addRemoveElements(lines) {
    let nums = [];
    for (let line of lines) {
        let splited = line.split(" ");
        let argument = splited[0];
        if(argument === "add"){
            let number = splited[1];
            nums.push(number);

        } else if(argument === "remove"){
            let index = splited[1];
            nums.splice(index, 1);
        }
    }

    for (let num of nums) {
        console.log(num);
    }
}