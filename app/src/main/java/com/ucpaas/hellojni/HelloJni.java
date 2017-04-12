package com.ucpaas.hellojni;

/**
 * ClassName:${TYPE_NAME} <br/>
 * Function: ${TODO} ADD FUNCTION. <br/>
 * Reason:   ${TODO} ADD REASON. <br/>
 * Date:     2017/4/11 12:15 <br/>
 *
 * @author 76dgs02
 * @see
 * @since JDK 1.6
 */


public class HelloJni {
    static {
        System.loadLibrary("HelloJni");
    }
    public static native String getFromCString();
}
