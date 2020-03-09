Feature: PharmacyLookup search verify Compound

    Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   | |
      | password | |
      | region   | |

  @Functional
  Scenario Outline: Pharmacy Lookup search with valid data
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then User search for existing pharmacy by entering details in Pharmacy Lookup
      | PharmacyNPI | <PharmacyNPI> |
      | RxNumber    | <RxNumber>    |
    Then Member details should be displayed
      | MemberID    | <MemberID>    |
      | DateOfBirth | <DateOfBirth> |
      | MemberName  | <MemberName>  |
      | Error       | <Error>       |
      | Date        | <Date>        |
      | Time        | <Time>        |
      | CICSStatus  | <CICSStatus>  |
      | CustID      | <CustID>      |
      | ClientID    | <ClientID>    |
      | Group       | <Group>       |

    Examples: 
      | ApplicationMenu               | PharmacyNPI | RxNumber     | MemberID              | DateOfBirth              | MemberName                       | Error  | Date            | Time          | CICSStatus      | CustID                   | ClientID                                          | Group                                    |
      | Miscellaneous->RxNova Connect |  1710927462 | 120005552999 | Member ID^90413000100 | Date of Birth^01/01/1940 | Member Name^MBRNONBRIDGECUST RWT | Error^ | Date^07/30/2020| Time^14:46:03 | CICS Status^PWE | Cust ID^319 - 0319HUMANA | Client ID^9007 - NBRG--CLNT1 - NONBRG CLIENT--PDP | Group^2 - RWNBRG REGR2 DONT USE REWORK10 |

  @Functional
  Scenario Outline: Verify Header details
    Given User in Pharmacy Lookup Search Page and click on Blue arrow at MemberID Field
    Then User verifies the header details
      | CustomerSet | <CustomerSet> |
      | Customer    | <Customer>    |
      | Client      | <Client>      |
      | Group       | <Group>       |
      | Gender      | <Gender>      |
      | MemberID    | <MemberID>    |
      | AltMemberID | <AltMemberID> |
      | FirstName   | <FirstName>   |
      | LastName    | <LastName>    |
      | DOB         | <DOB>         |

    Examples: 
      | CustomerSet          | Customer                    | Client                     | Group                                 | Gender    | MemberID                      | AltMemberID                       | FirstName         | LastName                    | DOB             |
      | Customer Set:^Humana | Customer:^0319 - 0319HUMANA | Client:^9007 - NBRG--CLNT1 | Group:^RWNBRG REGR2 DONT USE REWORK10 | Gender:^F | Member ID:^000000090413000100 | Alt Member ID:^000000090413000100 | First Name:^RWTC4 | Last Name:^MBRNONBRIDGECUST | DOB:^01/01/1940 |
       
  @Functional
  Scenario Outline: Verify Compound
    Given User in Pharmacy Lookup details page
    Then User click on Compound in Claim screen
    Then User verifies Compound    
    	| CompoundCode                        | <CompoundCode>                        |         
      | DispensingUnitFormIndicator         | <DispensingUnitFormIndicator>         |
      | DosageFormDescriptionCode           | <DosageFormDescriptionCode>           |
      | CompoundProductID                   | <CompoundProductID>                   |
      | ProductIDQualifier                  | <ProductIDQualifier>                  | 
      | CompoundIngredientQTY               | <CompoundIngredientQTY>               |
      | SubmittedCompoundIngredientDrugCost | <SubmittedCompoundIngredientDrugCost> |
      | PlanCompoundIngredientDrugCost      | <PlanCompoundIngredientDrugCost>      |
      | CompoundIngreBasisCostDetermination | <CompoundIngreBasisCostDetermination> |
      | PostPay3Indicator                   | <PostPay3Indicator>                   |
      | PostPay4Indicator                   | <PostPay4Indicator>                   |
                   
    Examples: 
       | CompoundCode    | DispensingUnitFormIndicator      | DosageFormDescriptionCode     | CompoundProductID     | ProductIDQualifier    | CompoundIngredientQTY    | SubmittedCompoundIngredientDrugCost      | PlanCompoundIngredientDrugCost      | CompoundIngreBasisCostDetermination           | PostPay3Indicator     | PostPay4Indicator     |                     
	     | Compound Code^1 | Dispensing Unit Form Indicator^0 | Dosage Form Description Code^ | Compound Product ID^  | Product ID Qualifier^ | Compound Ingredient QTY^ | Submitted Compound Ingredient Drug Cost^ | Plan Compound Ingredient Drug Cost^ | Compound Ingredient Basis Cost Determination^ | Post Pay 3 Indicator^ | Post Pay 4 Indicator^ |
  
  
  
  
  
  
  
  
  
  
   