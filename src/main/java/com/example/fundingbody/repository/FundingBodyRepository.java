package com.example.fundingbody.repository;

import com.example.fundingbody.model.FundingBody;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundingBodyRepository extends JpaRepository<FundingBody, Long> {}
