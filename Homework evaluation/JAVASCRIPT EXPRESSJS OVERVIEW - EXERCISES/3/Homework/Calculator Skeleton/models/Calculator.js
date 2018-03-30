function Calculator(leftOperand, operator, rightOperand) {
    this.leftOperand = leftOperand;
    this.operator = operator;
    this.rightOperand = rightOperand;

    this.calculateResult = function () {
        let result = 0;

        switch (this.operator){
            case "+": result = this.leftOperand + this.rightOperand;
                break;
            case "-": result = this.leftOperand - this.rightOperand;
                break;
            case "*": result = this.leftOperand * this.rightOperand;
                break;
            case "/": result = this.leftOperand / this.rightOperand;
                break;
            case "^": result = Math.pow(this.leftOperand, this.rightOperand);
                break;
            case "Rnd": result = this.leftOperand * this.rightOperand / 12 * 27 + 1 * 2007 / 3;
                break;
        }
        return result;
    }
}
module.exports = Calculator;