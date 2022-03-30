
# The test automation project for https://www.turing.com/
<p align="center">
  <img src="images/screenshot/hostegramDashboard.JPG">
</p>

___
## The project technologies:

<p  align="center" p>

<code>
<img width="5%" title="Java" src="images/logo/Java_icon.png">
<img width="5%" title="Gradle" src="images/logo/Gradle_icon.svg">
<img width="5%" title="IntelliJ IDEA" src="images/logo/Intellij_icon.png">
<img width="5%" title="Selenide" src="images/logo/Selenide_icon.svg">
<img width="5%" title="Selenoid" src="images/logo/Selenoid_icon.svg">
<img width="5%" title="JUnit5" src="images/logo/JUnit5_icon.png">
<img width="5%" title="Github" src="images/logo/Github_icon.png">
<img width="5%" title="Jenkins" src="images/logo/Jenkins_icon.svg">
<img width="5%" title="Allure Report" src="images/logo/Allure_Report_icon.svg">
<img width="5%" title="Allure TestOps" src="images/logo/Allure_TestOps_icon.svg">
<img width="5%" title="Telegram" src="images/logo/Telegram_icon.png">
<img width="5%" title="Jira" src="images/logo/Jira_icon.png">
</code>
</p>

___

### Run tests with filled remote properties:

```bash
gradle clean test
```

### Run tests without filled remote properties:

```bash
gradle clean test
-Denvironment=${ENVIRONMENT}
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
```

### Serve report:

```bash
allure serve build/allure-results
```

___

## Results

The test results can be found in:
+ [Jenkins](#jenkins)
+ [Allure Report](#allure-report)
+ [Allure TestOps](#allure-testOps)


### Jenkins

[Jenkins job](https://jenkins.autotests.cloud/job/009-nightCoffe-webProject/)

<p align="center">
  <img src="images/screenshot/jenkinsScreen.JPG">
</p>

<p align="center">
  <img src="images/screenshot/jenkinsScreen1.JPG">
</p>

### Allure Report


:arrow_right: [The launch with results](https://jenkins.autotests.cloud/job/009-nightCoffe-webProject/11/allure/)

<p align="center">
  <img src="images/screenshot/allureReport.JPG">
</p>

:arrow_right: [The launch with results](https://jenkins.autotests.cloud/job/009-nightCoffe-webProject/11/allure/#suites/44d1a197fbb6ad9fc22df4eb54d1e2ac/6b659ccc126834be/)

<p align="center">
  <img src="images/screenshot/allureReport1.JPG">
</p>

### Allure TestOps

<p align="center">
  <img src="images/screenshot/allureTestOps2.JPG">
</p>

<p align="center">
  <img src="images/screenshot/allureTestOps.JPG">
</p>

<p align="center">
  <img src="images/screenshot/allureTestOps1.JPG">
</p>

___

## Video with test running in Allure Report

Video the test run in Allure report.

<p align="center">
  <img src="images/video/hostegram.gif">
</p>

___

## Notifications in Telegram channel

<p align="center">
  <img src="images/screens/Telegram_failed_notification.PNG">
</p>

<p align="center">
  <img src="images/screenshot/telegramNotification.JPG">
</p>


___
