package dev.leetsync.common.response;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApiResponseTest {

    @Test
    void shouldCreateSuccessfulResponse() {
        ApiResponse<String> response =
                ApiResponse.success("hello");

        assertEquals("hello", response.data());
        assertEquals("Success", response.message());
    }

    @Test
    void shouldCreateSuccessfulResponseWithCustomMessage() {
        ApiResponse<String> response =
                ApiResponse.success(
                        "hello",
                        "Operation completed"
                );

        assertEquals("hello", response.data());
        assertEquals("Operation completed", response.message());
    }
}