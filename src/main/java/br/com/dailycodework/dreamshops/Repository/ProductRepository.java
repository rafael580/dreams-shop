package br.com.dailycodework.dreamshops.Repository;

import br.com.dailycodework.dreamshops.model.Category;
import br.com.dailycodework.dreamshops.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.PrimitiveIterator;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> findByCategoryName(String category);

    List<Product> findByBrand(String brand);

    List<Product> findByCategoryNameAndBrand(String category, String brand);


    List<Product> findByName (String name);

    List<Product>   findByBrandAndName(String brand,String name);

    Long countByBrandAndName(String brand,String name);

}


