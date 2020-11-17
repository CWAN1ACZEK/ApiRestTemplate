package com.mcupek.springhttpclient.services;

import com.mcupek.springhttpclient.api.domain.Agify;

import java.util.List;

public interface ApiService {

    Agify[] getAgify(Integer amount);

}
