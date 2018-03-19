function storingObjects(lines) {
    let students = [];
    for (let line of lines) {
        let splited = line.split(" -> ");
        let name = splited[0];
        let age = splited[1];
        let grade = splited[2];
        let student = {};
        student["Name"] = name;
        student["Age"] = age;
        student["Grade"] = grade;
        students.push(student);
    }

    for (let student of students) {
        console.log(`Name: ${student["Name"]}`);
        console.log(`Age: ${student["Age"]}`);
        console.log(`Grade: ${student["Grade"]}`);
    }
}