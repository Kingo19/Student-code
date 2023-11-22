<template>
  <div>
      <h1>Add A Review</h1>
      <add-review v-bind:productId="productId" />
  </div>
</template>

<script>
import AddReview from '../components/AddReview.vue';

export default {

    components: {
        AddReview
    },
    computed: {
        productId() {
            return this.$route.params.id;
        }
    }

}
</script>

<style>

</style>