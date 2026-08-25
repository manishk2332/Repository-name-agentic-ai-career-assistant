package com.career.agenticcareerassistant;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ResumeController {

    @GetMapping("/resume")
    public String resumePage() {
        return "resume";
    }

    @PostMapping("/resume/analyze")
    public String analyzeResume(
            @RequestParam("resume") MultipartFile file,
            Model model) {

        if (file.isEmpty()) {
            model.addAttribute("error", "Please select a PDF resume.");
            return "resume";
        }

        if (file.getOriginalFilename() == null ||
                !file.getOriginalFilename().toLowerCase().endsWith(".pdf")) {

            model.addAttribute("error", "Only PDF files are supported.");
            return "resume";
        }

        try {

            byte[] pdfBytes = file.getBytes();

            var document = Loader.loadPDF(pdfBytes);

            PDFTextStripper stripper = new PDFTextStripper();

            String extractedText = stripper.getText(document);

            document.close();

            if (extractedText == null || extractedText.trim().isEmpty()) {

                model.addAttribute(
                        "error",
                        "Could not extract text from this PDF."
                );

                return "resume";
            }

            String text = extractedText.toLowerCase();

            // ==============================
            // DETECTED SKILLS
            // ==============================

            String[] skillList = {
                    "java",
                    "c++",
                    "python",
                    "javascript",
                    "html",
                    "css",
                    "spring boot",
                    "spring",
                    "mysql",
                    "sql",
                    "mongodb",
                    "git",
                    "github",
                    "jdbc",
                    "rest api",
                    "data structures",
                    "algorithms"
            };

            List<String> detectedSkills = new ArrayList<>();

            for (String skill : skillList) {

                if (text.contains(skill)) {
                    detectedSkills.add(skill);
                }
            }

            // ==============================
            // STRENGTHS
            // ==============================

            List<String> strengths = new ArrayList<>();

            if (text.contains("project") ||
                    text.contains("projects")) {

                strengths.add("Project Experience");
            }

            if (text.contains("internship") ||
                    text.contains("intern")) {

                strengths.add("Internship Experience");
            }

            if (text.contains("certification") ||
                    text.contains("certificate")) {

                strengths.add("Certifications");
            }

            if (text.contains("github")) {
                strengths.add("GitHub Profile");
            }

            if (text.contains("linkedin")) {
                strengths.add("LinkedIn Profile");
            }

            if (text.contains("b.tech") ||
                    text.contains("btech")) {

                strengths.add("Technical Education");
            }

            // ==============================
            // JOB ROLES
            // ==============================

            List<String> jobRoles = new ArrayList<>();

            if (text.contains("java") ||
                    text.contains("spring")) {

                jobRoles.add("Java Developer");
                jobRoles.add("Backend Developer");
            }

            if (text.contains("html") ||
                    text.contains("css") ||
                    text.contains("javascript")) {

                jobRoles.add("Web Developer");
            }

            if (text.contains("python")) {

                jobRoles.add("Python Developer");
            }

            if (text.contains("sql") ||
                    text.contains("mysql")) {

                jobRoles.add("Database / Backend Developer");
            }

            if (jobRoles.isEmpty()) {

                jobRoles.add("Software Developer");
                jobRoles.add("Junior Software Engineer");
            }

            // ==============================
            // SKILL GAPS
            // ==============================

            String[] importantSkills = {
                    "java",
                    "spring boot",
                    "sql",
                    "git",
                    "data structures",
                    "rest api"
            };

            List<String> skillGaps = new ArrayList<>();

            for (String skill : importantSkills) {

                if (!text.contains(skill)) {
                    skillGaps.add(skill);
                }
            }

            // ==============================
            // PERSONALIZED LEARNING PLAN
            // ==============================

            List<String> learningPlan = new ArrayList<>();

            for (String gap : skillGaps) {

                switch (gap.toLowerCase()) {

                    case "spring boot":
                        learningPlan.add(
                                "Days 1-7: Learn Spring Boot, dependency injection, controllers, REST APIs and build a basic CRUD application."
                        );
                        break;

                    case "sql":
                        learningPlan.add(
                                "Days 8-12: Learn SQL, SELECT, JOIN, GROUP BY, subqueries and practice using MySQL."
                        );
                        break;

                    case "git":
                        learningPlan.add(
                                "Days 13-15: Learn Git and GitHub, commits, branches, merge, push, pull and pull requests."
                        );
                        break;

                    case "data structures":
                        learningPlan.add(
                                "Days 16-24: Practice Arrays, Strings, LinkedList, Stack, Queue, Trees and basic Graphs."
                        );
                        break;

                    case "rest api":
                        learningPlan.add(
                                "Days 25-27: Learn REST APIs, HTTP methods, JSON and test APIs using Postman."
                        );
                        break;

                    case "java":
                        learningPlan.add(
                                "Days 28-30: Strengthen Core Java, OOP, Collections, Exception Handling and Multithreading."
                        );
                        break;

                    default:
                        learningPlan.add(
                                "Practice " + gap + " with tutorials and build a small practical project."
                        );
                        break;
                }
            }

            // ==============================
            // RESUME SCORE
            // ==============================

            int score = 40;

            if (!detectedSkills.isEmpty()) {
                score += 15;
            }

            if (strengths.contains("Project Experience")) {
                score += 15;
            }

            if (strengths.contains("Certifications")) {
                score += 10;
            }

            if (strengths.contains("GitHub Profile")) {
                score += 10;
            }

            if (strengths.contains("LinkedIn Profile")) {
                score += 10;
            }

            if (score > 100) {
                score = 100;
            }

            // ==============================
            // MODEL ATTRIBUTES
            // ==============================

            model.addAttribute("resumeText", extractedText);
            model.addAttribute("detectedSkills", detectedSkills);
            model.addAttribute("strengths", strengths);
            model.addAttribute("jobRoles", jobRoles);
            model.addAttribute("skillGaps", skillGaps);
            model.addAttribute("learningPlan", learningPlan);
            model.addAttribute("score", score);

        } catch (IOException e) {

            model.addAttribute(
                    "error",
                    "Error reading PDF: " + e.getMessage()
            );
        }

        return "resume";
    }
}