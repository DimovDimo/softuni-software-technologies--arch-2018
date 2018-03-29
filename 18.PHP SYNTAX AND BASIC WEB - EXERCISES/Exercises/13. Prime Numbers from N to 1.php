<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        N: <input type="text" name="num" />
        <input type="submit" />
    </form>
    <?php
    if(isset($_GET['num'])){
        $n = intval($_GET['num']);
        $result = "";
        for($i=$n; $i>1; $i--){
            if (isPrime($i)){
                $result = "$result $i";
            }
        }

        echo $result;
    }

    function isPrime($num)
    {
        if ($num < 2) {
            return false;
        }

        for ($i = 2; $i <= $num / 2; $i++) {
            if ($num % $i == 0) {
                return false;
            }
        }

        return true;
    }
    ?>
</body>
</html>