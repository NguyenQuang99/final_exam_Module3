package test;

import org.junit.jupiter.api.Test;
import service.IProductService;
import service.ProductServiceImp;

import static org.junit.jupiter.api.Assertions.*;



class ProductServiceImpTest {

    @Test
    void getProductById() {
        IProductService service = new ProductServiceImp();
        System.out.println(service.getProductById(5));
    }

    @Test
    void getCategoryList() {
        IProductService service = new ProductServiceImp();
        System.out.println(service.getCategoryList());
    }
}