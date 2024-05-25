package ma.enset.tpjdbcorm.service;

import ma.enset.tpjdbcorm.dao.entities.Product;

import java.util.List;

public interface IProductService {

    public void addProduct(Product p);
    public void deleteProductById(Integer id);
    public  List<Product> getAllProduct();
    public void updateProduct(Product p);
    public List<Product> searchProductByQuery(String query);

}
