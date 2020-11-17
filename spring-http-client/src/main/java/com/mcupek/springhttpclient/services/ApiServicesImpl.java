package com.mcupek.springhttpclient.services;

import com.mcupek.springhttpclient.api.domain.Agify;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServicesImpl implements ApiService{


    private RestTemplate restTemplate;


    public ApiServicesImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public Agify[] getAgify(Integer amount) {

        Agify[] agifys = restTemplate.getForObject("https://api.agify.io/?name=marcin&name=natalia&name=kacper&country_ID=PL" + amount, Agify[].class);
        return agifys;
    }
}
