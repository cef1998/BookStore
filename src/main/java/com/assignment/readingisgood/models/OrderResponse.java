package com.assignment.readingisgood.models;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class OrderResponse{
    private String status;
    private Object description;
}
