Feature: The Internet
  This feature covers (some) Example pages on 'the-internet.herokuapp.com'

  Background:
    Given the page under test is 'https://the-internet.herokuapp.com'

  @TEST_TI_0001
  Scenario: Homepage has a list of links to Expected examples
    Given I am on the Home Page
    Then the displayed list of examples is as expected


  @TEST_TI_0001
  Scenario: Basic Auth allows validated access
    Given the 'basic_auth' example is opened
    And valid credentials are supplied
    Then Congratulations should be displayed


  @TEST_TI_0001
  Scenario: Sortable Data Tables - Example 1 displays the expected 4 results
    Given the 'tables' example is opened
    When data table example 1 is present
    Then check the table is populated as expected