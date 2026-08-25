# 🤖 Agentic AI Career Assistant

A browser-based career guidance platform built using Java and Spring Boot.

The application helps students and job seekers with resume analysis,
job recommendations, skill-gap analysis, interview preparation,
career roadmaps and project suggestions.

## 🚀 Features

### 📄 Resume Analyzer
- Upload PDF resume
- Extract resume text
- Calculate estimated resume score
- Detect technical skills
- Identify strengths
- Suggest suitable job roles
- Identify skill gaps
- Generate personalized learning plan

### 💼 Job Recommendations
- Enter target role
- Enter current skills
- Get suitable job roles
- Required skills
- Preparation plan

### 📊 Skill Gap Analysis
- Compare current skills with target role
- Show skill match percentage
- Identify missing skills
- Highlight high-priority skills
- Generate action plan

### 🎤 Interview Preparation
- Role-specific technical questions
- HR interview questions
- Important preparation topics
- Interview preparation tips

### 🗺️ Career Roadmap
- 30-day roadmap
- 60-day roadmap
- 90-day roadmap
- Role-specific career preparation

### 💻 Project Suggestions
- Recommended projects
- Technologies used
- Difficulty level
- Learning outcomes
- Resume benefits

### 🤖 AI Career Agent
- Career-related questions
- Java guidance
- Resume guidance
- Interview preparation
- Career roadmap
- Skill recommendations

> Current version includes a free Demo Mode and does not require
> paid OpenAI API credits for the core demonstration features.

## 🛠️ Technologies Used

- Java
- Spring Boot
- Thymeleaf
- HTML5
- CSS3
- JavaScript
- Maven
- MySQL
- Apache PDFBox
- Git
- GitHub

## 🏗️ Project Architecture

```text
Browser
   ↓
HTML / CSS / JavaScript
   ↓
Spring Boot
   ↓
Controllers
   ↓
Career Analysis Logic
   ↓
PDFBox / Database
📂 Project Structure
agentic-career-assistant/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/career/agenticcareerassistant/
│       │       ├── AIService.java
│       │       ├── HomeController.java
│       │       ├── ResumeController.java
│       │       ├── JobController.java
│       │       ├── InterviewController.java
│       │       ├── RoadmapController.java
│       │       ├── SkillGapController.java
│       │       └── ProjectController.java
│       │
│       └── resources/
│           └── templates/
│               ├── index.html
│               ├── resume.html
│               ├── jobs.html
│               ├── interview.html
│               ├── roadmap.html
│               ├── skill-gap.html
│               └── projects.html
│
├── pom.xml
├── README.md
└── .gitignore
▶️ How to Run
1. Clone the repository
git clone YOUR_GITHUB_REPOSITORY_URL
2. Open the project

Open the project folder in VS Code or IntelliJ IDEA.

3. Run Maven
mvn clean compile
4. Start Spring Boot
mvn spring-boot:run
5. Open in browser
http://localhost:8080
🎯 Future Enhancements
Real LLM integration
Resume-based AI recommendations
Live job search APIs
User authentication
Database-based user profiles
Saved career plans
Interview simulation
Real-time AI chat
Cloud deployment
👨‍💻 Developer

Manish Kumar

B.Tech Computer Science & Engineering

⭐ Project Purpose

This project demonstrates how Java, Spring Boot and AI-oriented
career automation concepts can be combined to build a practical
career assistance platform.


### Step 3 — Git initialize

VS Code Terminal mein project ke **root folder** mein:

```powershell
git init

Phir:

git add .

Phir:

git commit -m "Initial commit - Agentic AI Career Assistant"