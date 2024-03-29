package io.lh.bitcoinexplorer0612.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import io.lh.bitcoinexplorer0612.api.BitcoinJsonRpcApi;
import io.lh.bitcoinexplorer0612.api.BitcoinRestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@RequestMapping("/temp")
@RestController
public class TempController {

    @Autowired
    private BitcoinRestApi bitcoinRestApi;

    @Autowired
    private BitcoinJsonRpcApi bitcoinJsonRpcApi;

    @GetMapping("/test")
    public String test() throws Throwable {
        //JSONObject b = bitcoinRestApi.getBlockChainIndo();
        //JSONObject b = bitcoinRestApi.getBlockNoDetails("00000000000008dba07e7d40622786b2bebc6118ce3c8188e47a01139691d121");
        //JSONObject b = bitcoinRestApi.getBlock("00000000000008dba07e7d40622786b2bebc6118ce3c8188e47a01139691d121");
        //JSONArray b = bitcoinRestApi.getBlockHeaders(5,"00000000003751468e16e359fade039e0798c8bc9a830896ed20854840e10fed");

        //JSONObject b = bitcoinRestApi.getTransactions("000000000000003b90c4e88fdf15c1394ab945f41978cafa445d8ee1ef63525b");
        //JSONObject b = bitcoinRestApi.getBlockhashByHeight("148106");
        //JSONObject b = bitcoinRestApi.getMempoolInfo("000000000000003b90c4e88fdf15c1394ab945f41978cafa445d8ee1ef63525b");
        //JSONObject b = bitcoinRestApi.getMempoolContents();
        //JSONObject b = bitcoinRestApi.getUTXOs("56fba94d92db839b07db66607821dad55696d91a50c0d73ac14e0f7a56892b3a","0");

//        JsonRpcHttpClient client = new JsonRpcHttpClient(new URL("http://localhost:18332/"));
//
//        JSONObject user = client.invoke("getblockchaininfo", new Object[] {}, JSONObject.class);
        JSONObject blockchainInfo = bitcoinJsonRpcApi.getBlockchainInfo();


        return null;
    }
}
