# Automated Testing Project with Selenium and JUnit

This repository contains three automated test cases implemented using Java, Selenium, and JUnit:

**1.** [**Webform Automation for Digital Unite**](https://www.digitalunite.com/practice-webform-learners)<br>
**2.** [**Guest Registration Automation for WP Everest**](https://demo.wpeverest.com/user-registration/guest-registration-form/)<br>
**3.** [**Web Scraping for DSEBD Stock Prices**](https://dsebd.org/latest_share_price_scroll_by_value.php)

## **Content**
- [Project Description](#project-description)
  - [Webform Automation for Digital Unite](#Webform-Automation-for-Digital-Unite)
  - [Guest Registration Automation for WP Everest](#Guest-Registration-Automation-for-WP-Everest)
  - [Web Scraping for DSEBD Stock Prices](#Web-Scraping-for-DSEBD-Stock-Prices)
- [Tools & Technologies](#Tools-&-Technologies)
- [Prerequisites](#Prerequisites)
- [How To Run This?](#How-To-Run-This?)
- [Project Reports](#Project-Reports)

## Project Description

### 1. Webform Automation for Digital Unite
Automates the form submission process:
- Fills in the required fields.
- Uploads a file (≤ 2 MB).
- Validates the success message upon submission.

### 2. Guest Registration Automation for WP Everest
Automates the guest registration process:
- Completes all mandatory fields.
- Submit the form.
- Verifies successful registration.

### 3. Web Scraping for DSEBD Stock Prices
Automates stock market data extraction:
- Scrapes stock table data from the DSEBD website.
- Prints all cell values.
- Stores the data in a text file for further reference.

## Tools & Technologies
- **Programming Language**: Java
- **Framework**: JUnit
- **Browser Automation**: Selenium WebDriver
- **IDE**: IntelliJ IDEA or Eclipse

## Prerequisites
Ensure you have the following installed:
- Java Development Kit (JDK) 8 or higher.
- A Selenium-compatible web browser (e.g., Chrome, Firefox).
- ChromeDriver or GeckoDriver (match your browser version).

## How To Run This?
1. Clone the repository:
   ```bash
   git clone https://github.com/rashadkhan97/Automation-using-Junit.git
2. Open the Project in any IDE
3. Add Dependency in the build.gradle file and reload gradle from the top right
   - Dependencies Add:
     - [Selenium Java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.27.0)
     - [Java Faker](https://mvnrepository.com/artifact/com.github.javafaker/javafaker/1.0.2)
    ![image](https://github.com/user-attachments/assets/09e6ac24-be1c-4f25-b429-95190e992269)
4. Verification
   - For the web forms:
      - Check the assertion logs for success or failure messages.
   - For the table scraping:
      - Verify the console output and the generated text file (e.g., store.txt).
5. Output Files
   - Logs: Test results and execution details are logged in the console.
   - Text File: Scraped table data is stored in store.txt.

## Project Reports
### 1. Webform Automation for Digital Unite
- Automated field inputs.
- Implemented file upload functionality.
- Asserted the expected success message: "Thank you for your submission!".
#### Report
![task01](https://github.com/user-attachments/assets/e5cfee3f-b040-4f8b-80da-66ce0b8d2b5e)

### 2. Guest Registration Automation for WP Everest
- Automated field inputs for First Name, Last Name, Email, Password, Gender, DOB, Nationality, Phone, Country, and acceptance of Terms & Conditions.
- Asserted successful registration upon submission.
#### Report 
![task02](https://github.com/user-attachments/assets/48cf4447-ab09-4e03-8c92-1b769a444333)

### 3. Web Scraping for DSEBD Stock Prices
- Scraped table data from the provided webpage using Selenium.
- Printed all table cell values in the console.
- Stored the scraped data into a text file for reference. 
#### Report
![task03](https://github.com/user-attachments/assets/519f12f3-d2a3-44fb-964c-99db1f46985c)
#### Text File
![image](https://github.com/user-attachments/assets/32fd153a-9030-42b1-9d88-41fb6305e1c6)




