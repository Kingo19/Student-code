<template>
  <div>
      <header>
          <h1>{{ welcome }} {{ name}}, Your GPA is: {{recalculateGPA}}</h1>
          <nav>
              <a href="#" target="_blank" rel="noopener noreferrer">Home </a>  | 
              <a href="#" target="_blank" rel="noopener noreferrer">About </a>  | 
             
          </nav>
      </header>
  </div>
</template>

<script>
export default {
   name: 'the-header',
   data() {
       return {
           welcome: 'Welcome',
           name: 'Steve',
           contactName: {
               fName: '',
               lName: ''
           }
       }
   },
   computed: {
       recalculateGPA() {
           return 4;
       }
   }

}
</script>

<style scoped>

</style>