function productOf3Numbers(nums) {
    let numX = Number(nums[0]);
    let numY = Number(nums[1]);
    let numZ = Number(nums[2]);
    let result = "";
    if(numX === 0 || numY === 0 || numZ === 0){
        result = "Positive";
    } else {
        let coutNegativeNumbers = countNegativeNums(nums);
        if(coutNegativeNumbers % 2 !== 0){
            result = "Positive";
        } else {
            result = "Negative";
        }
    }

    return result;

    function countNegativeNums(nums) {
        let count = 0;
        for (let num of nums) {
            if(Number(num) > 0){
                count++;
            }
        }

        return count;
    }
}