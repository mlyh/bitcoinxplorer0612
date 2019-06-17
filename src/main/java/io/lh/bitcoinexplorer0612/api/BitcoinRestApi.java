package io.lh.bitcoinexplorer0612.api;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "BitcoinRestApi",url = "http://localhost:18332")
public interface BitcoinRestApi  {

    @GetMapping("/rest/chaininfo.json")
    JSONObject getBlockChainIndo();

    @GetMapping("/rest/block/notxdetails/{blockhash}.json")
    JSONObject getBlockNoDetails(@PathVariable String blockhash);

    @GetMapping("/rest/block/{block}.json")
    JSONObject getBlock(@PathVariable String block);


    @GetMapping("/rest/headers/{count}/{blockhash}.json")
    JSONArray getBlockHeaders(@PathVariable Integer count, @PathVariable String blockhash);

    @GetMapping("/rest/tx/{txhash}.json")
    JSONObject getTransactions(@PathVariable String txhash);

    @GetMapping("/rest/blockhashbyheight/{height}.json")
    JSONObject getBlockhashByHeight(@PathVariable String height);

    @GetMapping("/rest/mempool/info.json")
    JSONObject getMempoolInfo();

    @GetMapping("/rest/mempool/contents.json")
    JSONObject getMempoolContents();

    @GetMapping("/rest/getutxos/checkmempool/{txid}-{n}.json")
    JSONObject getUTXOs(@PathVariable(value = "txid") String txid,@PathVariable(value = "n") String n);





}
