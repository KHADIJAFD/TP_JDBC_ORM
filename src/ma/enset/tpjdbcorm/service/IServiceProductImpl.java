package ma.enset.tpjdbcorm.service;

import ma.enset.tpjdbcorm.dao.ProductDao;
import ma.enset.tpjdbcorm.dao.entities.Product;

import java.util.List;

public class IServiceProductImpl implements IProductService {
    ProductDao productDao;

    public IServiceProductImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void addProduct(Product p) {
      productDao.save(p);
    }

    @Override
    public void deleteProductById(Integer id) {
     productDao.removeById(id);
    }

    @Override
    public List<Product> getAllProduct() {
        return productDao.getAll();
    }

    @Override
    public void updateProduct(Product p) {
     productDao.update(p);
    }

    @Override
    public List<Product> searchProductByQuery(String query) {
        return productDao.searchProductByQuery(query);
    }
}
