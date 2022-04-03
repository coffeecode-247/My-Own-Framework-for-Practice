### Scenario Outline:

- For each Scenario we want to create with requirements, it is too much in writing.
- In order to minimize hard-coding, we use scenario outline.
- One of the most useful tools.
    - Syntax is: `Scenario Outline:`
    - `When, Then, etc etc`
- For the values that needs to be searched, we use:
    - < > to insert the value. For example:
    - `<searchValue>, <expectedTitle>, <expectedMainHeader>` etc etc...
- Then we need to generate Test data for them:
    - `|searchValue|expectedTitle|`
      `|anyData|anyData|`
    
- Based on the value in any data, we should see:
![](../../../Desktop/scenarioOutline.png)
---