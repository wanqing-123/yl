package com.ayalamih.encrypt;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * com.ayalamih.encrypt
 *
 * @author ayalamih.
 * @date 1:14 PM, 15/03/2018
 * @contact 31007354@qq.com
 */
public class MACCode {

    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException {
        String responseSign = "";
        String responseEncryption = "";
        String responseSource = "c10019275001901031702540001E|0000|交易成功|12k017123019417508432F36A87AB0705F87D4A97FE8CA39EA2A7";
        responseSign = responseSource.substring(responseSource.length() - 32, responseSource.length());
        System.out.println(responseSign);
        responseSource = responseSource.substring(28);
        System.out.println(responseSource);
        responseSource = responseSource.substring(0, responseSource.length() - 32);
        System.out.println(responseSource);
    }

    /**
     * 产生HmacMD5摘要算法的密钥
     *
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static byte[] initHmacMD5Key() throws NoSuchAlgorithmException {
        KeyGenerator generator = KeyGenerator.getInstance("HmacMD5");
        SecretKey secretKey = generator.generateKey();
        return secretKey.getEncoded();
    }

    /**
     * HmacMd5摘要算法
     * 对于给定生成的不同密钥，得到的摘要消息会不同，所以在实际应用中，要保存我们的密钥
     *
     * @param data
     * @param key
     * @return
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     */
    public static String encodeHmacMD5(byte[] data, byte[] key) throws NoSuchAlgorithmException, InvalidKeyException {
        // 还原密钥
        SecretKey secretKey = new SecretKeySpec(key, "HmacMD5");
        // 实例化Mac
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());
        // 初始化mac
        mac.init(secretKey);
        // 执行消息摘要
        byte[] digest = mac.doFinal(data);
        return bytesToHex(digest);
    }

    /**
     * 产生HmacSHA1摘要算法的密钥
     */
    public static byte[] initHmacSHAKey() throws NoSuchAlgorithmException {
        // 初始化HmacMD5摘要算法的密钥产生器
        KeyGenerator generator = KeyGenerator.getInstance("HmacSHA1");
        // 产生密钥
        SecretKey secretKey = generator.generateKey();
        // 获得密钥
        byte[] key = secretKey.getEncoded();
        return key;
    }

    /**
     * HmacSHA1摘要算法
     * 对于给定生成的不同密钥，得到的摘要消息会不同，所以在实际应用中，要保存我们的密钥
     */
    public static String encodeHmacSHA(byte[] data, byte[] key) throws Exception {
        // 还原密钥
        SecretKey secretKey = new SecretKeySpec(key, "HmacSHA1");
        // 实例化Mac
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());
        //初始化mac
        mac.init(secretKey);
        //执行消息摘要
        byte[] digest = mac.doFinal(data);
        return bytesToHex(digest);//转为十六进制的字符串
    }

    /**
     * 产生HmacSHA256摘要算法的密钥
     */
    public static byte[] initHmacSHA256Key() throws NoSuchAlgorithmException {
        // 初始化HmacMD5摘要算法的密钥产生器
        KeyGenerator generator = KeyGenerator.getInstance("HmacSHA256");
        // 产生密钥
        SecretKey secretKey = generator.generateKey();
        // 获得密钥
        byte[] key = secretKey.getEncoded();
        return key;
    }

    /**
     * HmacSHA1摘要算法
     * 对于给定生成的不同密钥，得到的摘要消息会不同，所以在实际应用中，要保存我们的密钥
     */
    public static String encodeHmacSHA256(byte[] data, byte[] key) throws Exception {
        // 还原密钥
        SecretKey secretKey = new SecretKeySpec(key, "HmacSHA256");
        // 实例化Mac
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());
        //初始化mac
        mac.init(secretKey);
        //执行消息摘要
        byte[] digest = mac.doFinal(data);
        return bytesToHex(digest);//转为十六进制的字符串
    }

    /**
     * 产生HmacSHA384摘要算法的密钥
     */
    public static byte[] initHmacSHA384Key() throws NoSuchAlgorithmException {
        // 初始化HmacMD5摘要算法的密钥产生器
        KeyGenerator generator = KeyGenerator.getInstance("HmacSHA384");
        // 产生密钥
        SecretKey secretKey = generator.generateKey();
        // 获得密钥
        byte[] key = secretKey.getEncoded();
        return key;
    }

    /**
     * HmacSHA384摘要算法
     * 对于给定生成的不同密钥，得到的摘要消息会不同，所以在实际应用中，要保存我们的密钥
     */
    public static String encodeHmacSHA384(byte[] data, byte[] key) throws Exception {
        // 还原密钥
        SecretKey secretKey = new SecretKeySpec(key, "HmacSHA384");
        // 实例化Mac
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());
        //初始化mac
        mac.init(secretKey);
        //执行消息摘要
        byte[] digest = mac.doFinal(data);
        return bytesToHex(digest);//转为十六进制的字符串
    }

    /**
     * 产生HmacSHA512摘要算法的密钥
     */
    public static byte[] initHmacSHA512Key() throws NoSuchAlgorithmException {
        // 初始化HmacMD5摘要算法的密钥产生器
        KeyGenerator generator = KeyGenerator.getInstance("HmacSHA512");
        // 产生密钥
        SecretKey secretKey = generator.generateKey();
        // 获得密钥
        byte[] key = secretKey.getEncoded();
        return key;
    }

    /**
     * HmacSHA512摘要算法
     * 对于给定生成的不同密钥，得到的摘要消息会不同，所以在实际应用中，要保存我们的密钥
     */
    public static String encodeHmacSHA512(byte[] data, byte[] key) throws Exception {
        // 还原密钥
        SecretKey secretKey = new SecretKeySpec(key, "HmacSHA512");
        // 实例化Mac
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());
        //初始化mac
        mac.init(secretKey);
        //执行消息摘要
        byte[] digest = mac.doFinal(data);
        return bytesToHex(digest);//转为十六进制的字符串
    }

    private static final char[] HEX_CHAR = {'0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String bytesToHex(byte[] bytes) {
        char[] buf = new char[bytes.length * 2];
        int index = 0;
        for (byte b : bytes) { // 利用位运算进行转换，可以看作方法一的变种
            buf[index++] = HEX_CHAR[b >>> 4 & 0xf];
            buf[index++] = HEX_CHAR[b & 0xf];
        }

        return new String(buf);
    }
}
