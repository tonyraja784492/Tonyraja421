$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/amazon.feature");
formatter.feature({
  "name": "Validate the product search in amazon",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch the amazon application url",
  "keyword": "Given "
});
formatter.match({
  "location": "ExecutionClass.user_launch_the_amazon_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify the product search with valid product name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User enter the product in search box",
  "rows": [
    {
      "cells": [
        "product1"
      ]
    },
    {
      "cells": [
        "helicopter"
      ]
    },
    {
      "cells": [
        "aeroplane"
      ]
    },
    {
      "cells": [
        "kids toy"
      ]
    },
    {
      "cells": [
        "Tooth paste"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "ExecutionClass.user_enter_the_product_in_search_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "ExecutionClass.user_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should be navigate into product listing page",
  "keyword": "Then "
});
formatter.match({
  "location": "ExecutionClass.it_should_be_navigate_into_product_listing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "verify the product search with valid product name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User enter the \"\u003cproduct\u003e\" in search box",
  "keyword": "When "
});
formatter.step({
  "name": "User click the search button",
  "keyword": "And "
});
formatter.step({
  "name": "It should be navigate into product listing page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "samsung"
      ]
    },
    {
      "cells": [
        "iphone"
      ]
    },
    {
      "cells": [
        "vivo"
      ]
    },
    {
      "cells": [
        "oppo"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch the amazon application url",
  "keyword": "Given "
});
formatter.match({
  "location": "ExecutionClass.user_launch_the_amazon_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify the product search with valid product name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User enter the \"samsung\" in search box",
  "keyword": "When "
});
formatter.match({
  "location": "ExecutionClass.user_enter_the_in_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "ExecutionClass.user_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should be navigate into product listing page",
  "keyword": "Then "
});
formatter.match({
  "location": "ExecutionClass.it_should_be_navigate_into_product_listing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch the amazon application url",
  "keyword": "Given "
});
formatter.match({
  "location": "ExecutionClass.user_launch_the_amazon_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify the product search with valid product name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User enter the \"iphone\" in search box",
  "keyword": "When "
});
formatter.match({
  "location": "ExecutionClass.user_enter_the_in_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "ExecutionClass.user_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should be navigate into product listing page",
  "keyword": "Then "
});
formatter.match({
  "location": "ExecutionClass.it_should_be_navigate_into_product_listing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch the amazon application url",
  "keyword": "Given "
});
formatter.match({
  "location": "ExecutionClass.user_launch_the_amazon_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify the product search with valid product name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User enter the \"vivo\" in search box",
  "keyword": "When "
});
formatter.match({
  "location": "ExecutionClass.user_enter_the_in_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "ExecutionClass.user_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should be navigate into product listing page",
  "keyword": "Then "
});
formatter.match({
  "location": "ExecutionClass.it_should_be_navigate_into_product_listing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch the amazon application url",
  "keyword": "Given "
});
formatter.match({
  "location": "ExecutionClass.user_launch_the_amazon_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify the product search with valid product name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User enter the \"oppo\" in search box",
  "keyword": "When "
});
formatter.match({
  "location": "ExecutionClass.user_enter_the_in_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "ExecutionClass.user_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should be navigate into product listing page",
  "keyword": "Then "
});
formatter.match({
  "location": "ExecutionClass.it_should_be_navigate_into_product_listing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/snapdeal.feature");
formatter.feature({
  "name": "Validate the product search in snapdeal",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch the snapdeal application url",
  "keyword": "Given "
});
formatter.match({
  "location": "SnapDealExecution.user_launch_the_snapdeal_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify the product search with valid product name in snapdeal",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enter the product in search box in snapdeal",
  "keyword": "When "
});
formatter.match({
  "location": "SnapDealExecution.user_enter_the_product_in_search_box_in_snapdeal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the search button in snapdeal",
  "keyword": "And "
});
formatter.match({
  "location": "SnapDealExecution.user_click_the_search_button_in_snapdeal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should be navigate into product listing page in snapdeal",
  "keyword": "Then "
});
formatter.match({
  "location": "SnapDealExecution.it_should_be_navigate_into_product_listing_page_in_snapdeal()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});