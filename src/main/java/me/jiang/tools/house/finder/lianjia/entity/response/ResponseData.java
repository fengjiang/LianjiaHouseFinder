/*
* Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : novel-downloader
*
* @File name : ResponseData.java
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
package me.jiang.tools.house.finder.lianjia.entity.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import me.fjiang.tool.lianjia.entity.HouseData;

import java.util.List;

/*
 *
 * @author remote
 * @description 
 * @date 8/7/17
 */
@Data
public class ResponseData {
    private List<HouseData> data;
    private PropertyData property;
    @JsonProperty("return_count")
    private int returnCount;
    @JsonProperty("total_count")
    private int totalCount;
}
