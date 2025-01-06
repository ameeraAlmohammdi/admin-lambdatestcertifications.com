# Test Scenarios

## Test Scenario 1: Simple Form Demo
1. Open [LambdaTest’s Selenium Playground](https://www.lambdatest.com/selenium-playground).
2. Click “Simple Form Demo”.
3. Validate the URL contains “simple-form-demo”.
4. Enter a string, e.g., “Welcome to LambdaTest” in the "Enter Message" text box.
5. Click “Get Checked Value”.
6. Validate the entered message is displayed under the “Your Message:” section.

## Test Scenario 2: Drag & Drop Sliders
1. Open [LambdaTest’s Selenium Playground](https://www.lambdatest.com/selenium-playground) and click “Drag & Drop Sliders”.
2. Drag the slider “Default value 15” to 95 and validate the value shows 95.

## Test Scenario 3: Input Form Submit
1. Open [LambdaTest’s Selenium Playground](https://www.lambdatest.com/selenium-playground) and click “Input Form Submit”.
2. Click “Submit” without filling the form and assert the “Please fill out this field” error.
3. Fill in the required fields, select "United States" from the Country drop-down, and click “Submit”.
4. Validate the success message: “Thanks for contacting us, we will get back to you shortly.”

# Execution

Run the above tests in parallel on at least two different browser/OS combinations (e.g., Windows 10 Chrome and macOS Catalina Safari) on the LambdaTest platform.

# Prebuild Setup

This project includes a task that runs during the prebuild phase in Gitpod. These tasks ensure that the necessary Maven profile is installed before running the tests.

- **AllTest**: This task runs the `mvn test -PAllTest` command, which sets up the environment for the `AllTest` profile. This profile runs all the test scenarios (Simple Form Demo, Drag & Drop Sliders, and Input Form Submit) in parallel on the LambdaTest Selenium Playground.
