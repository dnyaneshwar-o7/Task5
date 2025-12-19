package ManytoMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Emp_id;
    @Column(name = "Emp_name")
    private String Emp_name;
     @ManyToMany
     @JoinTable(
             name = "emp_learn",
             joinColumns = @JoinColumn(name = "emps_eid"),
             inverseJoinColumns = @JoinColumn(name = "Projects_pid")
     )
    private List<Project> projects;

    public int getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(int emp_id) {
        Emp_id = emp_id;
    }

    public String getEmp_name(String ram) {
        return Emp_name;
    }

    public void setEmp_name(String emp_name) {
        Emp_name = emp_name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Emp(int emp_id, String emp_name, List<Project> projects) {
        Emp_id = emp_id;
        Emp_name = emp_name;
        this.projects = projects;
    }

    public Emp() {
        super();
    }
}
