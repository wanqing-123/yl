package com.ayalamih.dao;

import java.io.Serializable;

/**
 * com.ayalamih.dao
 *
 * @author ayalamih.
 * @date 9:44 PM, 23/01/2018
 * @contact 31007354@qq.com
 */
public interface GenericDao<T, PK extends Serializable> {

    PK create(T newInstance);

    T read(PK id);

    void update(T transientObject);

    void delete(T persistentObject);
}
