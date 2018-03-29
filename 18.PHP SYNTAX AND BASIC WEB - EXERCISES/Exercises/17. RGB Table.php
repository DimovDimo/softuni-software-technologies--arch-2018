<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
	<style>
		table * {
			border: 1px solid black;
			width: 50px;
			height: 50px;
		}
    </style>
</head>
<body>
<table>
    <tr>
        <td>
            Red
        </td>
        <td>
            Green
        </td>
        <td>
            Blue
        </td>
    </tr>
<?php
    $red = 51;
    $green = 51;
    $blue = 51;
    for($j=1; $j<=5; $j++){
        echo "<tr>";
        echo "<td style=\"background-color: rgb($red, 0, 0);\"></td>";
        echo "<td style=\"background-color: rgb(0, $green, 0);\"></td>";
        echo "<td style=\"background-color: rgb(0, 0, $blue);\"></td>";
        echo "</tr>";

        $red += 51;
        $green += 51;
        $blue += 51;
    }
?>
</table>
</body>
</html>