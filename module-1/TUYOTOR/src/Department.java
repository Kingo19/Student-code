public class Department {
    private String name;
    private int departmentID;

//    CONSTRUCTORS
    public Department(String name, int departmentID) {
        this.name = name;
        this.departmentID = departmentID;

    }
//   GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }
}
