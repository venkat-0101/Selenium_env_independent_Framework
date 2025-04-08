Feature: This file contains the scenario to test the basic workflow of the webdriver


  Scenario: To test the launching and closing of a web browser by launching the amazon url

    Given The user launched the webdriver
    Then search the amazon url
    And Close the webdriver session
