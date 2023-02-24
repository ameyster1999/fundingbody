package com.example.fundingbody.service;

import com.example.fundingbody.model.FundingBody;
import com.example.fundingbody.repository.FundingBodyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FundingBodyService {
    @Autowired private FundingBodyRepository fundingBodyRepository;

    public Long createFunder(FundingBody fundingBody) throws Exception {
        if (fundingBody == null) {
            throw new Exception("enter name");
        }
        return fundingBodyRepository.save(fundingBody).getId();
    }
}
