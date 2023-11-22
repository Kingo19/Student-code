
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
