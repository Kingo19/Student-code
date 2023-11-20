<template>
  <div class="main">
    <h2> Product Reviews for: {{ name }}</h2>
    <p class="description"> desc </p>

  </div>

</template>

<script>
export default {

    data() {
        return {
            name: 'JavaScript for Dummies',
            description: 'A super dumb book about JS that is actually really good.'
        };

    },

}
</script>
import ProductReview from './components/ProductReview.vue'

<style scoped>
div.main {
    margin: 1rem
}

</style>