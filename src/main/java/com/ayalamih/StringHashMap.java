package com.ayalamih;

import java.util.HashMap;

/**
 * com.ayalamih
 *
 * @author ayalamih.
 * @date 8:17 PM, 23/01/2018
 * @contact 31007354@qq.com
 */
public class StringHashMap extends HashMap<String, String> {

    public StringHashMap() {
        super();
    }

    public StringHashMap(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public String put(String key, String value) {
        return super.put(key, value);
    }

    @Override
    public String get(Object key) {
        return super.get(key);
    }

    public void sign() {
        System.out.println(get("name"));
        System.out.println(get("mobile"));
    }
}
