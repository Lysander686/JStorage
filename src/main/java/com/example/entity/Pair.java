package com.example.entity;

import com.example.Config;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pair {
    private String key;
    private String val;

    // unit: second
    private long timeOut = Config.DEFAULT_TIMEOUT;

    public Pair(String key, String val) {
        this.key = key;
        this.val = val;
    }
}
