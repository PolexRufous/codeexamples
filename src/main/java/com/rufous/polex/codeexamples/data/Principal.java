package com.rufous.polex.codeexamples.data;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
public record Principal(@Id Long id, String name, @Enumerated(EnumType.STRING) Principal role) {
}
