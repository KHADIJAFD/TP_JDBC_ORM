package ma.enset.tpjdbcorm.dao;

import ma.enset.tpjdbcorm.dao.entities.Product;

import java.util.List;

public class DaoTest {
    public static void main(String[] args) {
      ProductDao productDao=new ProductDaoImpl();
        //List<Product> productList=productDao.searchProductByQuery("25");
        Product p =new Product();
        p=productDao.getById(6);
        p.setPrice(26000.0);
        productDao.removeById(6);
        List<Product> productList=productDao.getAll();
        for(Product product:productList){
          System.out.println("id: "+product.getIdProduct()+" name: "+product.getName()+" price: "+product.getPrice()+" quantity: "+product.getQuantity());

      }
    }
}
