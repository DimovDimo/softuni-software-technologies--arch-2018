function largest3Numbers(numsInput) {
    //console.log(numsInput);
    let nums = numsInput.map(Number);
    //console.log(nums);
    let numsDec = nums.sort((a,b) => b-a);
    //console.log(numsDec);
    let first3 = numsDec.slice(0, 3);
    //console.log(first3);
    for (let num of first3) {
        console.log(num);
    }
}