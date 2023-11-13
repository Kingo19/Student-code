const daysOfWeek =  ['Sun', 'Mon', 'Tues', 'Wed', 'Thur', 'Fri', 'Sat'];

console.table(daysOfWeek);
console.log(daysOfWeek);

const doValue = doSomething('2', 3, 'dog');

const startWithT = daysOfWeek.filter( (value, index, myArray) => {

    console.log('We found ' + myArray[index] + ' at index:' + index );

    if (value.startsWith('T')) {
        return true;
    }
    return false;

});


function testStartsWithT (element) {
   
    if (element.startsWith('T')) {
        return true;
    }
    return false;

 
}


 const startWithTAgain = daysOfWeek.filter((element) => {
    return testStartsWithT(element);
});

console.table(startWithTAgain);


for(let i = 0; i< daysOfWeek.length; i++) {
    console.log('The day is ' + daysOfWeek[i]);
}



//for each
daysOfWeek.forEach( (day) => {

      console.log('The day is ' + day);

});


//MAP
const anotherWeek = daysOfWeek.map( (value) => {

    return value.toUpperCase();

});

console.table(anotherWeek);



const numsArray = [2,3,4,5,3,4,5,2,3,4];

//REDUCE

//reduce ( updatedValue, currentElement)

const sum = numsArray.reduce( (runningTotal,  num) => {

    return runningTotal += num;

})

console.log(sum);





// JavaScript Doc example


/**
 *  This method does amazing things.
 * 
 * @param {String} x - represents user first name
 * @param {number} y  - represents user age
 * @param {String} z - represents favorite pet name
 * @returns  - some concatenation of various things
 */


function doSomething(x,y,z) {
    return x + y + z;
}



const homes = [

  {
    zipCode: '43035',
    price: 200000
  },
  {
    zipCode: '43017',
    price: 1200000
  },
  {
    zipCode: '43017',
    price: 1255500
  },
  {
    zipCode: '43211',
    price: 12007500
  },
  {
    zipCode: '43017',
    price: 1200000
  }

];

const filteredHomes = homes.filter( (home) => {

    if (home.zipCode == '43017' ) {
        return true;
    }
    return false;

});

console.log(filteredHomes);

filteredHomes.forEach( (home) => {
    console.log('ZipCode: ' + home.zipCode + ', price' + home.price); 

});

 