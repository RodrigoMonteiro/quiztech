# QuizTech

### Full-stack project that involves developing a quiz application to assess web development skills. The application's front end is built using Angular, while the back end uses Java with Spring.

## Backend setup

Inside the folder backend, find the DemoApplication.java file, run the __method public static void main__ to start the Spring application 
that uses an in-memory H2 database.

## Frontend setup

Navigate through frontend/quiztech folder and run : 
```npm i ```
for installing the frontend dependencies.

## Usage

The landing page shows a short description of the quiz and a button that redirect to the home page.
There are a few options on the home page:
<ul>
  <li> Switch themes: There are in total 6 kinds different of themes (2 about Angular (light and dark), 2 about Vue (light and dark), 
    and 2 about React (light and dark))
  </li>
  <li>How does the quiz work? There is a button that guides the user to all instructions and shows the quiz flow.</li>
  <li>Select the area, tech, and difficulty to be allowed to start the quiz</li>
  <li>After finishing the quiz, it's possible to see your quiz performance (how many questions are correct / how many questions in total) 
  </li>
  <li>Also it is possible to see more details about the quiz  as see the questions,  respective correct alternatives of questions and 
    selected user alternatives</li>
</ul>
At the moment has created all questions of all techs and areas, but just in beginner mode. Soon it will be coming for all the difficulties!


