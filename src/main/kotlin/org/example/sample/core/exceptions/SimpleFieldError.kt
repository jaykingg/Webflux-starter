package org.example.sample.core.exceptions

import org.springframework.validation.FieldError

data class SimpleFieldError(
    val field: String,
    val message: String?
)

fun FieldError.toCustomFieldError() = SimpleFieldError(
    field = field,
    message = defaultMessage
)
