package com.scoremg.util;


import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;


public class StringTools {

    private static  final String SOLAR="solar";

    private static  final String LUNAR="lunar";





    public static String upperCaseFirstLetter(String field) {
        if (isEmpty(field)) {
            return field;
        }
        //如果第二个字母是大写，第一个字母不大写
        if (field.length() > 1 && Character.isUpperCase(field.charAt(1))) {
            return field;
        }
        return field.substring(0, 1).toUpperCase() + field.substring(1);
    }

    public static boolean isEmpty(String str) {
        if (null == str || "".equals(str) || "null".equals(str) || "\u0000".equals(str)) {
            return true;
        } else if ("".equals(str.trim())) {
            return true;
        }
        return false;
    }

    public static String encodeByMD5(String originString) {
        return  StringTools.isEmpty(originString) ? null : DigestUtils.md5Hex(originString);
    }



    public static String getRandomString(Integer count) {
        return RandomStringUtils.random(count, true, true);
    }

    public static boolean pathIsOk(String path) {
        if ( StringTools.isEmpty(path)) {
            return true;
        }
        if (path.contains("../") || path.contains("..\\")) {
            return false;
        }
        return true;
    }


    /**
     * 生成发票代码的函数
     * @return
     */

    public static String generateInvoiceNumber() {
        // 地区代码，这里假设是两位数
        String regionCode = "01";

        // 年度，使用当前年份的后两位
        String year = String.valueOf(getCurrentYearLastTwoDigits());

        // 发票种类代码，这里假设是三位数
        String invoiceTypeCode = "001";

        // 行业代码，这里假设是两位数
        String industryCode = "01";

        // 发票顺序号，这里随机生成六位数
        String sequenceNumber = String.format("%06d", new Random().nextInt(999999));

        // 拼接发票号码
        return regionCode + year + invoiceTypeCode + industryCode + sequenceNumber;
    }

    /**
     * 获取当前年份的后两位数字。
     *
     * @return 当前年份的后两位数字
     */
    private static int getCurrentYearLastTwoDigits() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear % 100;
    }

    //生成随机数
    public static final String getRandomNumber(Integer count){
        return RandomStringUtils.random(count,false,true);
    }




    //获取文件 不带后缀名
    public static String getFileNameNoSuffix(String fineName){
        Integer index=fineName.indexOf(".");
        if (index==-1){
            return fineName;
        }
        fineName=fineName.substring(0,index);
        return fineName;
    }

    /**
     * 获取文件后缀名
     * @param fileName
     * @return
     */
    public static String getFileSuffix(String fileName) {
        Integer index = fileName.lastIndexOf(".");
        if (index == -1) {
            return "";
        }
        String suffix = fileName.substring(index);
        return suffix;
    }


}
