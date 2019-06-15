package io.lh.bitcoinexplorer0612.controller;

import io.lh.bitcoinexplorer0612.dto.BlockGetDTO;
import io.lh.bitcoinexplorer0612.dto.BlockListDTO;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequestMapping("/block")
@RestController
@CrossOrigin
@EnableAutoConfiguration
public class BlockController {

    @GetMapping("/getRecentBlocks")
    public List<BlockListDTO> getRecentBlocks(){
        ArrayList<BlockListDTO> blockListDTOS = new ArrayList<>();

        BlockListDTO blockListDTO = new BlockListDTO();
        blockListDTO.setBlockhash("00000000000000000001198740413e5d08328a3c3b588f98385e5aa1a007b942");
        blockListDTO.setHeight(580772);
        blockListDTO.setTime(new Date());
        blockListDTO.setTxsize((short) 3044);
        blockListDTO.setSize(1280805);
        blockListDTOS.add(blockListDTO);

        BlockListDTO blockListDTO2 = new BlockListDTO();
        blockListDTO2.setBlockhash("00000000000000000003c948e17b08733d7391cabba90e606ec7b552b3bf7c1b");
        blockListDTO2.setHeight(580771);
        blockListDTO2.setTime(new Date());
        blockListDTO2.setTxsize((short) 3272 );
        blockListDTO2.setSize(1280805);
        blockListDTOS.add(blockListDTO2);
        return blockListDTOS;
    }

    @GetMapping("/getBlockHash")
    public BlockGetDTO getByBlockhash(@RequestParam String blockhash){
        BlockGetDTO blockGetDTO = new BlockGetDTO();
        blockGetDTO.setBlockhash("00000000000000000003c948e17b08733d7391cabba90e606ec7b552b3bf7c1b");
        blockGetDTO.setHeight(580771);
        blockGetDTO.setPrevBlcok("00000000000000000005ac7036789bfec28d230dff491f3382f6daf6523f5c44");
        blockGetDTO.setNextBlock("00000000000000000024b3d4793dcbba032d3fc28a0d77a37d466b956fb68aa5");
        blockGetDTO.setMerkleRoot("07ac3d1c827b5c3ef69a7341bbdb2bf72339139b5f9e7e782d1bc82265b17798");
        blockGetDTO.setTime(new Date().getTime());
        blockGetDTO.setFees(8766.38);
        blockGetDTO.setTxSize((short) 3272);
        blockGetDTO.setSize(1280805);
        blockGetDTO.setDifficulty(7409399249090.25);
        return blockGetDTO;
    }

    @GetMapping("/getByHeight")
    public BlockGetDTO getByHeight(@RequestParam Integer height){
        BlockGetDTO blockGetDTO = new BlockGetDTO();
        blockGetDTO.setBlockhash("00000000000000000001ce5f88601a311f1c73c0073a15fe4e5956da7fbcd78b");
        blockGetDTO.setHeight(580643);
        blockGetDTO.setPrevBlcok("00000000000000000005ac7036789bfec28d230dff491f3382f6daf6523f5c44");
        blockGetDTO.setNextBlock("00000000000000000024b3d4793dcbba032d3fc28a0d77a37d466b956fb68aa5");
        blockGetDTO.setMerkleRoot("07ac3d1c827b5c3ef69a7341bbdb2bf72339139b5f9e7e782d1bc82265b17798");
        blockGetDTO.setTime(new Date().getTime());
        blockGetDTO.setFees(8766.38);
        blockGetDTO.setTxSize((short) 2702);
        blockGetDTO.setSize(1322496);
        blockGetDTO.setDifficulty(7409399249090.25);

        return blockGetDTO;
    }

    @GetMapping("/getByPrevBlcok")
    public BlockGetDTO getByPrevBlcok(@RequestParam String prevBlock){

        BlockGetDTO blockGetDTO = new BlockGetDTO();
        blockGetDTO.setBlockhash("0000000000000000001ec53a5934fa44779d8ab375605cc80fc1f2eb96c76ce8");
        blockGetDTO.setDifficulty(7409399249090.25);
        blockGetDTO.setFees(1773.224);
        blockGetDTO.setHeight(580688);
        blockGetDTO.setMerkleRoot("07ac3d1c827b5c3ef69a7341bbdb2bf72339139b5f9e7e782d1bc82265b17798");
        blockGetDTO.setNextBlock("00000000000000000006a0673f90d900aefe5f7bef705f7dbdabe9b7077e06dd");
        blockGetDTO.setPrevBlcok("0000000000000000001ec53a5934fa44779d8ab375605cc80fc1f2eb96c76ce8");
        blockGetDTO.setSize(1115);
        blockGetDTO.setTime(new Date().getTime());
        blockGetDTO.setTxSize((short) 1818);

        return blockGetDTO;
    }

    @GetMapping("/getByNextBlcok")
    public BlockGetDTO getByNextBlcok(@RequestParam String nextBlock){
        BlockGetDTO blockGetDTO = new BlockGetDTO();
        blockGetDTO.setBlockhash("00000000000000000001ce5f88601a311f1c73c0073a15fe4e5956da7fbcd78b");
        blockGetDTO.setDifficulty(7409399249090.25);
        blockGetDTO.setFees(1225.464);
        blockGetDTO.setHeight(580690);
        blockGetDTO.setMerkleRoot("07ac3d1c827b5c3ef69a7341bbdb2bf72339139b5f9e7e782d1bc82265b17798");
        blockGetDTO.setNextBlock("00000000000000000024b3d4793dcbba032d3fc28a0d77a37d466b956fb68aa5");
        blockGetDTO.setPrevBlcok("0000000000000000001ec53a5934fa44779d8ab375605cc80fc1f2eb96c76ce8");
        blockGetDTO.setSize(1250);
        blockGetDTO.setTime(new Date().getTime());
        blockGetDTO.setTxSize((short) 1834);

        return blockGetDTO;
    }

}
