package me.jiang.tools.house.finder.lianjia.lianjia.entity.enums;

import java.util.HashMap;
import java.util.Map;

/*
 *
 * @author remote
 * @description 
 * @date 8/7/17
 */
public enum NotificationType {
    LOW_PRICE("lowPrice", "最低单价"),

    NEW_HOUSE("newHouse", "新上线房屋"),

    PRICE_DOWN("priceDown", "降价");


    private final String key;
    private final String name;
    private static final Map<String, NotificationType> NAME_TO_VALUE_MAP = new HashMap<>();

    NotificationType(String key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public String toString() {
        return key;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    static {
        for (NotificationType code : NotificationType.values()) {
            NAME_TO_VALUE_MAP.put(code.key, code);
        }
    }

    public static NotificationType forName(String name) {
        return NAME_TO_VALUE_MAP.get(name);
    }
}
