package com.muratyildirim.app.auth.dto;

import jakarta.validation.constraints.NotBlank;

public record Credentials(@NotBlank String username, @NotBlank String password) {
}
