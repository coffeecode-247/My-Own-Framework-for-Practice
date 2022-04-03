#Welcome to All About My Framework.
**_Cy18_Cucumber-Junit_**

####There are Four popular frameworks:
1. DDT Framework
2. Hybrid Testing Framework
3. TDD Framework
4. BDD Framework

---
**DDT Framework**
- Driven by Data.
- Focused on separating the test scripts logic and the test data.
- Allows us to create test automation by passing different sets of test data.
- The test data set is kept in **external files** or resources such as MSExcelSheets, MSAccessTables, SQL Database, XML files, any kind of text editors we can get it.
- Why DDT?
  - Usually you have your data in Excel sheets.
  - Assume you need to run a test with different data.
  - If we run the same test with multiple test data sets manually, it is time-consuming.

![](../../Desktop/forMarkDown.png)
- We adopt DDT Framework when we have to execute the same test with multiple sets of test data.

**Hybrid testing Framework**
- We use the advantage of both keyword and DDT Framework.
- It is what most frameworks evolve/develop into overtime and multiple projects.

**Test Driven Development Framework**
- Also called Bug Free Approach.
- Developers write unit tests before writing functionalities.
- Run the tests -> Tests will fail.
- Write the minimum amount of code required to make the test pass.
- Run the tests again -> tests will pass.
- Optionally refactor your code.
- Repeat from 1.

**MVP: Minimum Viable Product**

**_Project Folder_**
> src
>>main: developers are developing application in this folder.
>>>test: devs write unit tests in this folder.

TDD:
- Before writing any actual code, they write unit tests.
- They then run the project. It will fail._

---

**BDD**:
- Extension of TDD.
- We also write tests first and then add application code.
- Major difference:
  - Tests are written in Gherkin.
  - Tests are explained as behavior of application and are more user focused.
  - Whole team comes together to discuss the feature files.
> Why bother for BDD when you can do TDD??
- [X] Shifting from thinking in "tests" to thinking in "behavior".
- [X] Helps us to approach better from the end user perspective.
- [X] Strong collaboration between business stakeholders, analysts, QA team and developers.
- [X] Extends TDD by utilizing natural language that non-technical stakeholders can understand.

**In BDD Framework, we ALWAYS start with creating feature files.**

---

_Which framework are you currently using and why?_
_What are some advantages of the framework you are using?_

- I'm using BDD. (further answers will be available)
---

##In this sample framework, you will be able to see a demonstration of:

- [X] Each package and how each functions.
- [X] Information about `resources` and where each function within the `features` file is and its roles.

---

1. Each test steps and phrase from the `features` file supposed to have a code that will support each phrase.
2. Those codes will be stored in the `step_definitions` class.
3. Phrase, or each definition snippet, Cucumber will automatically generate at the run time.
4. To generate the step_definitions, we start from the runners class.
5. Take a look at the TestRunner class. By using `features` keyword, we past root content, and with `glue` keyword, we paste source root.
6. `AND` in Gherkin is for tags. It accepts BOTH roles to appear.
---

#####Once the test runs without any specification, we copy the report from the console into the LoginStepDefinition class, and create a desired message for it.
#####Re-run the test, and we will see the result of the test.

---

##*Hooks: what are they*

>It runs before and after every test scenario, regardless of scenario location.
> There are two types of hooks: BEFORE and AFTER.
>>Why do we need them? BECAUSE:
1. BEFORE: we can perform setup, connect to DB, setup webDriver, connect to server.
2. AFTER: close connection, close browser, any cleanup work that can be performed in AFTER hook.
3. In the `Login.feature`, we can create multiple scenarios by using `@scenarios` as a **tag** to run multiple scenarios.
    1. For instance: `@scenario1, @scenario2, @scenario3 etc`
4. In the TestRunner class, we can specify by using **tag** to indicate which scenario we want to run.

##Login Feature: "Background"

- In the *Login.feature* file, we can use `Background` keyword for implementing all the **Given** scenarios.
- While this function applies, each scenario does not require to have `Given` as one of the syntax.
- **Feature, Rule, Example or Scenario, Given, When, Then, And, But, Background, Scenario Outline**, are all Gherkin language.

---

###How to read each data from the data table:

- After having the table in Login.feature class:
  `| License Plate | Driver| Location | Model Year |
  | Test Plate    | SDET  | Washington D.C. | 2020 |`
- In the CreateCarStepDefinition class, in the println, we can use dataTable.get() method, to select index number of the row we want to get the data from.
- `System.out.println("Driver: " + dataTable.get(0).get("Driver"));`

---

##SCENARIO OUTLINE

- Stands for DDT, it allows to run same scenario many times with different sets of data.
- When is it useful:
    - when you have exactly same test steps, but different data inputs among your test casess.
    - Instead of duplicating them, you can create one scenario outline.
---
    
##Hooks:
- Itis a class that is used to create pre and post condition for scenarios and even steps.
- @Before, @After tags coming from **CUCUMBER**, NOT JUnit, that will be applying to each scenario.
- @BeforeStep, @AfterStep tags, whatever we put will be applying to each STEP.
- Created under step_definitions package.

**How the Hooks class is connected to the Feature files?
- Hooks class needs to be created in step_definitions package.
- CukesRunner contains glue="step_definitions path".
- Whenever we create Hooks class with @Before/After tags, it will automatically check the GLUE PATH.
- CukesRunner looks for the GLUE PATH for the Hooks annotations.
- 

###Cucumber Reporting:
- Cucumber has lots of reports, such as:
    - progress
    - pretty
    - html
    - json
    - return
    - junit