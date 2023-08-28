Feature: Cross-Site Logo Navigation
  As a user visiting the ISAGRI website
  I want to be able to navigate between the main site and the pig management solution by clicking on the logo
  So that I can easily access relevant information without disruption
@ui @wip
  Scenario Outline: Navigating from Main Site to Pig Management Solution
    Given user on the ISAGRI website
    When user hover over the logo WORLDWIDE PIG MANAGEMENT SOLUTION and click
    Then user should be taken to the pig management solution website
    And user should navigate on the Book my Free Demo button and click
    Then user enters lastName "<lastName>"
    And user enters firstName "<firstName>"
    And user enters companyName "<companyName>"
    And user enters email "<email>"
    And user enters phoneNumber "<phone>"
    And user enters country "<country>"
    And user enter how many sows do you have "<count>"
    And user enter message "<message>"
    And user clicks on submit button
    Then user should see "<expectedMessage>" in the webpage

    Examples:
      |lastName|  firstName|companyName|      email          |    phone    |country|   count|     message              |        expectedMessage                      |
      | Mary    |  Wick    |  ABCD     |  mary.wick@gmail.com| 1234567891  |     USA      |   500     |Please, contact to us |  Thanks for submitting this Pig'UP form.     |


##//*[@id="hs_cos_wrapper_module_163880002567897_"]/p[1]