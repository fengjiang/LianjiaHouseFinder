/*
* Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : novel-downloader
*
* @File name : LianjiaConnector.java
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
package me.jiang.tools.house.finder.lianjia.lianjia.netfetcher;

import me.fjiang.tool.lianjia.entity.HouseData;
import me.fjiang.tool.lianjia.entity.response.ResponseResult;
import me.fjiang.tool.lianjia.util.Constants;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/*
 *
 * @author remote
 * @description 
 * @date 8/7/17
 */
//@Component
//@Log4j
public class LianjiaConnector {
//    @Autowired
    private RestTemplate restTemplate = new RestTemplate();


//    access_token:7poanTTBCymmgE0FOn1oKp
//    client:pc
//    cityCode:sh
//    community_id:5011000001723
//    limit_offset:1
//    limit_count:100

    public static void main(String[] args){
        LianjiaConnector connector = new LianjiaConnector();
        connector.getHouseDataByVillage("5011000001723");
    }

    public List<HouseData> getHouseDataByVillage(String communityId){
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(Constants.SEARCH_HOUSE_LINK);
        builder.queryParam("access_token", Constants.ACCESS_TOKEN)
                .queryParam("client", "pc")
                .queryParam("cityCode", "sh")
                .queryParam("community_id", communityId)
                .queryParam("limit_offset", 1)
                .queryParam("limit_count",100);
        ResponseEntity<ResponseResult> resultResponseEntity = restTemplate.exchange(builder.buildAndExpand().toUri(), HttpMethod.GET, null, ResponseResult.class);
        ResponseResult responseResult = resultResponseEntity.getBody();
        return responseResult.getData().getData();
    }
}
