package com.ayalamih.enums;

/**
 * com.ayalamih.enums
 *
 * @author ayalamih.
 * @date 3:26 PM, 07/03/2018
 * @contact 31007354@qq.com
 */
public enum GenderEnum {
    male("male"),
    female("female");

    private final String value;

    GenderEnum(String v) {
        this.value = v;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public static GenderEnum get(int v) {
        return get(String.valueOf(v));
    }

    public static GenderEnum get(String str) {
        for (GenderEnum e : values()) {
            if (e.toString().equals(str)) {
                return e;
            }
        }
        return null;
    }
}
