import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Application {
    private List<Department> departments = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private Map<String, Project> projects = new HashMap<>();

    public void createDepartment() {
        departments.add(new Department("Marketing", 01));
        departments.add(new Department("Sales", 02));
        departments.add(new Department("Engineering", 03));
    }

    public void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for (Department department : departments) {
            System.out.println(department.getName());
        }


    }

    public void createEmployees() {
        Department engineeringDepartment = departments.get(2);
        Department salesDepartment = departments.get(1);
        Department marketingDepartment = departments.get(0);
        employees.add(new Employee(01, "Steve", "Carmichael", "steve@teams.com", engineeringDepartment, "08/21/2020"));
        employees.add(new Employee(2, "Chala", "Mosisa", "chala@teams.com", engineeringDepartment, "08/21/2020"));
        employees.add(new Employee(3, "Nigus", "Gebremariam", "nigus@teams.com", marketingDepartment, "08/21/2020"));

        Employee Steve = employees.get(0);
        Employee Chala = employees.get(1);
        Employee Nigus = employees.get(2);

        Chala.raiseSalary(10);
        Steve.raiseSalary(5);
        Nigus.raiseSalary(100);
    }

    public void printEmployees() {
        System.out.println("------------- EMPLOYEES ------------------------------");
        for (Employee employee : employees) {
            System.out.println(employee.getFullName() + " " + "(" + employee.getSalary() + ")" + " " + employee.getDepartment().getName());
        }


    }

    public void createTeamsProject() {
        Project teamsProject = new Project("PMS", "Teams", "10/10/2020", "02/05/2021");
        for (Employee employee : employees) {
            if (employee.getDepartment().getName().equals("Engineering")) {
                teamsProject.getTeamMembers().add(employee);
            }
        }
        projects.put(teamsProject.getName(), teamsProject);
    }

    public void createLandingPageProject() {
        Project landingPageProject = new Project("Marketing Landing Page", "Lead Capture Landing Page for Marketing", "10/10/2020", "10/17/2020");

        for (Employee employee : employees) {
            if (employee.getDepartment().getName().equals("Marketing")) {
                landingPageProject.getTeamMembers().add(employee);
            }
        }

        projects.put(landingPageProject.getName(), landingPageProject);
    }
   public void printProjectsReport() {
        System.out.println("------------- PROJECTS ------------------------------");
        for (Map.Entry<String, Project> entry : projects.entrySet()) {
            String projectName = entry.getKey();
            int teamSize = entry.getValue().getTeamMembers().size();
            System.out.println(projectName + ": " + teamSize);
        }
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.createDepartment();
        app.createEmployees();
        app.createTeamsProject();
        app.createLandingPageProject();
        app.printDepartments();
        app.printEmployees();
        app.printProjectsReport();


    }
}


