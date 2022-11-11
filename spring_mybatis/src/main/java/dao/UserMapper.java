package dao;

import domain.User;

import java.io.IOException;
import java.util.List;

public interface UserMapper {
    List<User> findAll() throws IOException;
}
