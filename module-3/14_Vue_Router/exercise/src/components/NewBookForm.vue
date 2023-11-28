<template>
    <form class="new-book-form" @submit.prevent="addBook">
      <label for="title" class="title-input">Title:</label>
      <input v-model.trim="newBook.title" type="text" id="title" class="title-input" required>
  
      <label for="author" class="author-input">Author:</label>
      <input v-model.trim="newBook.author" type="text" id="author" class="author-input" required>
  
      <label for="isbn" class="isbn-input">ISBN:</label>
      <input v-model.trim="newBook.isbn" type="text" id="isbn" class="isbn-input" required>
  
      <button type="submit">Add Book</button>
    </form>
  </template>
  
  <script>
  export default {
    data() {
      return {
        newBook: {
          title: '',
          author: '',
          isbn: ''
        }
      };
    },
    methods: {
      addBook() {
      
        if (!this.newBook.title || !this.newBook.author || !this.newBook.isbn) {
          return;
        }
  
        this.$store.commit('addBook', { ...this.newBook });
        this.newBook = { title: '', author: '', isbn: '' };
      }
    }
  };
  </script>
  
  <style>
  .new-book-form {
    display: flex;
    flex-direction: column;
    margin-top: 20px;
  }
  
  .title-input, .author-input, .isbn-input {
    margin-bottom: 10px;
  }
  </style>
  