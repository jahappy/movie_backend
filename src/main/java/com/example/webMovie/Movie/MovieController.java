package com.example.webMovie.Movie;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MovieController {

    @GetMapping(value = "/message")
    @ResponseBody
    public String testByResponseBody() {
        return "1231213";
    }

}
