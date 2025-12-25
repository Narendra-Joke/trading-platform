package com.root.service;

import com.root.model.Coin;
import com.root.model.User;
import com.root.model.WatchList;

public interface WatchListService {
    WatchList findUserWatchList(Long userId) throws Exception;

    WatchList createWatchList(User user);

    WatchList findById(Long id) throws Exception;

    Coin addItemToWatchList(Coin coin, User user) throws Exception;


}
