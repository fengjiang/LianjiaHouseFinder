package me.jiang.tools.house.finder.lianjia.util;

/*
 *
 * @author remote
 * @description 
 * @date 8/7/17
 */
public class Constants {


    private static Constants ourInstance = new Constants();

    public static Constants getInstance() {
        return ourInstance;
    }

    private Constants() {
    }

    public static final String ACCESS_TOKEN="7poanTTBCymmgE0FOn1oKp";
    public static final String SEARCH_HOUSE_LINK = "http://soa.dooioo.com/api/v4/online/house/ershoufang/search";
}
