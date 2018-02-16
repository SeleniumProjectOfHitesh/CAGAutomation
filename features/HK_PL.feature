Feature: Test HK PL monitoring scenario

 # @Firefox
 # Scenario: Test PL result page scenario
 #   Given Open browser and start the application HK PL
 #   When I click on PL button on home page
 #   Then user should be redirected to results page for PL successfully

  @Chrome
  Scenario: Test PL result page scenario
    Given Open browser and start the application HK PL
    When I click on PL button on home page
    Then user should be redirected to results page for PL successfully
    
    
    #@InternetExplorer
    #Scenario: Test PL result page scenario
    #Given Open browser and start the application HK PL
    #When I click on PL button on home page
    #Then user should be redirected to results page for PL successfully
