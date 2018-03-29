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
        $nums = [];
        for($i=0; $i<$n; $i++){
            if($i == 1 || $i == 0){
                $nums[] = 1;
            } else {
                $lastNum = end($nums);
                $secondLastNum = prev($nums);
                $nums[] = $lastNum + $secondLastNum;
            }
        }

        echo implode(" ", $nums);

        echo $result;
    }
    ?>
</body>
</html>