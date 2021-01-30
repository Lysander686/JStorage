package com.example.controlller;

import com.example.entity.LFUCache;
import com.example.entity.PairDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    LFUCache cacheStore;


    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/say")
    public String say() {
//        log.info("in say");
        return "Hello World\n line feed?";
    }

    @PostMapping("/set")
    public String set(@RequestBody PairDto pair) {
        cacheStore.put(pair.getKey(), pair.getVal());
        return cacheStore.showList();
    }

    @PostMapping("/get")
    public String get(@RequestBody PairDto pair) {
        return (String) cacheStore.get(pair.getKey());
    }


    @GetMapping("/all")
    public String all() {
        log.info("all");
//        return "test";
        return cacheStore.showList();
    }
}