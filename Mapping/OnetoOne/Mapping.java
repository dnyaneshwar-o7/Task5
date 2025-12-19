package Mapping.OnetoOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapping {
    public static void main(String[] args) {
        Configuration cfg =new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();
        
        Question q1= new Question();
        q1.setQuestionId(121);
        q1.setQuestion("What is java");
        
        Answer answer1= new Answer();
        answer1.setAnswerId(1231);
        answer1.setAnswer("Java is programming langauge");
       q1.setAnswer(answer1);
        
        Session session= factory.openSession();
        Transaction tx =session.beginTransaction();

        session.persist(q1);
        tx.commit();

        
    }
}
