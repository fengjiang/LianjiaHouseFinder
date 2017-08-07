/*
* Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : novel-downloader
*
* @File name : HouseData.java
*
* @Author : remote
*
* @Date : 8/7/17
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

import lombok.Data;

import java.math.BigDecimal;

/*
 *
 * @author remote
 * @description 
 * @date 8/7/17
 */
@Data
public class VillageData {
    private String currentType;
//        "village"
    private String dataId;
//        "5011000017240"
    private BigDecimal dealAvgPrice;
//        60504
    private double latitude;
//        31.14855068
    private double longitude;
//        121.4997766
    private BigDecimal saleAvgPrice;
//        58826
    private int saleTotal;
//        14
    private String showName;
//        "岭南苑（凌兆路127弄）"
   private int sort;
//        0
    private String type;
//        "village"
}
