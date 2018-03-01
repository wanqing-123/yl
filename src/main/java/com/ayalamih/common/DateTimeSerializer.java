package com.ayalamih.common;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * com.ayalamih.common
 *
 * @author ayalamih.
 * @date 10:12 PM, 27/02/2018
 * @contact 31007354@qq.com
 */
public class DateTimeSerializer implements ObjectSerializer {
    public void write(JSONSerializer jsonSerializer, Object o, Object o1, Type type, int i) throws IOException {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + " INFO "
                + "[" + Thread.currentThread().getName() + "] "
                + jsonSerializer);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + " INFO "
                + "[" + Thread.currentThread().getName() + "] "
                + o);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + " INFO "
                + "[" + Thread.currentThread().getName() + "] "
                + o1);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + " INFO "
                + "[" + Thread.currentThread().getName() + "] "
                + type);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + " INFO "
                + "[" + Thread.currentThread().getName() + "] "
                + i);
    }
}
