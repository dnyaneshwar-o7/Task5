package ManytoMany;

import Mapping.OnetoOne.Answer;
import Mapping.OnetoOne.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        Configuration cfg =new Configuration();
        cfg.configure("hibernatea.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();

                Session session = factory.openSession();
                Transaction tx = session.beginTransaction();

                // Employees
                Emp emp1 = new Emp();
                emp1.setEmp_id(11);
                emp1.setEmp_name("Ram");

                Emp emp2 = new Emp();
                emp2.setEmp_id(12);
                emp2.setEmp_name("Shyam");

                // Projects
                Project project1 = new Project();
                project1.setPorid(12341);
                project1.setProjectname("Student Management");

                Project project2 = new Project();
                project2.setPorid(732478);
                project2.setProjectname("Hotel Management");
                 List<Emp> list1=new ArrayList<Emp>();
                 List<Project> list2=new ArrayList<Project>();

                 list1.add(emp1);
                 list1.add(emp2);

                 list2.add(project1);
                 list2.add(project2);

                 emp1.setProjects(list2);
                 project2.setEmps(list1);

                 session.persist(emp1);
                 session.persist(emp2);
                 session.persist(project1);
                 session.persist(project2);
        tx.commit();
        session.close();

    }
        }




