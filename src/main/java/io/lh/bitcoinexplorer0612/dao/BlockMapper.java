package io.lh.bitcoinexplorer0612.dao;

import io.lh.bitcoinexplorer0612.po.Block;

public interface BlockMapper {
    int deleteByPrimaryKey(String blockhash);

    int insert(Block record);

    int insertSelective(Block record);

    Block selectByPrimaryKey(String blockhash);

    int updateByPrimaryKeySelective(Block record);

    int updateByPrimaryKey(Block record);
}