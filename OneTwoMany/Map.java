package OneTwoMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Map {
    public static void main(String[] args) {
        Configuration cfg =new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();

     Questions q1= new Questions();
        q1.setQuestionId(121);
        q1.setQuestion("What is Collection Framework");

        Questions q2= new Questions();
        q2.setQuestionId(122);
        q2.setQuestion("why to use Collection ");

        Answers answer1= new Answers();
        answer1.setAnswers(String.valueOf(1231));
        answer1.setAnswers("If we represent gorup of object is called collection framework");
        q1.setAnswer(answer1);

        Session session= factory.openSession();
        Transaction tx =session.beginTransaction();

        session.persist(q1);
        tx.commit();


    }
}
