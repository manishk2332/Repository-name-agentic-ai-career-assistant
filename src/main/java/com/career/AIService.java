package com.career.agenticcareerassistant;

import org.springframework.stereotype.Service;

@Service
public class AIService {

    public String askAI(String question) {

        String q = question.toLowerCase();

        // ================= JAVA DEVELOPER =================
        if (q.contains("java")) {
            return """
                    🤖 AI Career Assistant - Demo Response

                    ☕ JAVA DEVELOPER CAREER GUIDE

                    For a Java Developer career, focus on:

                    1. Core Java
                    2. OOP Concepts
                    3. Collections Framework
                    4. Exception Handling
                    5. Multithreading
                    6. JDBC
                    7. SQL / MySQL
                    8. Spring Boot
                    9. REST APIs
                    10. Git & GitHub
                    11. Data Structures & Algorithms

                    🎯 Recommended Projects:
                    • Online Banking System
                    • Employee Management System
                    • E-Commerce Backend
                    • REST API Project

                    💡 Interview Tip:
                    Practice Core Java, OOP, SQL and DSA regularly.
                    """;
        }

        // ================= RESUME =================
        if (q.contains("resume") || q.contains("cv")) {
            return """
                    🤖 AI Career Assistant - Demo Response

                    📄 RESUME IMPROVEMENT GUIDE

                    Your resume should contain:

                    1. Career Objective / Summary
                    2. Technical Skills
                    3. Projects
                    4. Education
                    5. Certifications
                    6. Achievements
                    7. GitHub / LinkedIn

                    ✅ Resume Tips:

                    • Keep it preferably to 1 page.
                    • Use simple professional formatting.
                    • Mention technologies used in projects.
                    • Add measurable achievements.
                    • Avoid spelling and grammar mistakes.
                    • Use keywords related to the job description.

                    🎯 Tip:
                    Customize your resume according to each job.
                    """;
        }

        // ================= INTERVIEW =================
        if (q.contains("interview") || q.contains("interview preparation")) {
            return """
                    🤖 AI Career Assistant - Demo Response

                    🎤 TECHNICAL INTERVIEW PREPARATION

                    Prepare these important topics:

                    1. Core Java
                    2. OOP
                    3. Data Structures
                    4. Algorithms
                    5. DBMS
                    6. SQL
                    7. Operating Systems
                    8. Computer Networks
                    9. Project Explanation
                    10. HR Questions

                    ⭐ Common Questions:

                    • Tell me about yourself.
                    • Explain OOP concepts.
                    • What is inheritance?
                    • Difference between ArrayList and LinkedList?
                    • What is SQL JOIN?
                    • Explain your project.
                    • Why should we hire you?

                    💡 Tip:
                    Practice answering questions clearly and confidently.
                    """;
        }

        // ================= SKILLS =================
        if (q.contains("skill") || q.contains("skills") || q.contains("learn")) {
            return """
                    🤖 AI Career Assistant - Demo Response

                    📊 RECOMMENDED SOFTWARE DEVELOPMENT SKILLS

                    Technical Skills:

                    • Java
                    • C++
                    • Python
                    • SQL
                    • Spring Boot
                    • REST API
                    • Git & GitHub
                    • Data Structures & Algorithms
                    • DBMS
                    • Operating Systems

                    Soft Skills:

                    • Communication
                    • Problem Solving
                    • Teamwork
                    • Time Management
                    • Logical Thinking

                    🎯 Priority:

                    Start with programming fundamentals → DSA → SQL
                    → Git → Backend Development → Projects.
                    """;
        }

        // ================= JOB RECOMMENDATION =================
        if (q.contains("job") || q.contains("jobs")
                || q.contains("developer") || q.contains("career opportunity")) {

            return """
                    🤖 AI Career Assistant - Demo Response

                    💼 JOB RECOMMENDATIONS

                    Suitable entry-level roles:

                    1. Java Developer
                    2. Backend Developer
                    3. Software Developer
                    4. Spring Boot Developer
                    5. Junior Full Stack Developer
                    6. Associate Software Engineer
                    7. Application Developer

                    📌 Skills Required:

                    • Core Java
                    • OOP
                    • SQL
                    • Spring Boot
                    • REST APIs
                    • Git & GitHub
                    • Data Structures & Algorithms

                    📁 Recommended Projects:

                    • Online Banking System
                    • Inventory Management System
                    • Student Management System
                    • E-Commerce Application

                    🎯 Job Tip:
                    Build 2-3 strong projects and maintain an updated
                    GitHub and LinkedIn profile before applying.
                    """;
        }

        // ================= CAREER ROADMAP =================
        if (q.contains("roadmap") || q.contains("career path")
                || q.contains("how to become")) {

            return """
                    🤖 AI Career Assistant - Demo Response

                    🗺️ SOFTWARE DEVELOPER CAREER ROADMAP

                    STEP 1 → Programming Fundamentals
                    Learn Java / C++ / Python.

                    STEP 2 → Data Structures & Algorithms
                    Practice Arrays, Strings, LinkedList, Stack,
                    Queue, Trees, Graphs and Dynamic Programming.

                    STEP 3 → Database
                    Learn SQL, MySQL and DBMS concepts.

                    STEP 4 → Backend Development
                    Learn Spring Boot, REST APIs and JDBC.

                    STEP 5 → Development Tools
                    Learn Git, GitHub, Maven and Postman.

                    STEP 6 → Projects
                    Build 2-3 real-world projects.

                    STEP 7 → Interview Preparation
                    Practice DSA, technical questions and HR questions.

                    STEP 8 → Apply for Jobs
                    Apply through LinkedIn, company career pages
                    and placement opportunities.

                    🎯 Goal:
                    Become job-ready by combining skills,
                    projects and interview preparation.
                    """;
        }

        // ================= SKILL GAP =================
        if (q.contains("gap") || q.contains("improve")
                || q.contains("weakness") || q.contains("missing")) {

            return """
                    🤖 AI Career Assistant - Demo Response

                    📊 SKILL GAP ANALYSIS

                    To become job-ready, focus on these areas:

                    🔴 High Priority:
                    • Data Structures & Algorithms
                    • SQL
                    • Core Java
                    • OOP

                    🟡 Medium Priority:
                    • Spring Boot
                    • REST APIs
                    • Git & GitHub
                    • DBMS

                    🟢 Additional Skills:
                    • Communication
                    • Problem Solving
                    • System Design Basics
                    • Project Presentation

                    🎯 Action Plan:

                    1. Practice DSA daily.
                    2. Strengthen Core Java.
                    3. Learn SQL.
                    4. Build Spring Boot projects.
                    5. Practice technical interviews.
                    """;
        }

        // ================= PROJECT =================
        if (q.contains("project") || q.contains("projects")) {
            return """
                    🤖 AI Career Assistant - Demo Response

                    💻 PROJECT RECOMMENDATIONS

                    Beginner:
                    • Student Management System
                    • Calculator Application
                    • Library Management System

                    Intermediate:
                    • Online Banking System
                    • Inventory Management System
                    • Employee Management System

                    Advanced:
                    • E-Commerce Application
                    • Job Portal
                    • Online Banking Web Application
                    • AI Career Assistant

                    ⭐ Recommended Stack:

                    Java + Spring Boot + MySQL + HTML/CSS/JavaScript

                    🎯 Tip:
                    Choose projects that demonstrate real-world
                    problem solving and backend development.
                    """;
        }

        // ================= GENERAL =================
        return """
                🤖 AI Career Assistant - Demo Response

                👋 Welcome to the Agentic AI Career Assistant!

                I can help you with:

                💼 Job Recommendations
                📄 Resume Improvement
                📊 Skill Gap Analysis
                🗺️ Career Roadmaps
                🎤 Interview Preparation
                💻 Project Recommendations
                ☕ Java Developer Guidance
                📚 Learning Skills

                Try asking:

                • What skills should I learn for Java?
                • How can I improve my resume?
                • Give me a career roadmap.
                • Find suitable developer jobs.
                • How should I prepare for interviews?
                • Suggest some projects.
                """;
    }
}