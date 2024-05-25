package ma.enset.tpjdbcorm.presentation;

import ma.enset.tpjdbcorm.dao.ProductDaoImpl;
import ma.enset.tpjdbcorm.dao.entities.Product;
import ma.enset.tpjdbcorm.service.IProductService;
import ma.enset.tpjdbcorm.service.IServiceProductImpl;

import java.util.List;

public class ConsoleApp {
    public static void main(String[] args) {
        IProductService service=new IServiceProductImpl(new ProductDaoImpl());
        List<Product> productList=service.getAllProduct();
        for(Product product:productList){
            System.out.println("id: "+product.getIdProduct()+" name: "+product.getName()+" price: "+product.getPrice()+" quantity: "+product.getQuantity());

        }
    }
}
