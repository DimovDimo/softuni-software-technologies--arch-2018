<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
    <style>
        div {
            display: inline-block;
            margin: 5px;
            width: 20px;
            height: 20px;
        }
    </style> 
</head>
<body>
<?php
for($j=0; $j<=255; $j += 51){
    $color = $j;
    for($i=1; $i<=10; $i++){
        echo "<div style=\"background-color: rgb($color, $color, $color);\"></div>";
        $color += 5;
    }

    echo "<br/>";
}
?>
</body>
</html>