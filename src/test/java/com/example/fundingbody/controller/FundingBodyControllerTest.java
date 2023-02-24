package com.example.fundingbody.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.example.fundingbody.model.FundingBody;
import com.example.fundingbody.service.FundingBodyService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(FundingBodyController.class)
class FundingBodyControllerTest {
    @Autowired private MockMvc mockMvc;

    @MockBean private FundingBodyService fundingBodyService;

    @Autowired private ObjectMapper objectMapper;

    @Test
    void createFunder_validInput_Success() throws Exception {
        // Arrange
        FundingBody fundingBody =
                FundingBody.builder()
                        .name("test")
                        .email("test@test.com")
                        .phone("1234567890")
                        .contactAddress("Test Address")
                        .createdDate(new Date())
                        .build();

        when(fundingBodyService.createFunder(any(FundingBody.class))).thenReturn(1L);

        // Act and Assert
        mockMvc.perform(
                        post("/funders/")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(writeValueAsString(fundingBody)))
                .andExpect(status().isOk())
                .andExpect(content().string("1"));
    }

    static String writeValueAsString(final Object obj) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            return mapper.writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
