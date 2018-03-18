function solve(input) {
    let nums = input[0].split(' ').map(Number);
    let num1 = nums[0];
    let num2 = nums[1];
    let num3 = nums[2];
    //console.log(input);
    //console.log(nums);
    //console.log(num1);

    let result = "";
    if (num1 + num2 == num3){
        result = `${Math.min(num1, num2)} + ${Math.max(num1, num2)} = ${num3}`;
    } else if (num2 + num3 == num1){
        result = `${Math.min(num2, num3)} + ${Math.max(num2, num3)} = ${num1}`;
    } else if (num1 + num3 == num2){
        result = `${Math.min(num1, num3)} + ${Math.max(num1, num3)} = ${num2}`;
    } else {
        result = "No";
    }

    console.log(result);
    //let currentString =
    //    check(num1, num2, num3) ||
    //    check(num3, num2, num1) ||
    //    check(num1, num3, num2) || 'No';
    //if (currentString === "No"){
    //    console.log(currentString);
    //}

    function check(num1, num2, num3) {
        if(num1 + num2 != num3){
            return false;
        }

        if (num1 > num2){
            [num1, num2] = [num2,  num1];
        }
        console.log(`${num1} + ${num2} = ${num3}`);
        return true;
    }
}

solve("8 15 7");
solve("-5 -3 -2");
solve("3 8 12");
solve("0 0 0");
solve(["2 1 1"]);