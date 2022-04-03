###Parameterization

- Cucumber parameterization is being able to pass test data from feature files.
- Allows us to pass test data and run our scenarios on different data sets without having to go into code and change anything.

- **HOW DO WE ESTABLISH PARAMETERIZATION?**

> I want to be able to pass data in feature file.
> Therefore, in the `Search.feature` file, we can simply put "" for the value.
>>_in this case, the value is apple._

> Then, when we pass the step_definition methods, the WHEN and THEN field will be:
>> `@When("User searches {string}")`, rather than `@When("User searches apple")`

>The parameter will also include String arguments for each step definition as well.
---

