package com.ayalamih.enums;

import org.springframework.core.convert.converter.Converter;

/**
 * com.ayalamih.enums
 *
 * @author ayalamih.
 * @date 3:42 PM, 07/03/2018
 * @contact 31007354@qq.com
 */
public class StringToGenderEnumConverter implements Converter<String, GenderEnum> {
    @Override
    public GenderEnum convert(String s) {
        if ("".equals(s.trim())) {
            return null;
        }
        return GenderEnum.get(s.trim());
    }
}
