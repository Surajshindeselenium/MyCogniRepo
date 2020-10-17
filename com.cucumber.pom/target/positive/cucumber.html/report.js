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
  "duration": 5990640900,
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
  "duration": 1831571200,
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
  "duration": 681728900,
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
  "duration": 3219751000,
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
  "duration": 32251200,
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
  "duration": 6652777100,
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
  "duration": 5451658300,
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
  "duration": 1164993200,
  "status": "passed"
});
formatter.match({
  "location": "SignInPage.user_mousehover_SignUp_SignIn()"
});
formatter.result({
  "duration": 609729000,
  "status": "passed"
});
formatter.match({
  "location": "SignInPage.click_on_Sign_in()"
});
formatter.result({
  "duration": 415391600,
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
  "duration": 60108178300,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of Proxy element for: DefaultElementLocator \u0027By.xpath: //input[@name\u003d\u0027email\u0027]\u0027 (tried for 20 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:138)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:234)\r\n\tat utility.Waits.sendKeys(Waits.java:14)\r\n\tat pages.actions.SignInPageActions.enterUserId(SignInPageActions.java:24)\r\n\tat stepDefinations.SignInPage.user_enters_email(SignInPage.java:31)\r\n\tat ✽.Then User enters \"suraj@gmail.com\" email(LogIn.feature:8)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@name\u003d\u0027email\u0027]\"}\n  (Session info: chrome\u003d84.0.4147.135)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00274.0.0-alpha-3\u0027, revision: \u00278c567de6dc\u0027\nSystem info: host: \u0027SRKPUN1283LT\u0027, ip: \u0027192.168.1.67\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.135, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: C:\\Users\\SURAJ~1.SHI\\AppDat...}, goog:chromeOptions: {debuggerAddress: localhost:50583}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: e1afd58917a9af04ba057adaa49c3637\n*** Element info: {Using\u003dxpath, value\u003d//input[@name\u003d\u0027email\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:191)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:125)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:576)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:445)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:396)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy23.isDisplayed(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:314)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:43)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:300)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:297)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:211)\r\n\tat utility.Waits.sendKeys(Waits.java:14)\r\n\tat pages.actions.SignInPageActions.enterUserId(SignInPageActions.java:24)\r\n\tat stepDefinations.SignInPage.user_enters_email(SignInPage.java:31)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:133)\r\n\tat org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:584)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:172)\r\n\tat org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)\r\n\tat org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:804)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:145)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.base/java.util.ArrayList.forEach(ArrayList.java:1511)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:770)\r\n\tat org.testng.TestRunner.run(TestRunner.java:591)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:402)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:396)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:355)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:304)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1180)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1102)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1032)\r\n\tat org.testng.TestNG.run(TestNG.java:1000)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "SignInPage.user_clicks_on_Sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignInPage.validate_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2969083699,
  "status": "passed"
});
formatter.before({
  "duration": 5447134200,
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
  "duration": 1202301500,
  "status": "passed"
});
formatter.match({
  "location": "SignInPage.user_mousehover_SignUp_SignIn()"
});
formatter.result({
  "duration": 735713900,
  "status": "passed"
});
formatter.match({
  "location": "SignInPage.click_on_Sign_in()"
});
formatter.result({
  "duration": 437056700,
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
  "duration": 60127016200,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of Proxy element for: DefaultElementLocator \u0027By.xpath: //input[@name\u003d\u0027email\u0027]\u0027 (tried for 20 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:138)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:234)\r\n\tat utility.Waits.sendKeys(Waits.java:14)\r\n\tat pages.actions.SignInPageActions.enterUserId(SignInPageActions.java:24)\r\n\tat stepDefinations.SignInPage.user_enters_email(SignInPage.java:31)\r\n\tat ✽.Then User enters \"Tom@gmail.com\" email(LogIn.feature:8)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@name\u003d\u0027email\u0027]\"}\n  (Session info: chrome\u003d84.0.4147.135)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00274.0.0-alpha-3\u0027, revision: \u00278c567de6dc\u0027\nSystem info: host: \u0027SRKPUN1283LT\u0027, ip: \u0027192.168.1.67\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.135, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: C:\\Users\\SURAJ~1.SHI\\AppDat...}, goog:chromeOptions: {debuggerAddress: localhost:50774}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 1d7fb30bf215c69d08cf9634c13faae4\n*** Element info: {Using\u003dxpath, value\u003d//input[@name\u003d\u0027email\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:191)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:125)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:576)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:445)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:396)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy23.isDisplayed(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:314)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:43)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:300)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:297)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:211)\r\n\tat utility.Waits.sendKeys(Waits.java:14)\r\n\tat pages.actions.SignInPageActions.enterUserId(SignInPageActions.java:24)\r\n\tat stepDefinations.SignInPage.user_enters_email(SignInPage.java:31)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:133)\r\n\tat org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:584)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:172)\r\n\tat org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)\r\n\tat org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:804)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:145)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.base/java.util.ArrayList.forEach(ArrayList.java:1511)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:770)\r\n\tat org.testng.TestRunner.run(TestRunner.java:591)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:402)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:396)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:355)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:304)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1180)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1102)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1032)\r\n\tat org.testng.TestNG.run(TestNG.java:1000)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "SignInPage.user_clicks_on_Sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignInPage.validate_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 3058376200,
  "status": "passed"
});
formatter.before({
  "duration": 5254308000,
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
  "duration": 1192987400,
  "status": "passed"
});
formatter.match({
  "location": "SignInPage.user_mousehover_SignUp_SignIn()"
});
formatter.result({
  "duration": 642003500,
  "status": "passed"
});
formatter.match({
  "location": "SignInPage.click_on_Sign_in()"
});
formatter.result({
  "duration": 410877800,
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
  "duration": 60107540100,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of Proxy element for: DefaultElementLocator \u0027By.xpath: //input[@name\u003d\u0027email\u0027]\u0027 (tried for 20 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:138)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:234)\r\n\tat utility.Waits.sendKeys(Waits.java:14)\r\n\tat pages.actions.SignInPageActions.enterUserId(SignInPageActions.java:24)\r\n\tat stepDefinations.SignInPage.user_enters_email(SignInPage.java:31)\r\n\tat ✽.Then User enters \"Peter@gmail.com\" email(LogIn.feature:8)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@name\u003d\u0027email\u0027]\"}\n  (Session info: chrome\u003d84.0.4147.135)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00274.0.0-alpha-3\u0027, revision: \u00278c567de6dc\u0027\nSystem info: host: \u0027SRKPUN1283LT\u0027, ip: \u0027192.168.1.67\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.135, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: C:\\Users\\SURAJ~1.SHI\\AppDat...}, goog:chromeOptions: {debuggerAddress: localhost:50976}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 925f751dbc0461809e798841be8d5ca5\n*** Element info: {Using\u003dxpath, value\u003d//input[@name\u003d\u0027email\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:191)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:125)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:576)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:445)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:396)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy23.isDisplayed(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:314)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:43)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:300)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:297)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:211)\r\n\tat utility.Waits.sendKeys(Waits.java:14)\r\n\tat pages.actions.SignInPageActions.enterUserId(SignInPageActions.java:24)\r\n\tat stepDefinations.SignInPage.user_enters_email(SignInPage.java:31)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:133)\r\n\tat org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:584)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:172)\r\n\tat org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)\r\n\tat org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:804)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:145)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.base/java.util.ArrayList.forEach(ArrayList.java:1511)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:770)\r\n\tat org.testng.TestRunner.run(TestRunner.java:591)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:402)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:396)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:355)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:304)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1180)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1102)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1032)\r\n\tat org.testng.TestNG.run(TestNG.java:1000)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "SignInPage.user_clicks_on_Sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignInPage.validate_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 3965369400,
  "status": "passed"
});
formatter.uri("SearchCars.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate search car page is working",
  "description": "\r\nIn order to validate that \r\nsearch cars page is working \r\nwe will do acceptance testing",
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
  "duration": 5361966300,
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
  "duration": 1422985000,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.i_move_to_the_menu(String\u003e)"
});
formatter.result({
  "duration": 878944200,
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
  "duration": 779017600,
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
  "duration": 5238603600,
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
  "duration": 5340914200,
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
  "duration": 168265800,
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
  "duration": 118649300,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.click_on_Find_My_Next_Car_button()"
});
formatter.result({
  "duration": 2742842600,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.i_should_see_searched_cars()"
});
formatter.result({
  "duration": 83700,
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
  "duration": 376550300,
  "error_message": "java.lang.AssertionError: expected [Bmw 118d Under 1000 for Sale ACT | carsguide] but found [Bmw 1 Series M Under 1000 for Sale ACT | carsguide]\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:136)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:575)\r\n\tat org.testng.Assert.assertEquals(Assert.java:585)\r\n\tat stepDefinations.SearchCars.page_title_should_be(SearchCars.java:95)\r\n\tat ✽.And page title should be \"Bmw 1 Series M Under 1000 for Sale ACT | carsguide\"(SearchCars.feature:27)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 5363921500,
  "status": "passed"
});
formatter.before({
  "duration": 5292758600,
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
  "duration": 1389730400,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.i_move_to_the_menu(String\u003e)"
});
formatter.result({
  "duration": 736679700,
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
  "duration": 388711500,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.click_on_All_New_lable()"
});
formatter.result({
  "duration": 816750900,
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
  "duration": 5230012800,
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
  "duration": 5300491500,
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
  "duration": 116698100,
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
  "duration": 178761000,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.click_on_Find_My_Next_Car_button()"
});
formatter.result({
  "duration": 3072109300,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.i_should_see_searched_cars()"
});
formatter.result({
  "duration": 83400,
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
  "duration": 342266900,
  "status": "passed"
});
formatter.after({
  "duration": 4790158900,
  "status": "passed"
});
});