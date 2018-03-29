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
            if($i <= 1){
                $nums[] = 1;
            } else if($i == 2){
                $lastNum = end($nums);
                $secondLastNum = prev($nums);
                $nums[] = $lastNum + $secondLastNum;
            } else {
                $lastNum = end($nums);
                $secondLastNum = prev($nums);
                $thirdLastNum = $nums[count($nums)-3];
                $nums[] = $lastNum + $secondLastNum + $thirdLastNum;
            }
        }

        echo implode(" ", $nums);

        echo $result;
    }
    ?>
</body>
</html>