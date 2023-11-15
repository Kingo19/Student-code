/**
 * Checks entrance scores and returns true if the student is admitted, false if rejected.
 * 
 * Admits if:
 * - GPA is above 4.0
 * - SAT score is above 1300
 * - GPA is above 3.0 and they have a recommendation
 * - SAT score is above 1200 and they have a recommendation
 * 
 * @param {number} gpa - The GPA of the student, between 4.2 and 1.0
 * @param {number} [satScore=0] - The student's SAT score
 * @param {boolean} [recommendation=false] - Does the student have a recommendation
 * @returns {boolean} True if admitted, false if rejected
 */
function isAdmitted(gpa, satScore = 0, recommendation = false) {
    return (
        gpa > 4.0 ||
        satScore > 1300 ||
        (gpa > 3.0 && recommendation) ||
        (satScore > 1200 && recommendation)
    );
}

/**
 * Uses a filter function to filter the unfilteredArray and returns the result.
 * 
 * @param {function} filterFunction - The function to filter with
 * @returns {number[]} The filtered array
 */
let unfilteredArray = [1, 2, 3, 4, 5, 6];

function useParameterToFilterArray(filterFunction) {
    return unfilteredArray.filter(filterFunction);
}

/**
 * Concatenates two strings of digits and returns the result as a number.
 * 
 * @param {string} first - The first string of digits to concatenate
 * @param {string} [second=''] - The second string of digits to concatenate
 * @returns {number} The resultant number
 */
function makeNumber(first, second = '') {
    return parseInt(first + second, 10);
}

/**
 * Adds an unknown number of parameters together and returns the sum.
 * 
 * @param {...number} num - A series of numbers to add together
 * @returns {number} The sum of all the parameters
 */
function addAll(...num) {
    return num.reduce((acc, current) => acc + current, 0);
}

/**
 * Prepends 'Happy ' to the beginning of all the words in an array and returns a new array.
 * 
 * @param {string[]} array - The array of words
 * @returns {string[]} An array with 'Happy ' prepended to each word
 */
function makeHappy(array) {
    return array.map(word => 'Happy ' + word);
}

/**
 * Takes an array of JavaScript objects and returns an array of mailing addresses.
 * 
 * @param {Object[]} propertiesArray - An array of JavaScript objects with keys:
 *                                    - streetNumber
 *                                    - streetName
 *                                    - streetType
 *                                    - city
 *                                    - state
 *                                    - zip
 * @returns {string[]} An array of mailing addresses in the format: streetNumber streetName streetType city state zip
 */
function getFullAddressesOfProperties(propertiesArray) {
    return propertiesArray.map(property => `${property.streetNumber} ${property.streetName} ${property.streetType} ${property.city} ${property.state} ${property.zip}`);
}

/**
 * Finds the largest element (number or string) in an array using forEach.
 * 
 * For strings, "largest" means the word coming last in lexicographical order.
 * 
 * @param {number[]|string[]} searchArray - The array to search
 * @returns {number|string} The number or string that is largest
 */
function findLargest(searchArray) {
    let largest = searchArray[0];

    searchArray.forEach(element => {
        if (typeof element === 'string') {
            largest = element > largest ? element : largest;
        } else {
            largest = element > largest ? element : largest;
        }
    });

    return largest;
}

/**
 * Takes an array of arrays, adds up all sub values, and returns the sum.
 * 
 * @param {number[][]} array - An array of arrays
 * @returns {number} The sum of all sub-array values
 */
function getSumOfSubArrayValues(array) {
    if (!array || array.length === 0) {
        return 0;
    }

    return array.reduce((acc, subArray) =>
        acc + subArray.reduce((subAcc, value) => subAcc + value, 0), 0);
}
