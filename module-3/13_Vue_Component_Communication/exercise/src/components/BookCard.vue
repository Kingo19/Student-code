

<template>
  <div class="card" :class="{ read: book.read }">
    <h2 class="book-title">{{ book.title }}</h2>
    <h3 class="book-author">{{ book.author }}</h3>
    <img :src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" class="book-image" alt="Book Cover" />
    <button class="mark-read" @click="toggleRead(true)" v-if="!book.read">Mark as Read</button>
    <button class="mark-unread" @click="toggleRead(false)" v-if="book.read">Mark as Unread</button>
  </div>
</template>

<script>
export default {
  props: {
    book: Object
  },
  methods: {
    toggleRead(read) {
      this.$store.commit('toggleReadStatus', { isbn: this.book.isbn, read });
    }
  }
}
</script>

<style>
.card {
  border: 2px solid black;
  border-radius: 10px;
  width: 250px;
  height: 550px;
  margin: 20px;
  position: relative;
}

.card.read {
  background-color: lightgray;
}

.card .book-title {
  font-size: 1.5rem;
}

.card .book-author {
  font-size: 1rem;
}

.book-image {
  width: 80%;
}

.mark-read, .mark-unread {
  display: block;
  position: absolute;
  bottom: 40px;
  width: 80%;
  left: 10%;
  font-size: 1rem;
}
</style>
