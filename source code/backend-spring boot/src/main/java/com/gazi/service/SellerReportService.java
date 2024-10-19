package com.gazi.service;

import com.gazi.model.Seller;
import com.gazi.model.SellerReport;

public interface SellerReportService {
    SellerReport getSellerReport(Seller seller);
    SellerReport updateSellerReport( SellerReport sellerReport);

}
