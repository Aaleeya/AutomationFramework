# Automation Testing Framework

A robust end-to-end test automation framework for e-commerce applications built with Java, Selenium WebDriver, and TestNG, following Page Object Model design pattern.

## 📋 Table of Contents
- [Architecture](#architecture)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Test Execution](#test-execution)
- [Reports](#reports)
- [CI/CD Integration](#cicd-integration)
- [Contributing](#contributing)

## 🏗 Architecture

```markdown
graph TD
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
    I --> M[Data Providers]
```

## ✨ Features

- **Page Object Model**: Maintainable and reusable page objects with encapsulated locators
- **Data-Driven Testing**: Parameterized tests using TestNG DataProvider and JSON file readers
- **Parallel Execution**: Thread-safe mechanism for concurrent test execution
- **Robust Reporting**: Detailed HTML reports using Extent Reports
- **Failure Handling**: Automatic screenshot capture on test failures
- **Retry Mechanism**: Automatic retry for flaky tests
- **CI/CD Ready**: Jenkins integration with parameterized builds
- **Cross-Browser Testing**: Support for multiple browsers
- **Configuration Management**: External property files for easy maintenance

## 🔧 Tech Stack

| Category             | Tools & Technologies |
|----------------------|----------------------|
| Programming Language | Java 18+             |
| Testing Framework    | TestNG               |
| Web Automation       | Selenium WebDriver   |
| Build Tool           | Maven                |
| Reporting            | Extent Reports       |
| CI/CD                | Jenkins              |
| Version Control      | Git                  |
| IDE                  | IntelliJ IDEA        |

## 📁 Project Structure
```markdown
src
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
```
## 🚀 Getting Started

### 1. Clone the repository:
```bash
git clone https://github.com/yourusername/AutomationFramework.git
```
### 2. Install dependencies:

```bash 
mvn clean install
```

### 3. Update config.properties with your test environment details:

```bash 
propertiesCopybrowser=chrome
baseUrl=https://your-application-url.com
implicitWait=10
```

## ▶️ Test Execution
### Local Execution
```bash
# Run all tests
mvn clean test

# Run specific test groups
mvn clean test -Dgroups=smoke,regression

# Run with specific browser
mvn clean test -Dbrowser=firefox
```

### Jenkins Execution

1. Create a new Jenkins Pipeline job
2. Configure SCM and build triggers
3. Add build parameters for flexible execution
4. Configure email notifications for test results

## 📊 Reports

- Extent Reports are generated in test-output/ExtentReport.html
- Screenshots for failed tests are captured in test-output/screenshots
- TestNG reports are available in target/surefire-reports

## 🔄 CI/CD Integration
The framework is integrated with Jenkins for continuous testing:

- Scheduled execution using cron jobs
- Parameterized builds for flexibility
- Pipeline stages for different test suites
- Email notifications with test results
- Test artifacts archival

## 🤝 Contributing

- Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

- Please make sure to update tests as appropriate.
