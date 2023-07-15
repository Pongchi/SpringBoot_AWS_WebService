package com.pongchi.blog.web.dto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class HelloResponseTest {
    
    @Test
    public void lombok_function_test() {
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
