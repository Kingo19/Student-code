// 1. sumDouble
function sumDouble(x, y) {
    return x === y ? (x + y) * 2 : x + y;
}

// 2. hasTeen
function hasTeen(personOne, personTwo, personThree) {
    return (
        (personOne >= 13 && personOne <= 19) ||
        (personTwo >= 13 && personTwo <= 19) ||
        (personThree >= 13 && personThree <= 19)
    );
}

// 3. lastDigit
function lastDigit(a, b) {
    return a % 10 === b % 10;
}

// 4. seeColor
function seeColor(str) {
    if (str.startsWith("red")) {
        return "red";
    } else if (str.startsWith("blue")) {
        return "blue";
    } else {
        return "";
    }
}

// 5. oddOnly
function oddOnly(arr) {
    return arr.filter((num) => num % 2 !== 0);
}

// 6. frontAgain
function frontAgain(str) {
    const firstTwo = str.slice(0, 2);
    const lastTwo = str.slice(-2);
    return firstTwo === lastTwo;
}

// 7. cigarParty
function cigarParty(cigars, isWeekend) {
    if (isWeekend) {
        return cigars >= 40;
    } else {
        return cigars >= 40 && cigars <= 60;
    }
}

// 8. fizzBuzz
function fizzBuzz(num) {
    if (num % 3 === 0 && num % 5 === 0) {
        return "FizzBuzz";
    } else if (num % 3 === 0) {
        return "Fizz";
    } else if (num % 5 === 0) {
        return "Buzz";
    } else {
        return num;
    }
}

// 9. filterEvens
function filterEvens(arr) {
    return arr.filter((num) => num % 2 === 0);
}

// 10. filterBigNumbers
function filterBigNumbers(arr) {
    return arr.filter((num) => num >= 100);
}

// 11. filterMultiplesOfX
function filterMultiplesOfX(arr, x) {
    return arr.filter((num) => num % x === 0);
}

// 12. createObject
function createObject() {
    return {
        firstName: "John",
        lastName: "Doe",
        age: 25,
    };
}
