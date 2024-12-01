package com.tipaek.scriptsmith.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OpenAIService {
    @Value("${openai.api.key}")
    private String apiKey;
    private static final String API_URL = "https://api.openai.com/v1/chat/completions";

    public String callOpenAPI(String prompt) {
        return "";
    }

}
