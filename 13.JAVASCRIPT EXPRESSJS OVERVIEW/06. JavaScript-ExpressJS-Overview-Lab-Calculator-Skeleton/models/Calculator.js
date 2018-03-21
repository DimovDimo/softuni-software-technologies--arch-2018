function Calculator(leftOperand, operator, rightOperand) {
    this.leftOperand = leftOperand;
    this.operator = operator;
    this.rightOperand = rightOperand;

    this.calculateResult = function () {
        let result = 0;

        switch (this.operator) {
            case "+":
                result = this.leftOperand + this.rightOperand;
                break;
            case "-":
                result = this.leftOperand - this.rightOperand;
                break;
            case "*":
                result = this.leftOperand * this.rightOperand;
                break;
            case "/":
                result = this.leftOperand / this.rightOperand;
                break;
            case ">":
                if(this.leftOperand > this.rightOperand){
                    result = "Yes";
                } else {
                    result = "No";
                }
                break;
            case "<":
                if(this.leftOperand < this.rightOperand){
                    result = "Yes";
                } else {
                    result = "No";
                }
                break;
            case "=":
                if(this.leftOperand === this.rightOperand){
                    result = "Yes";
                } else {
                    result = "No";
                }
                break;
            case "Pow":
                result = Math.pow(this.leftOperand, this.rightOperand);
                break;
            case "Sqrt":
                result = Math.sqrt(this.leftOperand);
                break;
        }

        return result;
    }
}

module.exports = Calculator;