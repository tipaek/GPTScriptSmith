package com.tipaek.scriptsmith.model;

import com.tipaek.scriptsmith.constants.Prompts;

public class Script {
    private String workerInitPrompt, workerIterationPrompt;

    private String advisorInitPrompt, advisorIterationPrompt;

    private String criticInitPrompt, criticIterationPrompt;

    public Script() {
        workerInitPrompt = Prompts.workerInitPrompt1;
        workerIterationPrompt = Prompts.workerIterationPrompt1;

        advisorInitPrompt = Prompts.advisorInitPrompt1;
        advisorIterationPrompt = Prompts.advisorIterationPrompt1;

        criticInitPrompt = Prompts.criticInitPrompt1;
        criticIterationPrompt = Prompts.criticIterationPrompt1;
    }

    @Override
    public String toString() {
        String output = "HERE ARE THE CURRENT VARIABLES";
        output += workerInitPrompt + "\n" + workerIterationPrompt + "\n" + advisorInitPrompt + "\n" + advisorIterationPrompt + "\n" + criticInitPrompt + "\n" + criticIterationPrompt;
        return output;
    }

    // GETTERS AND SETTERS
    public String getWorkerInitPrompt() { return workerInitPrompt; }

    public String getWorkerIterationPrompt() { return workerIterationPrompt;}

    public String getAdvisorInitPrompt() {return advisorInitPrompt;}

    public String getAdvisorIterationPrompt() {return advisorIterationPrompt;}

    public String getCriticInitPrompt() {return criticInitPrompt;}

    public String getCriticIterationPrompt() {return criticIterationPrompt;}

    public void setWorkerInitPrompt(String workerInitPrompt) {this.workerInitPrompt = workerInitPrompt;}

    public void setWorkerIterationPrompt(String workerIterationPrompt) {this.workerIterationPrompt = workerIterationPrompt;}

    public void setAdvisorInitPrompt(String advisorInitPrompt) {this.advisorInitPrompt = advisorInitPrompt;}

    public void setAdvisorIterationPrompt(String advisorIterationPrompt) {this.advisorIterationPrompt = advisorIterationPrompt;}

    public void setCriticInitPrompt(String criticInitPrompt) {this.criticInitPrompt = criticInitPrompt;}

    public void setCriticIterationPrompt(String criticIterationPrompt) {this.criticIterationPrompt = criticIterationPrompt;}
}
