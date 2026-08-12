package dev.leetsync.common.response;

import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.NonNull;

public record ApiResponse<T>(
        T data,
        String message
) {

    @Contract("_ -> new")
    public static <T> @NonNull ApiResponse<T> success(T data) {
        return new ApiResponse<>(data, "Success");
    }

    @Contract("_, _ -> new")
    public static <T> @NonNull ApiResponse<T> success(T data, String message) {
        return new ApiResponse<>(data, message);
    }
}