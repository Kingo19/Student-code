<template>
  <div class="container">
    <table id="tblUsers">
      <thead>
        <tr>
          <th>&nbsp;</th>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Username</th>
          <th>Email Address</th>
          <th>Status</th>
          <th>Actions</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>
            <input type="checkbox" id="selectAll" @change="selectAllChanged" />
          </td>
          <td>
            <input type="text" id="firstNameFilter" v-model="filter.firstName" />
          </td>
          <td>
            <input type="text" id="lastNameFilter" v-model="filter.lastName" />
          </td>
          <td>
            <input type="text" id="usernameFilter" v-model="filter.username" />
          </td>
          <td>
            <input type="text" id="emailFilter" v-model="filter.emailAddress" />
          </td>
          <td>
            <select id="statusFilter" v-model="filter.status">
              <option value="Show All">Show All</option>
              <option value="Active">Active</option>
              <option value="Inactive">Inactive</option>
            </select>
          </td>
          <td>&nbsp;</td>
        </tr>
        <tr
          v-for="user in filteredList"
          :key="user.id"
          :class="{ deactivated: user.status === 'Inactive' }"
        >
          <td>
            <input
              type="checkbox"
              :id="user.id"
              :value="user.id"
              v-model="selectedUserIds"
            />
          </td>
          <td>{{ user.firstName }}</td>
          <td>{{ user.lastName }}</td>
          <td>{{ user.username }}</td>
          <td>{{ user.emailAddress }}</td>
          <td>{{ user.status }}</td>
          <td>
            <button @click="toggleUserStatus(user.id)">
              {{ user.status === 'Active' ? 'Deactivate' : 'Activate' }}
            </button>
          </td>
        </tr>
      </tbody>
    </table>

    <div class="all-actions">
      <button @click="activateSelectedUsers" :disabled="selectedUserIds.length === 0">
        Activate Users
      </button>
      <button @click="deactivateSelectedUsers" :disabled="selectedUserIds.length === 0">
        Deactivate Users
      </button>
      <button @click="deleteSelectedUsers" :disabled="selectedUserIds.length === 0">
        Delete Users
      </button>
    </div>

    <button @click="toggleNewUserForm">Add New User</button>

    <form v-if="isNewUserFormVisible" id="frmAddNewUser" @submit.prevent="saveNewUser">
      <div class="field">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" v-model="newUser.firstName" />
      </div>
      <div class="field">
        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" v-model="newUser.lastName" />
      </div>
      <div class="field">
        <label for="username">Username:</label>
        <input type="text" id="username" v-model="newUser.username" />
      </div>
      <div class="field">
        <label for="emailAddress">Email Address:</label>
        <input type="text" id="emailAddress" v-model="newUser.emailAddress" />
      </div>
      <button type="submit" class="btn save">Save User</button>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      filter: {
        firstName: "",
        lastName: "",
        username: "",
        emailAddress: "",
        status: "Show All",
      },
      nextUserId: 7,
      isNewUserFormVisible: false,
      newUser: {
        id: null,
        firstName: "",
        lastName: "",
        username: "",
        emailAddress: "",
        status: "Active",
      },
      users: [
        {
          id: 1,
          firstName: "John",
          lastName: "Smith",
          username: "jsmith",
          emailAddress: "jsmith@gmail.com",
          status: "Active",
        },
        {
          id: 2,
          firstName: "Anna",
          lastName: "Bell",
          username: "abell",
          emailAddress: "abell@yahoo.com",
          status: "Active",
        },
        {
          id: 3,
          firstName: "George",
          lastName: "Best",
          username: "gbest",
          emailAddress: "gbest@gmail.com",
          status: "Inactive",
        },
        {
          id: 4,
          firstName: "Ben",
          lastName: "Carter",
          username: "bcarter",
          emailAddress: "bcarter@gmail.com",
          status: "Active",
        },
        {
          id: 5,
          firstName: "Katie",
          lastName: "Jackson",
          username: "kjackson",
          emailAddress: "kjackson@yahoo.com",
          status: "Active",
        },
        {
          id: 6,
          firstName: "Mark",
          lastName: "Smith",
          username: "msmith",
          emailAddress: "msmith@foo.com",
          status: "Inactive",
        },
      ],
      isNewUserFormVisible: false,
      selectedUserIds: [],
    };
  },
  methods: {
    getNextUserId() {
      return this.nextUserId++;
    },
    toggleUserStatus(userId) {
      const user = this.users.find((u) => u.id === userId);
      if (user) {
        user.status = user.status === "Active" ? "Inactive" : "Active";
      }
    },
    saveNewUser() {
      this.newUser.id = this.getNextUserId();
      this.users.push({ ...this.newUser });
      this.newUser = {
        id: null,
        firstName: "",
        lastName: "",
        username: "",
        emailAddress: "",
        status: "Active",
      };
      this.isNewUserFormVisible = false;
    },
    activateSelectedUsers() {
      this.selectedUserIds.forEach((userId) => {
        const user = this.users.find((u) => u.id === userId);
        if (user) {
          user.status = "Active";
        }
      });
      this.selectedUserIds = [];
    },
    deactivateSelectedUsers() {
      this.selectedUserIds.forEach((userId) => {
        const user = this.users.find((u) => u.id === userId);
        if (user) {
          user.status = "Inactive";
        }
      });
      this.selectedUserIds = [];
    },
    deleteSelectedUsers() {
      this.users = this.users.filter((user) => !this.selectedUserIds.includes(user.id));
      this.selectedUserIds = [];
    },
    toggleNewUserForm() {
      this.isNewUserFormVisible = !this.isNewUserFormVisible;
    },
    selectAllChanged() {
      if (this.selectedUserIds.length === this.users.length) {
        // Uncheck all
        this.selectedUserIds = [];
      } else {
        // Check all
        this.selectedUserIds = this.users.map((user) => user.id);
      }
    },
  },
  computed: {
    filteredList() {
      let filteredUsers = this.users;
      if (this.filter.firstName !== "") {
        filteredUsers = filteredUsers.filter(
          (user) =>
            user.firstName.toLowerCase().includes(this.filter.firstName.toLowerCase())
        );
      }
      if (this.filter.lastName !== "") {
        filteredUsers = filteredUsers.filter(
          (user) => user.lastName.toLowerCase().includes(this.filter.lastName.toLowerCase())
        );
      }
      if (this.filter.username !== "") {
        filteredUsers = filteredUsers.filter(
          (user) => user.username.toLowerCase().includes(this.filter.username.toLowerCase())
        );
      }
      if (this.filter.emailAddress !== "") {
        filteredUsers = filteredUsers.filter(
          (user) =>
            user.emailAddress.toLowerCase().includes(this.filter.emailAddress.toLowerCase())
        );
      }
      if (this.filter.status !== "Show All") {
        filteredUsers = filteredUsers.filter((user) => user.status === this.filter.status);
      }
      return filteredUsers;
    },
  },
};
</script>

<style scoped>
table {
  margin-top: 20px;
  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Oxygen,
    Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif;
  margin-bottom: 20px;
}
th {
  text-transform: uppercase;
}
td {
  padding: 10px;
}
tr.deactivated {
  color: red;
}
input,
select {
  font-size: 16px;
}

form {
  margin: 20px;
  width: 350px;
}
.field {
  padding: 10px 0px;
}
label {
  width: 140px;
  display: inline-block;
}
button {
  margin-right: 5px;
}
.all-actions {
  margin-bottom: 40px;
}
.btn.save {
  margin: 20px;
  float: right;
}
</style>
