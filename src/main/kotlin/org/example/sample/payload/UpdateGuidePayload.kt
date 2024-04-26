package org.example.sample.payload

import jakarta.validation.Valid
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import org.example.sample.domain.GuideType
import org.hibernate.validator.constraints.Length

data class UpdateGuidePayload(
    @field: NotNull
    val id: Long,

    @field: NotBlank
    @field: Length(max = 20)
    val title: String,

    @field: NotBlank
    @field: Length(max = 20)
    val author: String,

    @field: Valid
    val type: GuideType,

    val enable: Boolean?
)