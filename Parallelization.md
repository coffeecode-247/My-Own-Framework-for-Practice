###Why do we need parallellization?

- To cut the time
- Cucumber supports parallel testing out of the box after v4.
- Therefore we just need to follow a few steps to be able to achieve parallel testing.
- **Steps for parallel testing:**
  1. Add plugins:
     - maven-surefire-plugin: allows us to run maven lifecycle commands.
     - Maven Life Cycle > compile > test > package > verify > install > deploy
     - maven-cucumber-reporting: uses cucumber json reporting to generate its own report.
  2. Create more runner classes:
     - CukesRunner can only run one threat at a time.
     - So, to be able to open more than one browser at a time, we need to create more runner classes.
     - These runner classes will be targeting different feature files.
     - So they will be running tests in parallel.
  
###Runner Class Configuration:
1. Inside the runner classes, the path to given feature files needs to be different
2. So that they can target different parts of the application.