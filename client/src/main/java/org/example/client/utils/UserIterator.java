package org.example.client.utils;

import org.example.client.dto.UserDTO;

import java.util.Iterator;
import java.util.List;

public class UserIterator implements Iterator<UserDTO> {
    private List<UserDTO> users;
    private int index;

    public UserIterator(List<UserDTO> users) {
        this.users = users;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < users.size();
    }

    @Override
    public UserDTO next() {
        if (this.hasNext()) {
            UserDTO userDTO = users.get(index);
            index++;
            return userDTO;
        }
        throw new IllegalStateException("No more users to iterate over.");
    }
}