const daysOfWeek = ['Sun', 'Mon', 'Tues', 'Wed', 'Thur', 'Fri', 'Sat'];

console.table(daysOfWeek);
console.log(daysOfWeek);

const startWithT = daysOfWeek.filter( (element) => {
if (element.startsWith('T')) {
    return true;
}
return false;

});

// for each 
daysOfWeek.forEach((day) => {
console.log ('The day is' + day);

});

// MAP 

