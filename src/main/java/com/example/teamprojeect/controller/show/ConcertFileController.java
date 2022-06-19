package com.example.teamprojeect.controller.show;

import com.example.teamprojeect.service.ShowService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/file/concert/*")
@Controller
public class ConcertFileController {
    // 필드 생성
    private ShowService concertService;


}