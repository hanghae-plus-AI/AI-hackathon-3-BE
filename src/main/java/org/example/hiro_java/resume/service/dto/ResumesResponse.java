package org.example.hiro_java.resume.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.hiro_java.resume.entity.JobCategory;
import org.example.hiro_java.resume.entity.Language;
import org.example.hiro_java.resume.entity.Resume;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ResumesResponse {

    private String resumeId;
    private String applicantName;
    private String fileName;
    private Long fileSize;
    private Boolean analyzeCompleted;
    private String career;
    private Integer educationLevel;
    private List<String> jobCategories;
    private List<String> languages;

    public ResumesResponse(Resume resume) {
        this.resumeId = resume.getId();
        this.applicantName = resume.getApplicantName();
        this.career = resume.getCareer();
        this.fileName = resume.getFileName();
        this.fileSize = resume.getFileSize();
        this.analyzeCompleted = resume.getAnalyzeCompleted();
        this.educationLevel = resume.getEducationLevel();
        this.jobCategories = resume.getJobCategories().stream().map(JobCategory::getCategory).toList();
        this.languages = resume.getLanguages().stream().map(Language::getLanguage).toList();
    }
}
