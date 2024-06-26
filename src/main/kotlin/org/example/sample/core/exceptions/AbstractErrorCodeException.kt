package org.example.sample.core.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

abstract class AbstractErrorCodeException(
    status: HttpStatus,
    reason: String,
    val errorCode: String
) : ResponseStatusException(status, reason)