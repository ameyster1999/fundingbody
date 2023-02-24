package com.example.fundingbody.service;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import com.example.fundingbody.model.FundingBody;
import com.example.fundingbody.repository.FundingBodyRepository;
import java.util.Date;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class FundingBodyServiceTest {
    @Autowired private FundingBodyService fundingBodyService;

    @MockBean private FundingBodyRepository fundingBodyRepository;

    @SneakyThrows
    @Test
    void createFunder_validInput_shouldReturnId() {
        // Arrange
        FundingBody fundingBody =
                FundingBody.builder()
                        .id(1L)
                        .name("test")
                        .email("test@test.com")
                        .phone("1234567890")
                        .contactAddress("Test Address")
                        .createdDate(new Date())
                        .build();

        when(fundingBodyRepository.save(any(FundingBody.class))).thenReturn(fundingBody);
        Long expectedId = 1L;

        // Act
        Long actualId = fundingBodyService.createFunder(fundingBody);

        // Assert
        assertThat(actualId).isEqualTo(expectedId);
    }
}
