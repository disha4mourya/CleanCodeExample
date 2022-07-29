package com.example.cleancodeexamples.functions.preferExceptionsToReturningErrorCodes;

public enum Error {
    OK,
    INVALID,
    NO_SUCH,
    LOCKED, OUT_OF_RESOURCES, WAITING_FOR_EVENT;
}