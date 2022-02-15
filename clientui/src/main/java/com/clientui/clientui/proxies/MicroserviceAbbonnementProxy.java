package com.clientui.clientui.proxies;

import com.clientui.clientui.beans.AbbonnementBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "abbonnement-microservice", url = "localhost:9002")
public interface MicroserviceAbbonnementProxy {

    @GetMapping("/abonnement")
    AbbonnementBean get();
}
