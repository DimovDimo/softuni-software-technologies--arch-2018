<?php
if(isset($_GET['text'])){
    $pattern = "/\b([A-Z]+)\b/";
    $has_matches = preg_match_all($pattern, $_GET['text'], $matches);
    echo implode(", ", $matches[0]);
}
?>

<form>
    <textarea rows="10" name="text"></textarea><br>
    <input type="submit" value="Extract">
</form>
