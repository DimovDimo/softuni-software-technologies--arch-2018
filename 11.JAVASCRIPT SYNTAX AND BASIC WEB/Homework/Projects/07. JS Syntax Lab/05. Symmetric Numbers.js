function solve(numAsString) {
    let num = Number(numAsString);
    for (let i = 1; i <= num; i++){
        let iAsString = i.toString();
        let iAsStringReversed = reverse(iAsString);
        if (iAsString === iAsStringReversed){
            console.log(i);
        }
    }

    function reverse(s){
        return s.split("").reverse().join("");
    }
}

solve(['750']);