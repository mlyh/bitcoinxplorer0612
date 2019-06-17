package io.lh.bitcoinexplorer0612.controller;

import com.alibaba.fastjson.JSONObject;
import io.lh.bitcoinexplorer0612.api.BitcoinRestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/temp")
@RestController
public class TempController {

    @Autowired
    private BitcoinRestApi bitcoinRestApi;

    @GetMapping("/test")
    public String test(){
       // JSONObject b = bitcoinRestApi.getBlockChainIndo();
        //JSONObject b = bitcoinRestApi.getBlockNoDetails("00000000000008dba07e7d40622786b2bebc6118ce3c8188e47a01139691d121");
        //JSONObject b = bitcoinRestApi.getBlock("00000000000008dba07e7d40622786b2bebc6118ce3c8188e47a01139691d121");
        //JSONObject b = bitcoinRestApi.getBlockHeaders(5,"00000000003751468e16e359fade039e0798c8bc9a830896ed20854840e10fed");

        //JSONObject b = bitcoinRestApi.getTransactions("000000000000003b90c4e88fdf15c1394ab945f41978cafa445d8ee1ef63525b");
        //JSONObject b = bitcoinRestApi.getBlockhashByHeight("148106");
        //JSONObject b = bitcoinRestApi.getMempoolInfo("000000000000003b90c4e88fdf15c1394ab945f41978cafa445d8ee1ef63525b");
        JSONObject b = bitcoinRestApi.getMempoolContents();
        return JSONObject.toJSONString(b);
    }


}
