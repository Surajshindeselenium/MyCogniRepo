$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchCars.feature");
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
  "name": "select model as \"1 Series M\" from the Any Model dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "select location as \"NSW-All\" from the Any location dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "select Price as \"$2,500\" from the Price(max) dropdown",
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
  "name": "page title should be \"Bmw 1 Series M Under 2500 for Sale NSW\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});