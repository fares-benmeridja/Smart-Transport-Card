package com.clientui.clientui.proxies;

import com.clientui.clientui.beans.PassagerBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "passager-microservice", url = "localhost:9001")
public interface MicroservicePassagerProxy {

    @GetMapping("/passagers")
    List<PassagerBean> index();

    @PostMapping("/passagers/create")
    void create(PassagerBean passager);

    @GetMapping("/passagers/{id}")
    PassagerBean show(@PathVariable("id") int id);

    @DeleteMapping("/passagers/delete/{id}")
    void destroy(@PathVariable(name = "id") int id);
}
