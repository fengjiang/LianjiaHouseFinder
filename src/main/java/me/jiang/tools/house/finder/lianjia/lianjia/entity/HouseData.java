/*
* Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name  novel-downloader
*
* @File name  HouseData.java
*
* @Author  remote
*
* @Date  8/7/17
*
----------------------------------------------------------------------------------
*     Date       Who       Version     Comments
* 1. 8/7/17    remote    1.0
*
*
*
*
----------------------------------------------------------------------------------
*/
package me.jiang.tools.house.finder.lianjia.lianjia.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/*
 *
 * @author remote
 * @description 
 * @date 8/7/17
 */
@Data
public class HouseData {
    private BigDecimal acreage;
//        38.12
    private String cityCode;
//
//        "sh"
    private BigDecimal dealAvgPrice;
//        51842
    private String districtName;
//        "浦东"l
    private String face;
//        "南"
    @JsonProperty("floor_state")
    private String floorState;
//        "中区/6层"
    private Integer hall;
//        1
    private String houseSellId;
//        "4682159"
    private Boolean isAutoTitle;
//        1
    private Boolean isRecommend;
//        0
    private String label;
//        "is_five_sole"
    private double latitude;
//        31.15036545
    private double longitude;
//        121.4963155
    private String mainPhotoUrl;
//        "http//cdn1.dooioo.com/fetch/vp/fy/gi/20170614/1fd12b69-1565-4d19-b29a-68bbf8071e95.jpg_200x150.jpg"
    private String metroRemark;
//        "距离8号线凌兆新村站408米"
    private String plateName;
//        "三林"
    private String propertyName;
//        "凌兆新村（上浦路36弄）"
    private String propertyNo;
//        "5011000001723"
    private BigDecimal referAvgPrice;
//        51842
    private Integer room;
//        1
    private Integer showPrice;
//        245
    private List<String> tags;
//        ["is_subway_house", "is_five_year"]
    private String title;
//        "厨卫全明，卧室带阳台，地铁房，黄金楼层"
    private Integer unitPrice;
//        64270
    private Boolean videoDisplay;
//        true
}
