package com.ayalamih.common;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import org.joda.time.DateTime;

import java.lang.reflect.Type;

/**
 * com.ayalamih.common
 *
 * @author ayalamih.
 * @date 10:15 PM, 27/02/2018
 * @contact 31007354@qq.com
 */
public class DateTimeDeserializer implements ObjectDeserializer {
    public DateTime deserialze(DefaultJSONParser defaultJSONParser, Type type, Object o) {
        // json源串值
        System.out.println(defaultJSONParser.getInput());
        System.out.println(defaultJSONParser.getInput().substring(40, 53));

//        System.out.println(defaultJSONParser.input);

        if ("createTime".equals(o.toString())) {
            JSONLexer jsonLexer = defaultJSONParser.lexer;
            jsonLexer.nextToken(16);
//            System.out.println(defaultJSONParser);
//            System.out.println(type.getTypeName());
//            System.out.println(o);
        }
        System.out.println("\r\n");
        return new DateTime(System.currentTimeMillis());
    }

    public int getFastMatchToken() {
        return 0;
    }
}
