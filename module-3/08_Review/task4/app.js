
document.addEventListener('DOMContentLoaded', function () {
    
    const button = document.getElementById('btn1');
    button.addEventListener('click', function () {
      document.body.classList.remove('color_3'); 
      document.body.classList.add('color_2');
    }); 
  
   
    button.addEventListener('dblclick', function () {
      document.body.classList.remove('color_2'); 
      document.body.classList.add('color_3');
    });
  });
