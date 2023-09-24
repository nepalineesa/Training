Feature:Login Functionality Check
  Scenario:Login with Correct Username and Correct Password
    Given Facebook Application should open
    When User send username in userbox
    When User send password in passwordbox
    When User click on login button
    Then User login to the Facebook

