$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CarShortListing.feature");
formatter.feature({
  "line": 2,
  "name": "Validate complete Car shortlisting functionality",
  "description": "",
  "id": "validate-complete-car-shortlisting-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Search-Cars"
    }
  ]
});
formatter.before({
  "duration": 4880281600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Validate user able to short car from the home page",
  "description": "",
  "id": "validate-complete-car-shortlisting-functionality;validate-user-able-to-short-car-from-the-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Search-Cars-Positive"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on home page \"https://www.carsguide.com.au/\" of cars guild.com",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks on make dropdown and user selects moke as \"Abarth\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "model dropdown opens and User selects model as \"595C\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify title as \"Abarth 595C Review, For Sale, Price \u0026 Specs | CarsGuide@@\"",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 10,
      "value": "#Abarth 595C Review, For Sale, Price \u0026 Specs | CarsGuide"
    }
  ],
  "line": 11,
  "name": "user selects car as \"2018 Abarth 595C\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on Add to shortlist button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au/",
      "offset": 19
    }
  ],
  "location": "SearchCars.i_am_on_home_page_of_cars_guild_com(String)"
});
formatter.result({
  "duration": 5710812200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Abarth",
      "offset": 55
    }
  ],
  "location": "CarShortListing.user_clicks_on_make_dropdown_and_user_selects_moke_as(String)"
});
formatter.result({
  "duration": 954762800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "595C",
      "offset": 48
    }
  ],
  "location": "CarShortListing.model_dropdown_opens_and_User_selects_model_as(String)"
});
formatter.result({
  "duration": 5754680600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Abarth 595C Review, For Sale, Price \u0026 Specs | CarsGuide@@",
      "offset": 17
    }
  ],
  "location": "CarShortListing.verify_title_as(String)"
});
formatter.result({
  "duration": 91502600,
  "error_message": "java.lang.AssertionError: expected [Abarth 595C Review, For Sale, Price \u0026 Specs | CarsGuide@@] but found [Abarth 595C Review, For Sale, Price \u0026 Specs | CarsGuide]\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:136)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:575)\r\n\tat org.testng.Assert.assertEquals(Assert.java:585)\r\n\tat stepDefinations.CarShortListing.verify_title_as(CarShortListing.java:36)\r\n\tat ✽.And Verify title as \"Abarth 595C Review, For Sale, Price \u0026 Specs | CarsGuide@@\"(CarShortListing.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "2018 Abarth 595C",
      "offset": 21
    }
  ],
  "location": "CarShortListing.user_selects_car_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CarShortListing.user_clicks_on_Add_to_shortlist_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 3527270200,
  "status": "passed"
});
formatter.uri("LogIn.feature");
formatter.feature({
  "line": 2,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LogIn-Negative"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": "verify login functionslity with wrong credentials",
  "description": "",
  "id": "login-feature;verify-login-functionslity-with-wrong-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on home page \"https://www.carsguide.com.au/\" of cars guild.com",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user mousehover SignUp/SignIn",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on Sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User enters \"\u003cuserid\u003e\" email",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User enters \"\u003cpassword\u003e\" password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on Sign in button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Validate login",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "login-feature;verify-login-functionslity-with-wrong-credentials;",
  "rows": [
    {
      "cells": [
        "userid",
        "password"
      ],
      "line": 14,
      "id": "login-feature;verify-login-functionslity-with-wrong-credentials;;1"
    },
    {
      "cells": [
        "suraj@gmail.com",
        "MyPass1"
      ],
      "line": 15,
      "id": "login-feature;verify-login-functionslity-with-wrong-credentials;;2"
    },
    {
      "cells": [
        "Tom@gmail.com",
        "MyPass2"
      ],
      "line": 16,
      "id": "login-feature;verify-login-functionslity-with-wrong-credentials;;3"
    },
    {
      "cells": [
        "Peter@gmail.com",
        "MyPass3"
      ],
      "line": 17,
      "id": "login-feature;verify-login-functionslity-with-wrong-credentials;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3825554600,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "verify login functionslity with wrong credentials",
  "description": "",
  "id": "login-feature;verify-login-functionslity-with-wrong-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@LogIn-Negative"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on home page \"https://www.carsguide.com.au/\" of cars guild.com",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user mousehover SignUp/SignIn",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on Sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User enters \"suraj@gmail.com\" email",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User enters \"MyPass1\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on Sign in button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Validate login",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au/",
      "offset": 19
    }
  ],
  "location": "SearchCars.i_am_on_home_page_of_cars_guild_com(String)"
});
formatter.result({
  "duration": 4933154300,
  "status": "passed"
});
formatter.match({
  "location": "SignInPage.user_mousehover_SignUp_SignIn()"
});
formatter.result({
  "duration": 952600900,
  "status": "passed"
});
formatter.match({
  "location": "SignInPage.click_on_Sign_in()"
});
formatter.result({
  "duration": 3323939900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "suraj@gmail.com",
      "offset": 13
    }
  ],
  "location": "SignInPage.user_enters_email(String)"
});
formatter.result({
  "duration": 846541100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MyPass1",
      "offset": 13
    }
  ],
  "location": "SignInPage.user_enters_password(String)"
});
formatter.result({
  "duration": 105496500,
  "status": "passed"
});
formatter.match({
  "location": "SignInPage.user_clicks_on_Sign_in_button()"
});
formatter.result({
  "duration": 90992700,
  "status": "passed"
});
formatter.match({
  "location": "SignInPage.validate_login()"
});
formatter.result({
  "duration": 624126900,
  "status": "passed"
});
formatter.after({
  "duration": 2249205000,
  "status": "passed"
});
formatter.before({
  "duration": 3752713300,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "verify login functionslity with wrong credentials",
  "description": "",
  "id": "login-feature;verify-login-functionslity-with-wrong-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@LogIn-Negative"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on home page \"https://www.carsguide.com.au/\" of cars guild.com",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user mousehover SignUp/SignIn",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on Sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User enters \"Tom@gmail.com\" email",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User enters \"MyPass2\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on Sign in button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Validate login",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au/",
      "offset": 19
    }
  ],
  "location": "SearchCars.i_am_on_home_page_of_cars_guild_com(String)"
});
formatter.result({
  "duration": 5790893800,
  "status": "passed"
});
formatter.match({
  "location": "SignInPage.user_mousehover_SignUp_SignIn()"
});
formatter.result({
  "duration": 875962500,
  "status": "passed"
});
formatter.match({
  "location": "SignInPage.click_on_Sign_in()"
});
formatter.result({
  "duration": 1907881000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tom@gmail.com",
      "offset": 13
    }
  ],
  "location": "SignInPage.user_enters_email(String)"
});
formatter.result({
  "duration": 1832481000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MyPass2",
      "offset": 13
    }
  ],
  "location": "SignInPage.user_enters_password(String)"
});
formatter.result({
  "duration": 156537900,
  "status": "passed"
});
formatter.match({
  "location": "SignInPage.user_clicks_on_Sign_in_button()"
});
formatter.result({
  "duration": 137602900,
  "status": "passed"
});
formatter.match({
  "location": "SignInPage.validate_login()"
});
formatter.result({
  "duration": 597929900,
  "status": "passed"
});
formatter.after({
  "duration": 2415543100,
  "status": "passed"
});
formatter.before({
  "duration": 3849725900,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "verify login functionslity with wrong credentials",
  "description": "",
  "id": "login-feature;verify-login-functionslity-with-wrong-credentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@LogIn-Negative"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on home page \"https://www.carsguide.com.au/\" of cars guild.com",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user mousehover SignUp/SignIn",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on Sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User enters \"Peter@gmail.com\" email",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User enters \"MyPass3\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on Sign in button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Validate login",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au/",
      "offset": 19
    }
  ],
  "location": "SearchCars.i_am_on_home_page_of_cars_guild_com(String)"
});
formatter.result({
  "duration": 5572181900,
  "status": "passed"
});
formatter.match({
  "location": "SignInPage.user_mousehover_SignUp_SignIn()"
});
formatter.result({
  "duration": 271120100,
  "status": "passed"
});
formatter.match({
  "location": "SignInPage.click_on_Sign_in()"
});
formatter.result({
  "duration": 3774690800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Peter@gmail.com",
      "offset": 13
    }
  ],
  "location": "SignInPage.user_enters_email(String)"
});
formatter.result({
  "duration": 280276700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MyPass3",
      "offset": 13
    }
  ],
  "location": "SignInPage.user_enters_password(String)"
});
formatter.result({
  "duration": 164763300,
  "status": "passed"
});
formatter.match({
  "location": "SignInPage.user_clicks_on_Sign_in_button()"
});
formatter.result({
  "duration": 119488600,
  "status": "passed"
});
formatter.match({
  "location": "SignInPage.validate_login()"
});
formatter.result({
  "duration": 582135900,
  "status": "passed"
});
formatter.after({
  "duration": 2219821100,
  "status": "passed"
});
formatter.uri("SearchCars.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate search car page is working",
  "description": "\nIn order to validate that \nsearch cars page is working \nwe will do acceptance testing",
  "id": "acceptance-testing-to-validate-search-car-page-is-working",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Search-Cars"
    }
  ]
});
formatter.before({
  "duration": 3814590600,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Validate search car page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-car-page-is-working;validate-search-car-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Search-Cars-Positive"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I am on home page \"https://www.carsguide.com.au/\" of cars guild.com",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I move to the menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ],
      "line": 12
    },
    {
      "cells": [
        "buy+sell"
      ],
      "line": 13
    },
    {
      "cells": [
        "reviews"
      ],
      "line": 14
    },
    {
      "cells": [
        "news"
      ],
      "line": 15
    },
    {
      "cells": [
        "advice"
      ],
      "line": 16
    },
    {
      "cells": [
        "pricing+specs"
      ],
      "line": 17
    },
    {
      "cells": [
        "labs"
      ],
      "line": 18
    },
    {
      "cells": [
        "guids"
      ],
      "line": 19
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "click on \"Search Cars\" Search Cars link",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "select carbrand as \"BMW\" from the Any Make dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "select model as \"3\" from the Any Model dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "select location as \"ACT - All\" from the Any location dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "select Price as \"$1,000\" from the Price(max) dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "click on Find_My_Next_Car button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I should see searched cars",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "page title should be \"Bmw 1 Series M Under 1000 for Sale ACT | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au/",
      "offset": 19
    }
  ],
  "location": "SearchCars.i_am_on_home_page_of_cars_guild_com(String)"
});
formatter.result({
  "duration": 5575854100,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.i_move_to_the_menu(String\u003e)"
});
formatter.result({
  "duration": 242069200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search Cars",
      "offset": 10
    }
  ],
  "location": "SearchCars.click_on_Search_Cars_link(String)"
});
formatter.result({
  "duration": 18237748200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 20
    }
  ],
  "location": "SearchCars.select_carbrand_as_from_the_Any_Make_dropdown(String)"
});
formatter.result({
  "duration": 5185199200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 17
    }
  ],
  "location": "SearchCars.select_model_as_from_the_Any_Model_dropdown(int)"
});
formatter.result({
  "duration": 5205273000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ACT - All",
      "offset": 20
    }
  ],
  "location": "SearchCars.select_location_as_from_the_Any_location_dropdown(String)"
});
formatter.result({
  "duration": 134477400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$1,000",
      "offset": 17
    }
  ],
  "location": "SearchCars.select_Price_as_from_the_Price_max_dropdown(String)"
});
formatter.result({
  "duration": 152989800,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.click_on_Find_My_Next_Car_button()"
});
formatter.result({
  "duration": 4401753700,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.i_should_see_searched_cars()"
});
formatter.result({
  "duration": 64600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bmw 1 Series M Under 1000 for Sale ACT | carsguide",
      "offset": 22
    }
  ],
  "location": "SearchCars.page_title_should_be(String)"
});
formatter.result({
  "duration": 50299100,
  "status": "passed"
});
formatter.after({
  "duration": 2406630500,
  "status": "passed"
});
formatter.before({
  "duration": 3774774300,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Validate search only new cars page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-car-page-is-working;validate-search-only-new-cars-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@Search-Cars-Positive"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I am on home page \"https://www.carsguide.com.au/\" of cars guild.com",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I move to the menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ],
      "line": 33
    },
    {
      "cells": [
        "buy+sell"
      ],
      "line": 34
    },
    {
      "cells": [
        "reviews"
      ],
      "line": 35
    },
    {
      "cells": [
        "news"
      ],
      "line": 36
    },
    {
      "cells": [
        "advice"
      ],
      "line": 37
    },
    {
      "cells": [
        "pricing+specs"
      ],
      "line": 38
    },
    {
      "cells": [
        "labs"
      ],
      "line": 39
    },
    {
      "cells": [
        "guids"
      ],
      "line": 40
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "click on \"Search Cars\" Search Cars link",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "click on All New lable",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "select carbrand as \"Audi\" from the Any Make dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "select model as \"3\" from the Any Model dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "select location as \"ACT - All\" from the Any location dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "select Price as \"$90,000\" from the Price(max) dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "click on Find_My_Next_Car button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I should see searched cars",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "page title of new cars search should be \"New Audi A4 Under 90000 for Sale ACT | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au/",
      "offset": 19
    }
  ],
  "location": "SearchCars.i_am_on_home_page_of_cars_guild_com(String)"
});
formatter.result({
  "duration": 5939995200,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.i_move_to_the_menu(String\u003e)"
});
formatter.result({
  "duration": 685045800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search Cars",
      "offset": 10
    }
  ],
  "location": "SearchCars.click_on_Search_Cars_link(String)"
});
formatter.result({
  "duration": 17958435400,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.click_on_All_New_lable()"
});
formatter.result({
  "duration": 124990700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Audi",
      "offset": 20
    }
  ],
  "location": "SearchCars.select_carbrand_as_from_the_Any_Make_dropdown(String)"
});
formatter.result({
  "duration": 5177254700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 17
    }
  ],
  "location": "SearchCars.select_model_as_from_the_Any_Model_dropdown(int)"
});
formatter.result({
  "duration": 5192500000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ACT - All",
      "offset": 20
    }
  ],
  "location": "SearchCars.select_location_as_from_the_Any_location_dropdown(String)"
});
formatter.result({
  "duration": 124516500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$90,000",
      "offset": 17
    }
  ],
  "location": "SearchCars.select_Price_as_from_the_Price_max_dropdown(String)"
});
formatter.result({
  "duration": 186218700,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.click_on_Find_My_Next_Car_button()"
});
formatter.result({
  "duration": 5572575000,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.i_should_see_searched_cars()"
});
formatter.result({
  "duration": 81100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Audi A4 Under 90000 for Sale ACT | carsguide",
      "offset": 41
    }
  ],
  "location": "SearchCars.page_title_of_new_cars_search_should_be(String)"
});
formatter.result({
  "duration": 50754400,
  "status": "passed"
});
formatter.after({
  "duration": 2359430800,
  "status": "passed"
});
});