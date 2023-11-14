console.log('I am here');


// functions have no access modifiers
// no return type
//don't specify the datatypes of the input parameters

function add(x,y) {
    return x + y;
}

let xyz = (x,y) => {
    return x + y;
}


function onClick(funct, num1, num2) {
    console.log(funct(num1, num2));
}

onClick(add, 2,2);
onClick(multiply, 2, 2);




function multiply(x,y) {
    return x * y;
}

let sum = add(4,4)
console.log(sum);


//functional expression

// let divide =  (x,y) =>  {
//     return x / y;
// }

// let y = divide(8/4);

// console.log(y);