function capitalCaseWords(input) {
    let pattern = /\b[A-Z]+\b/g;
    let words = [];
    for (let text of input) {
        let matches = text.match(pattern);
        for (let match of matches) {
            words.push(match);
        }
    }

    console.log(words.join(", "));
}

capitalCaseWords(["We start by HTML, CSS, JavaScript, JSON and REST."
, "Later we touch some PHP, MySQL and SQL"]);