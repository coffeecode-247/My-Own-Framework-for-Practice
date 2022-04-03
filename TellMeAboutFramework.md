###Tell Me About Your Framework(1):

- [X] I use Java
- [X] Selenium
- [X] Maven -> pom.xml -> dependencies
- [X] POM design pattern
- [X] Cucumber to make our framework BDD(Behavior Driven)
- [X] Gherkin language in feature file.
- [X] Also consists of Data Driven Framework
  - We can read data from configuration.properties
  - We can read data from feature files
  - We can read data from Excel sheets
  - _Answer briefly, not completely, if you can._
  - I use Cucumber to make it BDD, but also it is hybrid, because:
  - I am able to read different types of files and run my tests against different test data.
---

###BDD: two sides of it.
1) Business side: FEATURE FILES.
   1) It is where we write scenarios in GHerkin language.
   2) Given, When, Then, And, But...
   3) Understandable for non-technical members.
   4) Everything runs in the order of the feature files.
2) Implementation side: STEP DEFINITIONS
   1) We create Java classes to implement actual Java+Selenium+Junit code to make it synchronized with browser.
   2) Only for developers, SDET.
   3) Step definitions are just **java methods**.
   4) We should not change anything in signature of the method in step definitions.

---

###Feature: Agile stories, User stories.
- Normally from one agile story, you create many test cases.
- In Feature file: usually that feature is ONE agile story.
  - Then you create different SCENARIOS from that feature file.

***What is a scenario?***
- Each test case we create from a user story.
- We don't call them test cases. We call them "scenarios".

***What are STEPS?***
- Steps are how we create/recreate that scenario.
- Each step is like a re-usable method.
- We write it ONCE. We call it anywhere in any feature file.