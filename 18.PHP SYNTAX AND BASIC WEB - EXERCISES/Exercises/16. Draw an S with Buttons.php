<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
<?php
for($i=1; $i<=9; $i++){
    if($i == 1 || $i == 5 || $i == 9){
        blueRow();
    } else if($i > 1 && $i < 5){
        onlyRightBlue();
    } else {
        onlyLeftBlue();
    }
}

function blueRow(){
    for($j=1; $j<=5; $j++){
        echo "<button style=\"background-color: blue;\">1</button>";
    }

    echo "<br/>";
}

function onlyLeftBlue(){
    for($j=1; $j<=5; $j++){
        if($j == 5){
            echo "<button style=\"background-color: blue;\">1</button>";
        } else {
            echo "<button>0</button>";
        }
    }

    echo "<br/>";
}

function onlyRightBlue(){
    for($j=1; $j<=5; $j++){
        if($j == 1){
            echo "<button style=\"background-color: blue;\">1</button>";
        } else {
            echo "<button>0</button>";
        }
    }

    echo "<br/>";
}
?>
</body>
</html>