<?php
    $fah ="";
    $cel="";

    function celsiusToFahrenheit($celsius):float{
        return $celsius * (9/5) + 32;
    }

    function fahrenheitToCelsius($fahrenhheit):float{
        return ceil(($fahrenhheit - 32) * (5/9));
    }

    $run = false;
    if(isset($_GET['cel'])){
        $cels = floatval($_GET['cel']);
        $fahs = celsiusToFahrenheit(intval($_GET['cel']));
        echo "$cels&deg;C=$fahs&deg;F";
        $run = true;
    }

    if(isset($_GET['fah'])){
        $cels = fahrenheitToCelsius(intval($_GET['fah']));
        $fahs = floatval($_GET['fah']);
        echo "$fahs&deg;F=$cels&deg;C";
        $run = true;
    }

    if ($run == false){
?>

<form>
    Celsius: <input type="text" name="cel" />
    <input type="submit" value="Convert">
    <?= $msgAfterCelsius ?>
</form>
<form>
    Fahrenheit: <input type="text" name="fah" />
    <input type="submit" value="Convert">
</form>

<?php

}

?>
