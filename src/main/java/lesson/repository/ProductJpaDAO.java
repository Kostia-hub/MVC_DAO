package lesson.repository;

import lesson.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository - указывать не надо, у нас и так просканирует всю папку repository
public interface ProductJpaDAO extends JpaRepository<Product, Long> { //Передаем сущность - Продукт и ID - Long
//    List<Product> findAllByTitleLike(String title);
    List<Product> findAllByIdBetween(Long startId, Long endId);
    List<Product> findAll();
}