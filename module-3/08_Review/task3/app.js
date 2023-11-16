
document.addEventListener('DOMContentLoaded', function () {
    
    const button = document.querySelector('.btn');
    const timeParagraph = document.getElementById('time');
  
    button.addEventListener('click', function () {
      
      const currentDate = new Date();
  
     
      timeParagraph.textContent = 'Current Date/Time: ' + currentDate;
  
     
      const h1 = document.createElement('h1');
      h1.textContent = 'Hello, Nigus Solomon!'; 
      document.body.appendChild(h1);
    });
  });
