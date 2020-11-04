package lesson;

import com.sun.org.apache.xml.internal.security.Init;
import lesson.domain.Client;
import lesson.domain.Product;
import lesson.repository.ClientJpaDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import lesson.config.SpringDataConfig;
import lesson.repository.ProductJpaDAO;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.EntityManager;
import java.util.Arrays;

public class AppSpringDataJpa {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringDataConfig.class);

        ProductJpaDAO productJpaDAO = context.getBean(ProductJpaDAO.class);
        //ClientJpaDAO clientJpaDAO = context.getBean(ClientJpaDAO.class);

        Product pr1 = new Product();
        pr1.setTitle("Milk");
        pr1.setPrice("55");

        Product pr2 = new Product();
        pr2.setTitle("Cheese");
        pr2.setPrice("635");

        Product pr3 = new Product();
        pr3.setTitle("Chocolate");
        pr3.setPrice("95");

        Product pr4 = new Product();
        pr4.setTitle("Bread");
        pr4.setPrice("37");

        Product pr5 = new Product();
        pr5.setTitle("Beer");
        pr5.setPrice("68");

        productJpaDAO.save(pr1);
        productJpaDAO.save(pr2);
        productJpaDAO.save(pr3);
        productJpaDAO.save(pr4);
        productJpaDAO.save(pr5);


        System.out.println("FIND ALL");
        productJpaDAO.findAll().forEach(System.out::println);

//        System.out.println("FIND BY ID");
//        productJpaDAO.findById(2L).ifPresent(System.out::println);
//
//        System.out.println("FIND BY LIKE TITLE");
//        productJpaDAO.findAllByTitleLike("%02%").forEach(System.out::println);

        System.out.println("FIND BY BETWEEN ID");
        productJpaDAO.findAllByIdBetween(1L, 3L).forEach(System.out::println);

    }
}
