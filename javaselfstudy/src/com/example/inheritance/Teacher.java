package com.example.inheritance;

class Teacher {
    private String jobDescription = "Teacher";
    private String workAt ="Towson University";

    public String getJobDescription(){
        return jobDescription;
    }
    protected void setJobDescription(String aJob){
        this.jobDescription = aJob;
    }
    protected String getWorkAt(){
        return workAt;
    }
    protected void setWorkAt(String workPlace){
        this.workAt = workPlace;
    }

    void display (){
        System.out.println(jobDescription+ " and works at " + workAt);
    }


}
