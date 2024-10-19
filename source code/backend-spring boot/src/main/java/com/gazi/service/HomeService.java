package com.gazi.service;

import com.gazi.model.Home;
import com.gazi.model.HomeCategory;

import java.util.List;

public interface HomeService {

    Home creatHomePageData(List<HomeCategory> categories);

}
