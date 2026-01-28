package com.example.demo;

import com.google.cloud.vertexai.VertexAI;
import com.google.cloud.vertexai.api.GenerateContentResponse;
import com.google.cloud.vertexai.generativeai.GenerativeModel;

public class ContentCreationService {

    private final Currency contentCoin;

    public ContentCreationService(Currency contentCoin) {
        this.contentCoin = contentCoin;
    }

    public void createContent(User user, String prompt) {
        String projectId = "your-google-cloud-project-id";
        String location = "us-central1";
        String modelName = "gemini-1.5-flash-001";

        try (VertexAI vertexAI = new VertexAI(projectId, location)) {
            GenerativeModel model = new GenerativeModel(modelName, vertexAI);
            GenerateContentResponse response = model.generateContent(prompt);

            System.out.println("Response from AI: " + response);

            user.getWallet().deposit(contentCoin, 10.0);
            System.out.println(user.getName() + " created content and earned 10 " + contentCoin.getName());
        } catch (Exception e) {
            System.err.println("Error creating content: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
