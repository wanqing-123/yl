package com.ayalamih.domain;

import jdk.internal.dynalink.support.TypeConverterFactory;
import jodd.bean.BeanUtil;
import jodd.datetime.JDateTime;
import jodd.format.Printf;
import jodd.http.HttpConnection;
import jodd.http.HttpMultiMap;
import jodd.http.HttpRequest;
import jodd.http.HttpStatus;
import jodd.http.HttpUtil;
import jodd.http.JoddHttp;
import jodd.http.JoddHttpDefaults;
import jodd.typeconverter.Converter;
import jodd.typeconverter.TypeConverter;
import jodd.util.StringUtil;
import jodd.util.inex.InExRules;
import jodd.util.template.MapTemplateParser;
import jodd.util.template.StringTemplateParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;

/**
 * com.ayalamih.domain
 *
 * @author ayalamih.
 * @date 3:47 PM, 05/03/2018
 * @contact 31007354@qq.com
 */
public class ArtExample {
    public static void main(String[] args) {
        /*
         * 得到一个实例对象对应的Class对象的方式 */

        // 1.通过实例变量的getClass()方法
        Art art = new Art();
        Class clazz = art.getClass();

        // 2.通过类Class的静态方法forName()
        try {
            Class claz = Class.forName("com.ayalamih.domain.Art");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 3.直接给出对象类文件的.class
        Class clz = Art.class;

        // Bean
        BeanUtil.pojo.setProperty(art, "id", UUID.randomUUID().toString());
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + " INFO "
                + "[" + Thread.currentThread().getName() + "] "
                + BeanUtil.pojo.getProperty(art, "id"));

        BeanUtil.declared.setProperty(art, "name", "ayalamih");
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + " INFO "
                + "[" + Thread.currentThread().getName() + "] "
                + art.getName());

        // 格式化
        System.out.println(Printf.str("%+i", 173));
        System.out.println(Printf.str("%04d", 1));
        System.out.println(Printf.str("%f", 1.7));
        System.out.println(Printf.str("%1.1f", 1.7));
        System.out.println(Printf.str("%.4e", 100.1e10));
        System.out.println(Printf.str("%G", 1.1e13));
        System.out.println(Printf.str("%l", true));
        System.out.println(Printf.str("%L", 123));
        System.out.println(Printf.str("%b", 13));
        System.out.println(Printf.str("%,b", -13));
        System.out.println(Printf.str("%#X", 173));
        System.out.println(Printf.str("%,x", -1));
        System.out.println(Printf.str("%s %s", new String[]{"one", "two"}));

        // 时间
        JDateTime jdt = new JDateTime();
        System.out.println(jdt.getFormat());
        jdt.setFormat("YYYY年MM月DD日 hh时mm分ss秒 mss毫秒");
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + " INFO "
                + "[" + Thread.currentThread().getName() + "] "
                + jdt);
        jdt = new JDateTime(1988, 12, 8);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + " INFO "
                + "[" + Thread.currentThread().getName() + "] "
                + jdt.toString());
        jdt = new JDateTime(System.currentTimeMillis());
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + " INFO "
                + "[" + Thread.currentThread().getName() + "] "
                + jdt.toString("MM/DD/YYYY hh:mm:ss mss "));
        System.out.println(jdt.getTimeZone());

        // 类型转换器
        System.out.println(Converter.get().toByte("1"));

        // StringUtil
        System.out.println(StringUtil.compressChars("abc", '2'));
        System.out.println(StringUtil.title("中国"));

        // 简单的字符串模版解析器
        // prepare template
        String template = "Hello ${foo}. Today is ${dayName}.";

        // prepare date
        final Map<String, String> map = new HashMap<>(4);
        map.put("foo", "Jodd");
        map.put("dayName", "Sunday");

        // parse
        StringTemplateParser stringTemplateParser = new StringTemplateParser();
        String result = stringTemplateParser.parse(template, new Function<String, String>() {
            @Override
            public String apply(String s) {
                return map.get(s);
            }
        });
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + " INFO "
                + "[" + Thread.currentThread().getName() + "] "
                + "result: " + result);

        InExRules inExRules = new InExRules<>();
        // 白名单
        inExRules.include("shelf.book.*");
        // 黑名单
        inExRules.exclude("shelf.book.page.1");
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + " INFO "
                + "[" + Thread.currentThread().getName() + "] "
                + inExRules.match("shelf.book.page.1"));

        // HTTP
        JoddHttpDefaults joddHttpDefaults = new JoddHttpDefaults();
        System.out.println(joddHttpDefaults.getUserAgent());

        HttpRequest httpRequest = HttpRequest.get("ip.taobao.com/service/getIpInfo.php?ip=63.223.108.42").open();
        HttpConnection connection = httpRequest.connection();
        try {
            InputStream in = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (connection != null) {
            connection.close();
        }
    }
}
