

<template>
  <div class="book-container">
    <BookCard v-for="book in books" :key="book.isbn" :book="book" />
    <NewBookForm />
  </div>
</template>

<script>
import BookCard from './BookCard.vue';
import NewBookForm from './NewBookForm.vue';

export default {
  computed: {
    books() {
      return this.$store.state.books;
    }
  },
  components: {
    BookCard,
    NewBookForm
    
  }
}
</script>

<style>
.book-container {
  display: flex;
  justify-content: space-evenly;
  flex-wrap: wrap;
}
</style>
