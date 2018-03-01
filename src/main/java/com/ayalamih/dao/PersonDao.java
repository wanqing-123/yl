package com.ayalamih.dao;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * com.ayalamih.dao
 *
 * @author ayalamih.
 * @date 9:46 PM, 23/01/2018
 * @contact 31007354@qq.com
 */
public class PersonDao<Person, PK extends Serializable> implements GenericDao<Person, PK> {

    private Class<Person> type;

    public PersonDao(Class<Person> type) {
        this.type = type;
    }

    public PK create(Person newInstance) {
        return (PK) "1";
    }

    public Person read(PK id) {
        return null;
    }

    public void update(Person transientObject) {
    }

    public void delete(Person persistentObject) {

    }
}
