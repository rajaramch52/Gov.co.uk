@wip
Feature: As a user i want to visit Gov.UK
  So that i can visit the benefit calculators

  Scenario: I am visiting Gov.uk and i need to check benegit calculator
    Given I am on Gov.uk
    When I click Benefits
    And I click Benefits for familes
    And I click Benefits calculators
    Then I should see Benefits calculators page