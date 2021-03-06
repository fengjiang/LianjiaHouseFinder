/*
* Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : novel-downloader
*
* @File name : ResponseResult.java
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

import lombok.Data;

/*
 *
 * @author remote
 * @description 
 * @date 8/7/17
 */
@Data
public class ResponseResult {
    private int errno;
    private String status;
    private ResponseData data;
}
