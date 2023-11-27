<template>
  <div>
      <h1>The Header Goes Here</h1>
      <div>
          <nav>
              <router-link v-bind:to="{name: 'home'}"> Home </router-link> |
              <router-link v-bind:to="{name: 'about'}"> About </router-link> |
             <router-link v-bind:to="{name: 'products'}"> List Products </router-link> |
              
          </nav>
      </div>
  </div>
</template>

<script>
export default {

}
</script>

<style scoped>

</style>