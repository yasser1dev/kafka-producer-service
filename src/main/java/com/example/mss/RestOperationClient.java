package com.example.mss;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import javax.ws.rs.core.Context;
import java.util.Collection;

@FeignClient(name = "COMPTES-SERVICE")
public interface RestOperationClient {
    @GetMapping(path = "/operations")
    Collection<Operation> getAllOperations();
}
