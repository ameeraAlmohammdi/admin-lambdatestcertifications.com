Test Scenarios

Test Scenario 1: Simple Form Demo
Open LambdaTest’s Selenium Playground.
Click “Simple Form Demo”.
Validate the URL contains “simple-form-demo”.
Enter a string, e.g., “Welcome to LambdaTest” in the "Enter Message" text box.
Click “Get Checked Value”.
Validate the entered message is displayed under the “Your Message:” section.

Test Scenario 2: Drag & Drop Sliders
Open LambdaTest’s Selenium Playground and click “Drag & Drop Sliders”.
Drag the slider “Default value 15” to 95 and validate the value shows 95.

Test Scenario 3: Input Form Submit
Open LambdaTest’s Selenium Playground and click “Input Form Submit”.
Click “Submit” without filling the form and assert the “Please fill out this field” error.
Fill in the required fields, select "United States" from the Country drop-down, and click “Submit”.
Validate the success message: “Thanks for contacting us, we will get back to you shortly.”
Execution

Run the above tests in parallel on at least two different browser/OS combinations (e.g., Windows 10 Chrome and macOS Catalina Safari) on the LambdaTest platform.
Prebuild Setup This project includes a task that runs during the prebuild phase in Gitpod. This task ensures that the necessary Maven profile is installed before running the tests.

AllTest: This task runs the mvn test -PAllTest command, which sets up the environment for the AllTest profile. This profile runs all the test scenarios (Simple Form Demo, Drag & Drop Sliders, and Input Form Submit) in parallel on the LambdaTest Selenium Playground.
