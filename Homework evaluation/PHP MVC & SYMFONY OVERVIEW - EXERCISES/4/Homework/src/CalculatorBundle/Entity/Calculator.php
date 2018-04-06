<?php
namespace CalculatorBundle\Entity;

class Calculator
{

    private $operator;
    private $leftOperand;
    private $rightOperand;
    // TODO add class fields and properties, getters and setters

    public function getLeftOperand()
    {
        return $this->leftOperand;
    }

    public function getRightOperand()
    {
        return $this->rightOperand;
    }

    public function getOperator()
    {
        return $this->operator;
    }

    public function setLeftOperand($left)
    {
        $this->leftOperand = $left;

        return $this;
    }

    public function setRightOperand($right)
    {
        $this->rightOperand = $right;

        return $this;
    }

    public function setOperator($operator)
    {
        $this->operator = $operator;

        return $this;
    }

    public static function returnResult($operator, $left, $right)
    {
        switch ($operator) {
            case '+' : {
                return $left + $right;
                break;
            }

            case '-' : {
                return $left - $right;
                break;
            }

            case '*' : {
                return $left * $right;
                break;
            }

            case '/' : {
                return $left / $right;
                break;
            }

            case '%' : {
                return $left % $right;
                break;
            }

            case '^' : {
                return $left ** $right;
                break;
            }

            default : {
                return 0;
                break;
            }
        }
    }
}