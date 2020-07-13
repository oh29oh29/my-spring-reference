package pe.oh29oh29.entitymapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import pe.oh29oh29.entitymapping.primarykey.UserPK01;
import pe.oh29oh29.entitymapping.primarykey.UserPK02;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        UserPK01 userPK01 = new UserPK01();
        userPK01.setId("TestID");
        entityManager.persist(userPK01);

        UserPK02 userPK02 = new UserPK02();
        entityManager.persist(userPK02);
        System.out.println("UserPK02 id: " + userPK02.getId());

        transaction.commit();
    }
}
