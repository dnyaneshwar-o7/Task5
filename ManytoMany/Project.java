package ManytoMany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Project {

    @Id
    private int porid;
    @Column(name="Project_Name")
    private String Projectname;
    @ManyToMany(mappedBy = "projects")
    private List<Emp> emps;

    public int getPorid() {
        return porid;
    }

    public void setPorid(int porid) {
        this.porid = porid;
    }

    public String getProjectname() {
        return Projectname;
    }

    public void setProjectname(String projectname) {
        Projectname = projectname;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    public Project(int porid, String projectname, List<Emp> emps) {
        this.porid = porid;
        Projectname = projectname;
        this.emps = emps;
    }

    public Project() {
        super();
    }
}
