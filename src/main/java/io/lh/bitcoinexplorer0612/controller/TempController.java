package io.lh.bitcoinexplorer0612.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import io.lh.bitcoinexplorer0612.api.BitcoinRestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/temp")
@RestController
public class TempController {

    @Autowired
    private BitcoinRestApi bitcoinRestApi;

    @GetMapping("/test")
    public String test(){
        //JSONObject b = bitcoinRestApi.getBlockChainIndo();
        //JSONObject b = bitcoinRestApi.getBlockNoDetails("00000000000008dba07e7d40622786b2bebc6118ce3c8188e47a01139691d121");
        //JSONObject b = bitcoinRestApi.getBlock("00000000000008dba07e7d40622786b2bebc6118ce3c8188e47a01139691d121");

        //JSONObject b = bitcoinRestApi.getTransactions("876cb395c1fa747b1a5571ab5ae14b6aec66b41ddcd4018e5d9fb1bf66bca0b8");
        //JSONObject b = bitcoinRestApi.getBlockhashByHeight("148106");
        //JSONObject b = bitcoinRestApi.getMempoolInfo();
        JSONObject b = bitcoinRestApi.getMempoolContents();
        return JSONObject.toJSONString(b);

    }

//    List<Object> headers = (List<Object>) bitcoinRestApi.getBlockHeaders(5, "000000000000003b90c4e88fdf15c1394ab945f41978cafa445d8ee1ef63525b");
//        return JSONObject.toJSONString(headers);


}
