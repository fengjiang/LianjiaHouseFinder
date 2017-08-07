/*
* Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name  novel-downloader
*
* @File name  PropertyData.java
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
package me.jiang.tools.house.finder.lianjia.lianjia.entity.response;

import lombok.Data;

/*
 *
 * @author remote
 * @description 
 * @date 8/7/17
 */
@Data
public class PropertyData {

    private String allSpell;

//        "lingzhaoxincunshangpulu69nong,lzxcspln"
    private Integer buildingCount;

//        51
    private String buildingMapUrl;

//        "http//cdn1.dooioo.com/fetch/img/ptgi/0x0/20170123/34b8ba6d-950c-42bc-b94d-57a9e5b41f27.jpg"
    private Double changeRate;

//        5.41
    private String cityCode;

//        "sh"
    private Integer completeYear;

//        1997
    private String completeYearRangeForApp;

//        "1995年-1997年"
    private String cycleLine;

//        "中环至外环"
    private Integer dealAvgPrice;

//        57254
    private String devCompany;

//        "三林集团"
    private String districtName;

//        "浦东"
    private String districtSpelling;

//        "pudongxinqu"
    private Integer earlyCompleteYear;

//        1995
    private Integer far;

//        0
    private String floorTypes;

//        "低层、多层"
    private Integer greenRate;

//        0
    private String hotImage;

//        "http//image3.me.jiang.tools.house.finder.lianjia.lianjia.com/hdic-resblock/4474f77e-6a21-40a9-a50e-03e620ea54df.jpg.200x150.jpg"
    private String houseType;

//        "住宅 - 公寓、商业类"
    private String houseType2;

//        "住宅等"
    private Double latitude;

//        31.15063417
    private Double longitude;

//        121.4967614
    private String metroRemark;

//        "距离8号线凌兆新村站440米"
    private String mgtCompany;

//        "上海三凌物业管理公司"
    private Integer mgtFee;

//        0
    private String plateId;

//        "611900138"
    private String plateName;

//        "三林"
    private String plateSpelling;

//        "sanlin"
    private String propertyAddress;

//        "上浦路69弄"
    private Integer propertyAge;

//        20
    private String propertyCardSubtitle;

//        "浦东•三林-10套-55994元/㎡"
    private String propertyCode;

//        "q5011000004008"
    private String propertyName;

//        "凌兆新村（上浦路69弄）"
    private String propertyNo;

//        "5011000004008"
    private Integer putAway;

//        1
    private Integer referAvgPrice;

//        57254
    private Integer referChangeRate;

//        5
    private Integer rentTotal;

//        8
    private Integer saleAvgPrice;

//        55994
    private Integer saleChangeRate;

//        0
    private Integer saleTotal;

//        10
    private Integer soldCount;

//        9
    private Integer totalRooms;

//        932
    private String webUrl;

//        "http//sh.me.jiang.tools.house.finder.lianjia.lianjia.com/xiaoqu/5011000004008.html"
}
