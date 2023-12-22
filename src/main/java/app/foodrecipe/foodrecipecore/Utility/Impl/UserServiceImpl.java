package app.foodrecipe.foodrecipecore.Utility.Impl;

import app.foodrecipe.foodrecipecore.Repository.UserRepository;
import app.foodrecipe.foodrecipecore.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
