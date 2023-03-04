package com.driver.services;

import com.driver.model.User;

public interface ConnectionService {
    public default User connect(int userId, String countryName) {
        return null;
    }
    public default User disconnect(int userId) {
        return null;
    }
    public default User communicate(int senderId, int receiverId) {
        return null;
    }
}