<template>
  <table id="tblUsers">
    <thead>
      <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Username</th>
        <th>Email Address</th>
        <th>Status</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td><input v-model="search.firstName" type="text" id="firstNameFilter" /></td>
        <td><input v-model="search.lastName" type="text" id="lastNameFilter" /></td>
        <td><input v-model="search.username" type="text" id="usernameFilter" /></td>
        <td><input v-model="search.emailAddress" type="text" id="emailFilter" /></td>
        <td>
          <select v-model="search.status" id="statusFilter">
            <option value="">Show All</option>
            <option value="Active">Active</option>
            <option value="Inactive">Inactive</option>
          </select>
        </td>
      </tr>
      <tr v-for="user in filteredList" :key="user.username" :class="{ 'inactive': user.status === 'Inactive' }">
        <td>{{ user.firstName }}</td>
        <td>{{ user.lastName }}</td>
        <td>{{ user.username }}</td>
        <td>{{ user.emailAddress }}</td>
        <td>{{ user.status }}</td>
      </tr>
    </tbody>
  </table>
</template>

<script>
export default {
  data() {
    return {
      users: [
        { firstName: 'John', lastName: 'Smith', username: 'jsmith', emailAddress: 'jsmith@gmail.com', status: 'Active' },
        { firstName: 'Anna', lastName: 'Bell', username: 'abell', emailAddress: 'abell@yahoo.com', status: 'Active' },
        { firstName: 'George', lastName: 'Best', username: 'gbest', emailAddress: 'gbest@gmail.com', status: 'Inactive' },
        { firstName: 'Ben', lastName: 'Carter', username: 'bcarter', emailAddress: 'bcarter@gmail.com', status: 'Active' },
        { firstName: 'Katie', lastName: 'Jackson', username: 'kjackson', emailAddress: 'kjackson@yahoo.com', status: 'Active' },
        { firstName: 'Mark', lastName: 'Smith', username: 'msmith', emailAddress: 'msmith@foo.com', status: 'Inactive' }
      ],
      search: {
        firstName: '',
        lastName: '',
        username: '',
        emailAddress: '',
        status: ''
      }
    };
  },
  computed: {
    filteredList() {
      const { firstName, lastName, username, emailAddress, status } = this.search;

      return this.users.filter(user =>
        user.firstName.toLowerCase().includes(firstName.toLowerCase()) &&
        user.lastName.toLowerCase().includes(lastName.toLowerCase()) &&
        user.username.toLowerCase().includes(username.toLowerCase()) &&
        user.emailAddress.toLowerCase().includes(emailAddress.toLowerCase()) &&
        (status === '' || user.status.toLowerCase() === status.toLowerCase())
      );
    }
  }
};
</script>

<style scoped>
table {
  margin-top: 20px;
  font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
}
th {
  text-transform: uppercase;
}
td {
  padding: 10px;
}
tr.inactive {
  color: red;
}
input, select {
  font-size: 16px;
}
</style>
