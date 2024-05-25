package ma.enset.tpjdbcorm.dao;

import java.util.List;

public interface Dao <T,U>{
    // les methodes par defaut abstracts et public dans une interface
    void save(T o);
    void removeById(U id);
    T getById(U id);
    List<T> getAll();
    void update(T o);

}
