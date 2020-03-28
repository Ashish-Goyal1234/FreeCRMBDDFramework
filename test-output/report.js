$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Selenium/FreeCRMBDDFramework/src/main/java/Feature/dealsmap.feature");
formatter.feature({
  "line": 1,
  "name": "Deal Data Creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "FreeCRM create a new deal scenario",
  "description": "",
  "id": "deal-data-creation;freecrm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the login page id free crm",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters the username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "batchautomation",
        "Test@12345"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user is on the Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user move to the new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user enters the deal details",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probability",
        "commission"
      ],
      "line": 15
    },
    {
      "cells": [
        "test deal1",
        "1000",
        "50",
        "10"
      ],
      "line": 16
    },
    {
      "cells": [
        "test deal2",
        "2000",
        "60",
        "20"
      ],
      "line": 17
    },
    {
      "cells": [
        "test deal3",
        "3000",
        "70",
        "30"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepwithMapDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 19588018100,
  "status": "passed"
});
formatter.match({
  "location": "DealStepwithMapDefinition.title_of_login_page_is_free_crm()"
});
formatter.result({
  "duration": 136139500,
  "status": "passed"
});
formatter.match({
  "location": "DealStepwithMapDefinition.user_enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 1342221800,
  "status": "passed"
});
formatter.match({
  "location": "DealStepwithMapDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 7834225100,
  "status": "passed"
});
formatter.match({
  "location": "DealStepwithMapDefinition.user_is_on_Home_page()"
});
formatter.result({
  "duration": 103000,
  "status": "passed"
});
formatter.match({
  "location": "DealStepwithMapDefinition.user_move_to_new_contact_page()"
});
formatter.result({
  "duration": 3128934700,
  "status": "passed"
});
formatter.match({
  "location": "DealStepwithMapDefinition.user_enters_deal_details(DataTable)"
});
formatter.result({
  "duration": 12680394700,
  "status": "passed"
});
formatter.match({
  "location": "DealStepwithMapDefinition.close_the_browser()"
});
formatter.result({
  "duration": 1022174900,
  "status": "passed"
});
});