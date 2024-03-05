package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @RequestMapping(value = "/user", method = {RequestMethod.POST, RequestMethod.PUT})
    public UserResponse processUser(@RequestBody UserRequest request) {
        UserResponse response = new UserResponse();
        response.setMessage("Запрос успешно обработан");
        response.setUserName(request.getName()); // Включаем имя из запроса в ответ
        return response;
    }
}
