﻿# AutomationFramework
 A robust end-to-end test automation framework for e-commerce applications built with Java, Selenium WebDriver, and TestNG, following Page Object Model design pattern.
📋 Table of Contents

Architecture
Features
Prerequisites
Tech Stack
Project Structure
Getting Started
Test Execution
Reports
CI/CD Integration
Contributing

🏗 Architecture
mermaidCopygraph TD
    A[Test Scripts] --> B[Page Objects]
    B --> C[Base Test]
    C --> D[WebDriver Factory]
    A --> E[Test Data]
    E --> F[JSON/Excel Files]
    A --> G[TestNG XML]
    G --> H[Test Groups]
    A --> I[Utilities]
    I --> J[Listeners]
    J --> K[Extent Reports]
    I --> L[Screenshot Capture]
    I --> M[Data Providers]
✨ Features

Page Object Model: Maintainable and reusable page objects with encapsulated locators
Data-Driven Testing: Parameterized tests using TestNG DataProvider and JSON file readers
Parallel Execution: Thread-safe mechanism for concurrent test execution
Robust Reporting: Detailed HTML reports using Extent Reports
Failure Handling: Automatic screenshot capture on test failures
Retry Mechanism: Automatic retry for flaky tests
CI/CD Ready: Jenkins integration with parameterized builds
Cross-Browser Testing: Support for multiple browsers
Configuration Management: External property files for easy maintenance

🔧 Tech Stack
CategoryTools & TechnologiesProgramming LanguageJava 11+Testing FrameworkTestNGWeb AutomationSelenium WebDriverBuild ToolMavenReportingExtent ReportsCI/CDJenkinsVersion ControlGitIDEIntelliJ IDEA/Eclipse
📁 Project Structure
Copysrc
├── main/java
│   ├── com.framework
│   │   ├── config
│   │   ├── pages
│   │   ├── utils
│   │   └── reports
├── test/java
│   ├── com.framework
│   │   ├── tests
│   │   └── base
└── test/resources
    ├── config.properties
    ├── testdata
    └── testng.xml
