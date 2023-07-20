
Feature: Cucumber Project CW 


  Scenario: Testing an e commerce application , Navigating to Mobile App , select and checkout 
    Given Opening browser
    And Enter username
    And Enter password
    When Click capcha
    And Click login
    Then Click servicetab
    And Click order new service
    And Click mobile category
    And Select mobile application
    Then Add to cart and continue
    And Validate product is added
    Then Click checkout
    And Click complete order
    And Get invoice number and print
    Then Close browser
    
    
    


