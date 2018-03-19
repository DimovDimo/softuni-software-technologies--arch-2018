function multiplyDivideANumber(nums) {
    let numN = Number(nums[0]);
    let numX = Number(nums[1]);
    if(numX >= numN){
        return numN * numX;
    } else {
        return numN / numX;
    }
}