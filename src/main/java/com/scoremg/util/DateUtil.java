package com.scoremg.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
public class DateUtil {
    private static final Object lockObj = new Object();
    private static Map<String, ThreadLocal<SimpleDateFormat>> sdfMap = new HashMap();
    private static SimpleDateFormat getSdf(final String patten) {
        ThreadLocal<SimpleDateFormat> t1 = sdfMap.get("patten");
        if (t1 == null) {
            synchronized (lockObj) {
                t1 = sdfMap.get(patten);
                if (t1 == null) {
                    t1 = new ThreadLocal<SimpleDateFormat>() {
                        @Override
                        protected SimpleDateFormat initialValue() {
                            return new SimpleDateFormat(patten);
                        }
                    };
                    sdfMap.put(patten, t1);
                }
            }
        }
        return t1.get();
    }
    /**
     * 日期格式化
     *
     * @param date
     * @param patten
     * @return
     */
    public static String format(Date date, String patten) {
        return getSdf(patten).format(date);
    }

    public static Date parse(String dateStr, String patten) {
        try {
            return getSdf(patten).parse(dateStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

