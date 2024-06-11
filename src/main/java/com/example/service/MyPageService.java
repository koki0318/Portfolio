package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.User;
import com.example.repository.UserRepository;

@Service
public class MyPageService {

    @Autowired
    UserRepository userRepository;

    /**
	 *　ユーザ情報取得用メソッド.
	 * @return　ユーザ情報
	 */
    public User showToMyPage(String id) {
        User user = userRepository.findById(id);
        return user;
    }
}
