package com.meetcity.payment.channel.endpoint;

import java.util.Map;

public class MapUtils {
    public static boolean isEmpty(Map<String, String> formParams) {
        return formParams == null || formParams.isEmpty();
    }

    public static String getString(Map<String, String> formParams, String key, String s) {
        return formParams.getOrDefault(key,s);
    }
}
