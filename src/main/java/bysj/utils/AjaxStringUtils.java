package bysj.utils;


import org.springframework.util.StringUtils;

public class AjaxStringUtils {

    public static String ISO2UTF(String param) throws Exception {
        if (!StringUtils.isEmpty(param)) {
            return new String(param.getBytes("ISO-8859-1"), "UTF-8");
        }
        return "";
    }
}
