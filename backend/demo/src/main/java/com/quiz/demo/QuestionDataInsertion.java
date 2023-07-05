package com.quiz.demo;

import com.quiz.demo.model.Question;
import com.quiz.demo.repository.QuestionRepository;

public class QuestionDataInsertion {

  private QuestionDataInsertion() {
  }

  public static void insertEasyQuestions(QuestionRepository questionRepository) {

    Question q1 = new Question();
    q1.setText("What is Angular?");
    q1.setArea("Front-end");
    q1.setSubject("Angular");
    q1.setDifficult("Beginner");
    q1.setAnswer("Angular is a popular front-end framework developed by Google for building web applications.");
    q1.setAlternatives(new String[] {
        "Angular is a programming language used for web development.",
        "Angular is a database management system.",
        "Angular is a styling framework for web pages.",
        "Angular is a server-side scripting language.",
        "Angular is a popular front-end framework developed by Google for building web applications."
    });

    questionRepository.save(q1);

    Question q2 = new Question();
    q2.setText("What is a component in Angular?");
    q2.setArea("Front-end");
    q2.setSubject("Angular");
    q2.setDifficult("Beginner");
    q2.setAnswer(
        "A component is a building block of an Angular application that consists of HTML template, TypeScript code, and CSS styles.");
    q2.setAlternatives(new String[] {
        "A component is a type of Angular directive.",
        "A component is a database table in Angular.",
        "A component is a data structure used for storing variables in Angular.",
        "A component is a styling framework in Angular.",
        "A component is a building block of an Angular application that consists of HTML template, TypeScript code, and CSS styles."
    });

    questionRepository.save(q2);

    Question q3 = new Question();
    q3.setText("What is the purpose of ngFor directive in Angular?");
    q3.setArea("Front-end");
    q3.setSubject("Angular");
    q3.setDifficult("Beginner");
    q3.setAnswer("The ngFor directive is used for rendering a list of items in Angular.");
    q3.setAlternatives(new String[] {
        "The ngFor directive is used for handling form validations in Angular.",
        "The ngFor directive is used for defining routes in Angular.",
        "The ngFor directive is used for performing data binding in Angular.",
        "The ngFor directive is used for rendering a list of items in Angular.",
        "The ngFor directive is used for manipulating the DOM in Angular."
    });

    questionRepository.save(q3);

    Question q4 = new Question();
    q4.setText("What is the purpose of ngOnInit lifecycle hook in Angular?");
    q4.setArea("Front-end");
    q4.setSubject("Angular");
    q4.setDifficult("Beginner");
    q4.setAnswer(
        "The ngOnInit lifecycle hook is used for initializing component properties and making API calls in Angular.");
    q4.setAlternatives(new String[] {
        "The ngOnInit lifecycle hook is used for handling user input events in Angular.",
        "The ngOnInit lifecycle hook is used for defining CSS styles in Angular.",
        "The ngOnInit lifecycle hook is used for managing component routing in Angular.",
        "The ngOnInit lifecycle hook is used for initializing component properties and making API calls in Angular.",
        "The ngOnInit lifecycle hook is used for injecting services in Angular."
    });
    questionRepository.save(q4);

    Question q5 = new Question();
    q5.setText("What is the purpose of ViewChild decorator in Angular?");
    q5.setArea("Front-end");
    q5.setSubject("Angular");
    q5.setDifficult("Beginner");
    q5.setAnswer("The ViewChild decorator is used for accessing child components or elements in Angular.");
    q5.setAlternatives(new String[] {
        "The ViewChild decorator is used for defining component templates in Angular.",
        "The ViewChild decorator is used for handling form submissions in Angular.",
        "The ViewChild decorator is used for managing component communication in Angular.",
        "The ViewChild decorator is used for accessing child components or elements in Angular.",
        "The ViewChild decorator is used for animating elements in Angular."
    });
    questionRepository.save(q5);

    Question q6 = new Question();
    q6.setText("What is the purpose of ngStyle directive in Angular?");
    q6.setArea("Front-end");
    q6.setSubject("Angular");
    q6.setDifficult("Beginner");
    q6.setAnswer("The ngStyle directive is used for dynamically applying CSS styles to elements in Angular.");
    q6.setAlternatives(new String[] {
        "The ngStyle directive is used for handling HTTP requests in Angular.",
        "The ngStyle directive is used for managing component routing in Angular.",
        "The ngStyle directive is used for defining routes in Angular.",
        "The ngStyle directive is used for dynamically applying CSS styles to elements in Angular.",
        "The ngStyle directive is used for validating form inputs in Angular."
    });

    questionRepository.save(q6);

    Question q7 = new Question();
    q7.setText("What is the purpose of ngIf directive in Angular?");
    q7.setArea("Front-end");
    q7.setSubject("Angular");
    q7.setDifficult("Beginner");
    q7.setAnswer("The ngIf directive is used for conditionally rendering elements in Angular.");
    q7.setAlternatives(new String[] {
        "The ngIf directive is used for handling user authentication in Angular.",
        "The ngIf directive is used for managing component state in Angular.",
        "The ngIf directive is used for defining CSS styles in Angular.",
        "The ngIf directive is used for conditionally rendering elements in Angular.",
        "The ngIf directive is used for manipulating the DOM in Angular."
    });
    questionRepository.save(q7);

    Question q8 = new Question();
    q8.setText("What is the purpose of FormsModule in Angular?");
    q8.setArea("Front-end");
    q8.setSubject("Angular");
    q8.setDifficult("Beginner");
    q8.setAnswer("FormsModule is used for implementing two-way data binding in Angular.");
    q8.setAlternatives(new String[] {
        "FormsModule is used for handling HTTP requests in Angular.",
        "FormsModule is used for defining component templates in Angular.",
        "FormsModule is used for managing component routing in Angular.",
        "FormsModule is used for implementing two-way data binding in Angular.",
        "FormsModule is used for animating elements in Angular."
    });
    questionRepository.save(q8);

    Question q9 = new Question();
    q9.setText("What is the purpose of ngModel directive in Angular?");
    q9.setArea("Front-end");
    q9.setSubject("Angular");
    q9.setDifficult("Beginner");
    q9.setAnswer("The ngModel directive is used for two-way data binding in Angular.");
    q9.setAlternatives(new String[] {
        "The ngModel directive is used for handling user input events in Angular.",
        "The ngModel directive is used for managing component communication in Angular.",
        "The ngModel directive is used for defining CSS styles in Angular.",
        "The ngModel directive is used for two-way data binding in Angular.",
        "The ngModel directive is used for validating form inputs in Angular."
    });
    questionRepository.save(q9);

    Question q10 = new Question();
    q10.setText("What is the purpose of RouterModule in Angular?");
    q10.setArea("Front-end");
    q10.setSubject("Angular");
    q10.setDifficult("Beginner");
    q10.setAnswer("RouterModule is used for managing routing and navigation in Angular applications.");
    q10.setAlternatives(new String[] {
        "RouterModule is used for handling form validations in Angular.",
        "RouterModule is used for defining CSS styles in Angular.",
        "RouterModule is used for performing data binding in Angular.",
        "RouterModule is used for managing routing and navigation in Angular applications.",
        "RouterModule is used for injecting services in Angular."
    });
    questionRepository.save(q10);

    Question q11 = new Question();
    q11.setText("What is React?");
    q11.setArea("Front-end");
    q11.setSubject("React");
    q11.setDifficult("Beginner");
    q11.setAnswer("React is a JavaScript library used for building user interfaces.");
    q11.setAlternatives(new String[] {
        "React is a programming language.",
        "React is a database management system.",
        "React is a server-side framework.",
        "React is a markup language.",
        "React is a JavaScript library used for building user interfaces."
    });
    questionRepository.save(q11);

    Question q12 = new Question();
    q12.setText("What are components in React?");
    q12.setArea("Front-end");
    q12.setSubject("React");
    q12.setDifficult("Beginner");
    q12.setAnswer("Components are reusable building blocks in React that encapsulate logic and UI.");
    q12.setAlternatives(new String[] {
        "Components are CSS styles in React.",
        "Components are database tables in React.",
        "Components are programming languages in React.",
        "Components are reusable building blocks in React that encapsulate logic and UI.",
        "Components are JavaScript libraries in React."
    });
    questionRepository.save(q12);

    Question q13 = new Question();
    q13.setText("What is JSX in React?");
    q13.setArea("Front-end");
    q13.setSubject("React");
    q13.setDifficult("Beginner");
    q13.setAnswer("JSX is a syntax extension for JavaScript that allows you to write HTML-like code in React.");
    q13.setAlternatives(new String[] {
        "JSX is a state management library in React.",
        "JSX is a programming language in React.",
        "JSX is a CSS framework in React.",
        "JSX is a syntax extension for JavaScript that allows you to write HTML-like code in React.",
        "JSX is a database management system in React."
    });
    questionRepository.save(q13);

    Question q14 = new Question();
    q14.setText("What is the virtual DOM in React?");
    q14.setArea("Front-end");
    q14.setSubject("React");
    q14.setDifficult("Beginner");
    q14.setAnswer(
        "The virtual DOM is a lightweight representation of the actual DOM in React that helps improve performance.");
    q14.setAlternatives(new String[] {
        "The virtual DOM is a programming language in React.",
        "The virtual DOM is a database management system in React.",
        "The virtual DOM is a state management library in React.",
        "The virtual DOM is a lightweight representation of the actual DOM in React that helps improve performance.",
        "The virtual DOM is a CSS framework in React."
    });
    questionRepository.save(q14);

    Question q15 = new Question();
    q15.setText("What is state in React?");
    q15.setArea("Front-end");
    q15.setSubject("React");
    q15.setDifficult("Beginner");
    q15.setAnswer("State is an object that stores data and determines the behavior of a React component.");
    q15.setAlternatives(new String[] {
        "State is a programming language in React.",
        "State is a database management system in React.",
        "State is a CSS framework in React.",
        "State is an object that stores data and determines the behavior of a React component.",
        "State is a state management library in React."
    });
    questionRepository.save(q15);

    Question q16 = new Question();
    q16.setText("What is props in React?");
    q16

        .setArea("Front-end");
    q16.setSubject("React");
    q16.setDifficult("Beginner");
    q16.setAnswer("Props are read-only inputs passed to a React component to customize its behavior.");
    q16.setAlternatives(new String[] {
        "Props are CSS styles in React.",
        "Props are database tables in React.",
        "Props are programming languages in React.",
        "Props are read-only inputs passed to a React component to customize its behavior.",
        "Props are JavaScript libraries in React."
    });
    questionRepository.save(q16);

    Question q17 = new Question();
    q17.setText("What is the purpose of the render() method in React components?");
    q17.setArea("Front-end");
    q17.setSubject("React");
    q17.setDifficult("Beginner");
    q17.setAnswer("The render() method returns the JSX that represents the component's UI.");
    q17.setAlternatives(new String[] {
        "The render() method is used for handling form submissions in React.",
        "The render() method is used for managing component communication in React.",
        "The render() method is used for defining component templates in React.",
        "The render() method returns the JSX that represents the component's UI.",
        "The render() method is used for animating elements in React."
    });
    questionRepository.save(q17);

    Question q18 = new Question();
    q18.setText("What is the useState() hook in React?");
    q18.setArea("Front-end");
    q18.setSubject("React");
    q18.setDifficult("Beginner");
    q18.setAnswer("The useState() hook is used to add state to functional components in React.");
    q18.setAlternatives(new String[] {
        "The useState() hook is used for handling form submissions in React.",
        "The useState() hook is used for managing component communication in React.",
        "The useState() hook is used for defining component templates in React.",
        "The useState() hook is used to add state to functional components in React.",
        "The useState() hook is used for animating elements in React."
    });
    questionRepository.save(q18);

    Question q19 = new Question();
    q19.setText("What is the useEffect() hook in React?");
    q19.setArea("Front-end");
    q19.setSubject("React");
    q19.setDifficult("Beginner");
    q19.setAnswer(
        "The useEffect() hook is used to perform side effects in React, such as data fetching or subscribing to events.");
    q19.setAlternatives(new String[] {
        "The useEffect() hook is used for handling form submissions in React.",
        "The useEffect() hook is used for managing component communication in React.",
        "The useEffect() hook is used for defining component templates in React.",
        "The useEffect() hook is used to perform side effects in React, such as data fetching or subscribing to events.",
        "The useEffect() hook is used for animating elements in React."
    });
    questionRepository.save(q19);

    Question q20 = new Question();
    q20.setText("What is the purpose of the key prop in React?");
    q20.setArea("Front-end");
    q20.setSubject("React");
    q20.setDifficult("Beginner");
    q20.setAnswer(
        "The key prop is used to provide a unique identifier to dynamically created components in a list.");
    q20.setAlternatives(new String[] {
        "The key prop is used for handling form submissions in React.",
        "The key prop is used for managing component communication in React.",
        "The key prop is used for defining component templates in React.",
        "The key prop is used to provide a unique identifier to dynamically created components in a list.",
        "The key prop is used for animating elements in React."
    });
    questionRepository.save(q20);

    Question q21 = new Question();
    q21.setText("What is Vue?");
    q21.setArea("Front-end");
    q21.setSubject("Vue");
    q21.setDifficult("Beginner");
    q21.setAnswer("Vue is a progressive JavaScript framework for building user interfaces.");
    q21.setAlternatives(new String[] {
        "Vue is a programming language.",
        "Vue is a database management system.",
        "Vue is a server-side framework.",
        "Vue is a markup language.",
        "Vue is a progressive JavaScript framework for building user interfaces."
    });
    questionRepository.save(q21);

    Question q22 = new Question();
    q22.setText("What is a component in Vue?");
    q22.setArea("Front-end");
    q22.setSubject("Vue");
    q22.setDifficult("Beginner");
    q22.setAnswer("A component in Vue is a reusable building block that encapsulates logic and UI.");
    q22.setAlternatives(new String[] {
        "A component in Vue is a CSS framework.",
        "A component in Vue is a database table.",
        "A component in Vue is a programming language.",
        "A component in Vue is a reusable building block that encapsulates logic and UI.",
        "A component in Vue is a JavaScript library."
    });
    questionRepository.save(q22);

    Question q23 = new Question();
    q23.setText("What is the v-bind directive used for in Vue?");
    q23.setArea("Front-end");
    q23.setSubject("Vue");
    q23.setDifficult("Beginner");
    q23.setAnswer(
        "The v-bind directive is used to dynamically bind an attribute or a prop to an expression in Vue.");
    q23.setAlternatives(new String[] {
        "The v-bind directive is used for handling form submissions in Vue.",
        "The v-bind directive is used for managing component communication in Vue.",
        "The v-bind directive is used for defining component templates in Vue.",
        "The v-bind directive is used to conditionally render elements in Vue.",
        "The v-bind directive is used to dynamically bind an attribute or a prop to an expression in Vue."
    });
    questionRepository.save(q23);

    Question q24 = new Question();
    q24.setText("What is the v-model directive used for in Vue?");
    q24.setArea("Front-end");
    q24.setSubject("Vue");
    q24.setDifficult("Beginner");
    q24.setAnswer(
        "The v-model directive is used for two-way data binding between form inputs and Vue component data.");
    q24.setAlternatives(new String[] {
        "The v-model directive is used for handling form submissions in Vue.",
        "The v-model directive is used for managing component communication in Vue.",
        "The v-model directive is used for defining component templates in Vue.",
        "The v-model directive is used for conditionally rendering elements in Vue.",
        "The v-model directive is used for two-way data binding between form inputs and Vue component data."
    });
    questionRepository.save(q24);

    Question q25 = new Question();
    q25.setText("What is the Vue CLI?");
    q25.setArea("Front-end");
    q25.setSubject("Vue");
    q25.setDifficult("Beginner");
    q25.setAnswer("The Vue CLI is a command-line tool used for scaffolding and managing Vue.js projects.");
    q25.setAlternatives(new String[] {
        "The Vue CLI is a programming language.",
        "The Vue CLI is a database management system.",
        "The Vue CLI is a server-side framework.",
        "The Vue CLI is a CSS framework.",
        "The Vue CLI is a command-line tool used for scaffolding and managing Vue.js projects."
    });
    questionRepository.save(q25);

    Question q26 = new Question();
    q26.setText("What is the computed property in Vue?");
    q26.setArea("Front-end");
    q26.setSubject("Vue");
    q26.setDifficult("Beginner");
    q26.setAnswer(
        "A computed property in Vue is a property that is derived from the component's data and automatically updates when its dependencies change.");
    q26.setAlternatives(new String[] {
        "A computed property in Vue is a CSS style.",
        "A computed property in Vue is a database table.",
        "A computed property in Vue is a programming language.",
        "A computed property in Vue is a property that is derived from the component's data and automatically updates when its dependencies change.",
        "A computed property in Vue is a JavaScript library."
    });
    questionRepository.save(q26);

    Question q27 = new Question();
    q27.setText("What is the v-if directive used for in Vue?");
    q27.setArea("Front-end");
    q27.setSubject("Vue");
    q27.setDifficult("Beginner");
    q27.setAnswer("The v-if directive is used to conditionally render elements in Vue based on a condition.");
    q27.setAlternatives(new String[] {
        "The v-if directive is used for handling form submissions in Vue.",
        "The v-if directive is used for managing component communication in Vue.",
        "The v-if directive is used for defining component templates in Vue.",
        "The v-if directive is used to conditionally render elements in Vue based on a condition.",
        "The v-if directive is used to dynamically bind an attribute or a prop to an expression in Vue."
    });
    questionRepository.save(q27);

    Question q28 = new Question();
    q28.setText("What is the v-for directive used for in Vue?");
    q28.setArea("Front-end");
    q28.setSubject("Vue");
    q28.setDifficult("Beginner");
    q28.setAnswer("The v-for directive is used to render a list of items based on an array or an object in Vue.");
    q28.setAlternatives(new String[] {
        "The v-for directive is used for handling form submissions in Vue.",
        "The v-for directive is used for managing component communication in Vue.",
        "The v-for directive is used for defining component templates in Vue.",
        "The v-for directive is used to conditionally render elements in Vue.",
        "The v-for directive is used to render a list of items based on an array or an object in Vue."
    });
    questionRepository.save(q28);

    Question q29 = new Question();
    q29.setText("What is the Vue Router?");
    q29.setArea("Front-end");
    q29.setSubject("Vue");
    q29.setDifficult("Beginner");
    q29.setAnswer(
        "The Vue Router is a routing library for Vue.js that allows you to create single-page applications with client-side navigation.");
    q29.setAlternatives(new String[] {
        "The Vue Router is a programming language.",
        "The Vue Router is a database management system.",
        "The Vue Router is a server-side framework.",
        "The Vue Router is a CSS framework.",
        "The Vue Router is a routing library for Vue.js that allows you to create single-page applications with client-side navigation."
    });
    questionRepository.save(q29);

    Question q30 = new Question();
    q30.setText("What is the Vue Devtools?");
    q30.setArea("Front-end");
    q30.setSubject("Vue");
    q30.setDifficult("Beginner");
    q30.setAnswer(
        "The Vue Devtools is a browser extension that provides advanced debugging and inspection capabilities for Vue.js applications.");
    q30.setAlternatives(new String[] {
        "The Vue Devtools is a programming language.",
        "The Vue Devtools is a database management system.",
        "The Vue Devtools is a server-side framework.",
        "The Vue Devtools is a CSS framework.",
        "The Vue Devtools is a browser extension that provides advanced debugging and inspection capabilities for Vue.js applications."
    });
    questionRepository.save(q30);

    Question q31 = new Question();
    q31.setText("What is PHP?");
    q31.setArea("Back-end");
    q31.setSubject("PHP");
    q31.setDifficult("Beginner");
    q31.setAnswer("PHP is a server-side scripting language designed for web development.");
    q31.setAlternatives(new String[] {
        "PHP is a programming language for mobile app development.",
        "PHP is a database management system.",
        "PHP is a front-end framework.",
        "PHP is a markup language.",
        "PHP is a server-side scripting language designed for web development."
    });
    questionRepository.save(q31);

    Question q32 = new Question();
    q32.setText("What is a variable in PHP?");
    q32.setArea("Back-end");
    q32.setSubject("PHP");
    q32.setDifficult("Beginner");
    q32.setAnswer("A variable in PHP is used to store data or values.");
    q32.setAlternatives(new String[] {
        "A variable in PHP is a CSS style.",
        "A variable in PHP is a database table.",
        "A variable in PHP is a programming language.",
        "A variable in PHP is used to store data or values.",
        "A variable in PHP is a JavaScript library."
    });
    questionRepository.save(q32);

    Question q33 = new Question();
    q33.setText("What is the echo statement used for in PHP?");
    q33.setArea("Back-end");
    q33.setSubject("PHP");
    q33.setDifficult("Beginner");
    q33.setAnswer("The echo statement is used to output data or content to the browser in PHP.");
    q33.setAlternatives(new String[] {
        "The echo statement is used for handling form submissions in PHP.",
        "The echo statement is used for managing database connections in PHP.",
        "The echo statement is used for defining functions in PHP.",
        "The echo statement is used to conditionally render elements in PHP.",
        "The echo statement is used to output data or content to the browser in PHP."
    });
    questionRepository.save(q33);

    Question q34 = new Question();
    q34.setText("What is an array in PHP?");
    q34.setArea("Back-end");
    q34.setSubject("PHP");
    q34.setDifficult("Beginner");
    q34.setAnswer("An array in PHP is a data structure that stores multiple values in a single variable.");
    q34.setAlternatives(new String[] {
        "An array in PHP is a CSS style.",
        "An array in PHP is a database table.",
        "An array in PHP is a programming language.",
        "An array in PHP is a data structure that stores multiple values in a single variable.",
        "An array in PHP is a JavaScript library."
    });
    questionRepository.save(q34);

    Question q35 = new Question();
    q35.setText("What is a function in PHP?");
    q35.setArea("Back-end");
    q35.setSubject("PHP");
    q35.setDifficult("Beginner");
    q35.setAnswer("A function in PHP is a block of reusable code that performs a specific task.");
    q35.setAlternatives(new String[] {
        "A function in PHP is a CSS style.",
        "A function in PHP is a database table.",
        "A function in PHP is a programming language.",
        "A function in PHP is a block of reusable code that performs a specific task.",
        "A function in PHP is a JavaScript library."
    });
    questionRepository.save(q35);

    Question q36 = new Question

    ();
    q36.setText("What is the if statement used for in PHP?");
    q36.setArea("Back-end");
    q36.setSubject("PHP");
    q36.setDifficult("Beginner");
    q36.setAnswer("The if statement is used to perform conditional execution of code in PHP.");
    q36.setAlternatives(new String[] {
        "The if statement is used for handling form submissions in PHP.",
        "The if statement is used for managing database connections in PHP.",
        "The if statement is used for defining functions in PHP.",
        "The if statement is used to conditionally render elements in PHP.",
        "The if statement is used to perform conditional execution of code in PHP."
    });
    questionRepository.save(q36);

    Question q37 = new Question();
    q37.setText("What is the for loop used for in PHP?");
    q37.setArea("Back-end");
    q37.setSubject("PHP");
    q37.setDifficult("Beginner");
    q37.setAnswer("The for loop is used to iterate over a block of code a specified number of times in PHP.");
    q37.setAlternatives(new String[] {
        "The for loop is used for handling form submissions in PHP.",
        "The for loop is used for managing database connections in PHP.",
        "The for loop is used for defining functions in PHP.",
        "The for loop is used to conditionally render elements in PHP.",
        "The for loop is used to iterate over a block of code a specified number of times in PHP."
    });
    questionRepository.save(q37);

    Question q38 = new Question();
    q38.setText("What is a class in PHP?");
    q38.setArea("Back-end");
    q38.setSubject("PHP");
    q38.setDifficult("Beginner");
    q38.setAnswer("A class in PHP is a blueprint for creating objects that encapsulate data and functionality.");
    q38.setAlternatives(new String[] {
        "A class in PHP is a CSS style.",
        "A class in PHP is a database table.",
        "A class in PHP is a programming language.",
        "A class in PHP is a blueprint for creating objects that encapsulate data and functionality.",
        "A class in PHP is a JavaScript library."
    });
    questionRepository.save(q38);

    Question q39 = new Question();
    q39.setText("What is the include statement used for in PHP?");
    q39.setArea("Back-end");
    q39.setSubject("PHP");
    q39.setDifficult("Beginner");
    q39.setAnswer("The include statement is used to include and evaluate the specified file in PHP.");
    q39.setAlternatives(new String[] {
        "The include statement is used for handling form submissions in PHP.",
        "The include statement is used for managing database connections in PHP.",
        "The include statement is used for defining functions in PHP.",
        "The include statement is used to conditionally render elements in PHP.",
        "The include statement is used to include and evaluate the specified file in PHP."
    });
    questionRepository.save(q39);

    Question q40 = new Question();
    q40.setText("What is the $_POST superglobal used for in PHP?");
    q40.setArea("Back-end");
    q40.setSubject("PHP");
    q40.setDifficult("Beginner");
    q40.setAnswer("The $_POST superglobal is used to collect data submitted in an HTTP POST request in PHP.");
    q40.setAlternatives(new String[] {
        "The $_POST superglobal is used for handling form submissions in PHP.",
        "The $_POST superglobal is used for managing database connections in PHP.",
        "The $_POST superglobal is used for defining functions in PHP.",
        "The $_POST superglobal is used to conditionally render elements in PHP.",
        "The $_POST superglobal is used to collect data submitted in an HTTP POST request in PHP."
    });
    questionRepository.save(q40);

    Question q41 = new Question();
    q41.setText("What is Java?");
    q41.setArea("Back-end");
    q41.setSubject("Java");
    q41.setDifficult("Beginner");
    q41.setAnswer(
        "Java is a high-level programming language known for its platform independence and wide range of applications.");
    q41.setAlternatives(new String[] {
        "Java is a database management system.",
        "Java is a front-end framework.",
        "Java is a scripting language.",
        "Java is a high-level programming language known for its platform independence and wide range of applications.",
        "Java is a markup language."
    });
    questionRepository.save(q41);

    Question q42 = new Question();
    q42.setText("What is a variable in Java?");
    q42.setArea("Back-end");
    q42.setSubject("Java");
    q42.setDifficult("Beginner");
    q42.setAnswer("A variable in Java is a named storage location used to hold data.");
    q42.setAlternatives(new String[] {
        "A variable in Java is a CSS style.",
        "A variable in Java is a database table.",
        "A variable in Java is a programming language.",
        "A variable in Java is a named storage location used to hold data.",
        "A variable in Java is a JavaScript library."
    });
    questionRepository.save(q42);

    Question q43 = new Question();
    q43.setText("What is the if statement used for in Java?");
    q43.setArea("Back-end");
    q43.setSubject("Java");
    q43.setDifficult("Beginner");
    q43.setAnswer("The if statement is used to perform conditional execution of code in Java.");
    q43.setAlternatives(new String[] {
        "The if statement is used for handling form submissions in Java.",
        "The if statement is used for managing database connections in Java.",
        "The if statement is used for defining functions in Java.",
        "The if statement is used to conditionally render elements in Java.",
        "The if statement is used to perform conditional execution of code in Java."
    });
    questionRepository.save(q43);

    Question q44 = new Question();
    q44.setText("What is a loop in Java?");
    q44.setArea("Back-end");
    q44.setSubject("Java");
    q44.setDifficult("Beginner");
    q44.setAnswer("A loop in Java is a control structure that allows the repeated execution of a block of code.");
    q44.setAlternatives(new String[] {
        "A loop in Java is a CSS style.",
        "A loop in Java is a database table.",
        "A loop in Java is a programming language.",
        "A loop in Java is a control structure that allows the repeated execution of a block of code.",
        "A loop in Java is a JavaScript library."
    });
    questionRepository.save(q44);

    Question q45 = new Question();
    q45.setText("What is an array in Java?");
    q45.setArea("Back-end");
    q45.setSubject("Java");
    q45.setDifficult("Beginner");
    q45.setAnswer(
        "An array in Java is a container object that holds a fixed number of values of a single data type.");
    q45.setAlternatives(new String[] {
        "An array in Java is a CSS style.",
        "An array in Java is a database table.",
        "An array in Java is a programming language.",
        "An array in Java is a container object that holds a fixed number of values of a single data type.",
        "An array in Java is a JavaScript library."
    });
    questionRepository.save(q45);

    Question q46 = new Question();
    q46.setText("What is a method in Java?");
    q46.setArea("Back-end");
    q46.setSubject("Java");
    q46.setDifficult("Beginner");
    q46.setAnswer("A method in Java is a collection of statements that performs a specific task.");
    q46.setAlternatives(new String[] {
        "A method in Java is a CSS style.",
        "A method in Java is a database table.",
        "A method in Java is a programming language.",
        "A method in Java is a collection of statements that performs a specific task.",
        "A method in Java is a JavaScript library."
    });
    questionRepository.save(q46);

    Question q47 = new Question();
    q47.setText("What is object-oriented programming (OOP) in Java?");
    q47.setArea("Back-end");
    q47.setSubject("Java");
    q47.setDifficult("Beginner");
    q47.setAnswer(
        "Object-oriented programming (OOP) in Java is a programming paradigm that organizes code into objects with properties and behaviors.");
    q47.setAlternatives(new String[] {
        "Object-oriented programming (OOP) in Java is a CSS style.",
        "Object-oriented programming (OOP) in Java is a database management system.",
        "Object-oriented programming (OOP) in Java is a programming language.",
        "Object-oriented programming (OOP) in Java is a programming paradigm that organizes code into objects with properties and behaviors.",
        "Object-oriented programming (OOP) in Java is a JavaScript library."
    });
    questionRepository.save(q47);

    Question q48 = new Question();
    q48.setText("What is the purpose of a constructor in Java?");
    q48.setArea("Back-end");
    q48.setSubject("Java");
    q48.setDifficult("Beginner");
    q48.setAnswer("A constructor in Java is used to initialize an object and its data members.");
    q48.setAlternatives(new String[] {
        "A constructor in Java is used for handling form submissions.",
        "A constructor in Java is used for managing database connections.",
        "A constructor in Java is used for defining functions.",
        "A constructor in Java is used to conditionally render elements.",
        "A constructor in Java is used to initialize an object and its data members."
    });
    questionRepository.save(q48);

    Question q49 = new Question();
    q49.setText("What is an protected access modifier in Java?");
    q49.setArea("Back-end");
    q49.setSubject("Java");
    q49.setDifficult("Beginner");
    q49.setAnswer(
        "The protected access modifier allows access within the same class, subclasses, and same package.");
    q49.setAlternatives(new String[] {
        "The protected access modifier allows access within the same class, subclasses, and same package.",
        "The protected access modifier allows restricted access to a class, method, or variable.",
        "The protected access modifier allows unrestricted access to a class, method, or variable.",
        "The protected access modifier restricts access to within the same class.",
        "The protected access modifier allows access within the same class, subclasses, and same package."
    });
    questionRepository.save(q49);

    Question q50 = new Question();
    q50.setText("What is the purpose of the static keyword in Java?");
    q50.setArea("Back-end");
    q50.setSubject("Java");
    q50.setDifficult("Beginner");
    q50.setAnswer(
        "The static keyword in Java is used to create variables and methods that belong to the class itself rather than to instances of the class.");
    q50.setAlternatives(new String[] {
        "The static keyword in Java is used to specify the class from which a method or variable is inherited.",
        "The static keyword in Java is used to create variables and methods that belong to instances of the class rather than to the class itself.",
        "The static keyword in Java is used to create variables and methods that belong to the class itself rather than to instances of the class.",
        "The static keyword in Java is used to specify the access level of a method or variable.",
        "The static keyword in Java is used to control the visibility of a class."
    });
    questionRepository.save(q50);

    Question q51 = new Question();
    q51.setText("What is Node.js?");
    q51.setArea("Back-end");
    q51.setSubject("Node");
    q51.setDifficult("Beginner");
    q51.setAnswer(
        "Node.js is a JavaScript runtime environment that allows executing JavaScript code outside of a browser.");
    q51.setAlternatives(new String[] {
        "Node.js is a database management system.",
        "Node.js is a front-end framework.",
        "Node.js is a scripting language.",
        "Node.js is a JavaScript runtime environment that allows executing JavaScript code outside of a browser.",
        "Node.js is a markup language."
    });
    questionRepository.save(q51);

    Question q52 = new Question();
    q52.setText("What is npm?");
    q52.setArea("Back-end");
    q52.setSubject("Node");
    q52.setDifficult("Beginner");
    q52.setAnswer(
        "npm (Node Package Manager) is the default package manager for Node.js that allows installing and managing third-party libraries and tools.");
    q52.setAlternatives(new String[] {
        "npm is a programming language.",
        "npm is a front-end framework.",
        "npm is a database management system.",
        "npm is a markup language.",
        "npm (Node Package Manager) is the default package manager for Node.js that allows installing and managing third-party libraries and tools."
    });
    questionRepository.save(q52);

    Question q53 = new Question();
    q53.setText("What is a callback function in Node.js?");
    q53.setArea("Back-end");
    q53.setSubject("Node");
    q53.setDifficult("Beginner");
    q53.setAnswer(
        "A callback function in Node.js is a function that is passed as an argument to another function and is executed after some operation has been completed.");
    q53.setAlternatives(new String[] {
        "A callback function in Node.js is a function used for querying databases.",
        "A callback function in Node.js is a function that defines the structure of a Node.js application.",
        "A callback function in Node.js is a function used for handling form submissions.",
        "A callback function in Node.js is a function that is passed as an argument to another function and is executed after some operation has been completed.",
        "A callback function in Node.js is a function used for animating elements."
    });
    questionRepository.save(q53);

    Question q54 = new Question();
    q54.setText("What is the purpose of the 'require' function in Node.js?");
    q54.setArea("Back-end");
    q54.setSubject("Node");
    q54.setDifficult("Beginner");
    q54.setAnswer(
        "The 'require' function in Node.js is used to include external modules or files into a Node.js application.");
    q54.setAlternatives(new String[] {
        "The 'require' function in Node.js is used for querying databases.",
        "The 'require' function in Node.js is used for defining functions.",
        "The 'require' function in Node.js is used for handling form submissions.",
        "The 'require' function in Node.js is used to include external modules or files into a Node.js application.",
        "The 'require' function in Node.js is used for animating elements."
    });
    questionRepository.save(q54);

    Question q55 = new Question();
    q55.setText("What is Express.js?");
    q55.setArea("Back-end");
    q55.setSubject("Node");
    q55.setDifficult("Beginner");
    q55.setAnswer(
        "Express.js is a popular web application framework for Node.js that simplifies the process of building web servers and APIs.");
    q55.setAlternatives(new String[] {
        "Express.js is a programming language.",
        "Express.js is a database management system.",
        "Express.js is a front-end framework.",
        "Express.js is a markup language.",
        "Express.js is a popular web application framework for Node.js that simplifies the process of building web servers and APIs."
    });
    questionRepository.save(q55);

    Question q56 = new Question();
    q56.setText("What is middleware in Express.js?");
    q56.setArea("Back-end");
    q56.setSubject("Node");
    q56.setDifficult("Beginner");
    q56.setAnswer(
        "Middleware in Express.js is a function that has access to the request and response objects and can modify them or perform additional tasks before the final request handler is executed.");
    q56.setAlternatives(new String[] {
        "Middleware in Express.js is a programming language.",
        "Middleware in Express.js is a database management system.",
        "Middleware in Express.js is a front-end framework.",
        "Middleware in Express.js is a markup language.",
        "Middleware in Express.js is a function that has access to the request and response objects and can modify them or perform additional tasks before the final request handler is executed."
    });
    questionRepository.save(q56);

    Question q57 = new Question();
    q57.setText("What is the purpose of the 'fs' module in Node.js?");
    q57.setArea("Back-end");
    q57.setSubject("Node");
    q57.setDifficult("Beginner");
    q57.setAnswer(
        "The 'fs' module in Node.js provides file system-related functionality, such as reading from and writing to files.");
    q57.setAlternatives(new String[] {
        "The 'fs' module in Node.js is used for querying databases.",
        "The 'fs' module in Node.js is used for defining functions.",
        "The 'fs' module in Node.js is used for handling form submissions.",
        "The 'fs' module in Node.js provides file system-related functionality, such as reading from and writing to files.",
        "The 'fs' module in Node.js is used for animating elements."
    });
    questionRepository.save(q57);

    Question q58 = new Question();
    q58.setText("What is the purpose of the 'path' module in Node.js?");
    q58.setArea("Back-end");
    q58.setSubject("Node");
    q58.setDifficult("Beginner");
    q58.setAnswer("The 'path' module in Node.js provides utilities for working with file and directory paths.");
    q58.setAlternatives(new String[] {
        "The 'path' module in Node.js is used for querying databases.",
        "The 'path' module in Node.js is used for defining functions.",
        "The 'path' module in Node.js is used for handling form submissions.",
        "The 'path' module in Node.js provides utilities for working with file and directory paths.",
        "The 'path' module in Node.js is used for animating elements."
    });
    questionRepository.save(q58);

    Question q59 = new Question();
    q59.setText("What is a package.json file in Node.js?");
    q59.setArea("Back-end");
    q59.setSubject("Node");
    q59.setDifficult("Beginner");
    q59.setAnswer(
        "A package.json file in Node.js is a metadata file that contains information about the Node.js project, including its dependencies and other configuration details.");
    q59.setAlternatives(new String[] {
        "A package.json file in Node.js is a programming language file.",
        "A package.json file in Node.js is a database management system file.",
        "A package.json file in Node.js is a front-end framework file.",
        "A package.json file in Node.js is a markup language file.",
        "A package.json file in Node.js is a metadata file that contains information about the Node.js project, including its dependencies and other configuration details."
    });
    questionRepository.save(q59);

    Question q60 = new Question();
    q60.setText("What is the purpose of the 'module.exports' object in Node.js?");
    q60.setArea("Back-end");
    q60.setSubject("Node");
    q60.setDifficult("Beginner");
    q60.setAnswer(
        "The 'module.exports' object in Node.js is used to define the public interface of a module and make it available for other modules to use.");
    q60.setAlternatives(new String[] {
        "The 'module.exports' object in Node.js is used for querying databases.",
        "The 'module.exports' object in Node.js is used for defining functions.",
        "The 'module.exports' object in Node.js is used for handling form submissions.",
        "The 'module.exports' object in Node.js is used to define the public interface of a module and make it available for other modules to use.",
        "The 'module.exports' object in Node.js is used for animating elements."
    });
    questionRepository.save(q60);

    Question q61 = new Question();
    q61.setText("What is Kubernetes?");
    q61.setArea("DevOps");
    q61.setSubject("Kubernetes");
    q61.setDifficult("Beginner");
    q61.setAnswer(
        "Kubernetes is an open-source container orchestration platform that automates the deployment, scaling, and management of containerized applications.");
    q61.setAlternatives(new String[] {
        "Kubernetes is a programming language.",
        "Kubernetes is a version control system.",
        "Kubernetes is a front-end framework.",
        "Kubernetes is a database management system.",
        "Kubernetes is an open-source container orchestration platform that automates the deployment, scaling, and management of containerized applications."
    });
    questionRepository.save(q61);

    Question q62 = new Question();
    q62.setText("What is a Pod in Kubernetes?");
    q62.setArea("DevOps");
    q62.setSubject("Kubernetes");
    q62.setDifficult("Beginner");
    q62.setAnswer(
        "A Pod in Kubernetes is the smallest and simplest unit in the Kubernetes object model, representing a single instance of a running process in a cluster.");
    q62.setAlternatives(new String[] {
        "A Pod in Kubernetes is a database management system.",
        "A Pod in Kubernetes is a front-end framework.",
        "A Pod in Kubernetes is a version control system.",
        "A Pod in Kubernetes is a programming language.",
        "A Pod in Kubernetes is the smallest and simplest unit in the Kubernetes object model, representing a single instance of a running process in a cluster."
    });
    questionRepository.save(q62);

    Question q63 = new Question();
    q63.setText("What is a ReplicaSet in Kubernetes?");
    q63.setArea("DevOps");
    q63.setSubject("Kubernetes");
    q63.setDifficult("Beginner");
    q63.setAnswer(
        "A ReplicaSet in Kubernetes is a higher-level abstraction that ensures a specified number of replica Pods are running at all times.");
    q63.setAlternatives(new String[] {
        "A ReplicaSet in Kubernetes is a front-end framework.",
        "A ReplicaSet in Kubernetes is a database management system.",
        "A ReplicaSet in Kubernetes is a version control system.",
        "A ReplicaSet in Kubernetes is a programming language.",
        "A ReplicaSet in Kubernetes is a higher-level abstraction that ensures a specified number of replica Pods are running at all times."
    });
    questionRepository.save(q63);

    Question q64 = new Question();
    q64.setText("What is a Deployment in Kubernetes?");
    q64.setArea("DevOps");
    q64.setSubject("Kubernetes");
    q64.setDifficult("Beginner");
    q64.setAnswer(
        "A Deployment in Kubernetes is a higher-level abstraction that provides declarative updates for Pods and ReplicaSets, allowing easy scaling and rolling updates.");
    q64.setAlternatives(new String[] {
        "A Deployment in Kubernetes is a front-end framework.",
        "A Deployment in Kubernetes is a database management system.",
        "A Deployment in Kubernetes is a version control system.",
        "A Deployment in Kubernetes is a programming language.",
        "A Deployment in Kubernetes is a higher-level abstraction that provides declarative updates for Pods and ReplicaSets, allowing easy scaling and rolling updates."
    });
    questionRepository.save(q64);

    Question q65 = new Question();
    q65.setText("What is a Service in Kubernetes?");
    q65.setArea("DevOps");
    q65.setSubject("Kubernetes");
    q65.setDifficult("Beginner");
    q65.setAnswer(
        "A Service in Kubernetes is an abstraction that defines a logical set of Pods and a policy for accessing them, enabling communication between different parts of an application.");
    q65.setAlternatives(new String[] {
        "A Service in Kubernetes is a front-end framework.",
        "A Service in Kubernetes is a database management system.",
        "A Service in Kubernetes is a version control system.",
        "A Service in Kubernetes is a programming language.",
        "A Service in Kubernetes is an abstraction that defines a logical set of Pods and a policy for accessing them, enabling communication between different parts of an application."
    });
    questionRepository.save(q65);

    Question q66 = new Question();
    q66.setText("What is a Namespace in Kubernetes?");
    q66.setArea("DevOps");
    q66.setSubject("Kubernetes");
    q66.setDifficult("Beginner");
    q66.setAnswer(
        "A Namespace in Kubernetes is a way to create virtual clusters within a physical cluster, providing a means to separate resources and enable multi-tenancy.");
    q66.setAlternatives(new String[] {
        "A Namespace in Kubernetes is a front-end framework.",
        "A Namespace in Kubernetes is a database management system.",
        "A Namespace in Kubernetes is a version control system.",
        "A Namespace in Kubernetes is a programming language.",
        "A Namespace in Kubernetes is a way to create virtual clusters within a physical cluster, providing a means to separate resources and enable multi-tenancy."
    });
    questionRepository.save(q66);

    Question q67 = new Question();
    q67.setText("What is a ConfigMap in Kubernetes?");
    q67.setArea("DevOps");
    q67.setSubject("Kubernetes");
    q67.setDifficult("Beginner");
    q67.setAnswer(
        "A ConfigMap in Kubernetes is an API object used to store non-confidential configuration data in key-value pairs that can be consumed by Pods or other resources.");
    q67.setAlternatives(new String[] {
        "A ConfigMap in Kubernetes is a front-end framework.",
        "A ConfigMap in Kubernetes is a database management system.",
        "A ConfigMap in Kubernetes is a version control system.",
        "A ConfigMap in Kubernetes is a programming language.",
        "A ConfigMap in Kubernetes is an API object used to store non-confidential configuration data in key-value pairs that can be consumed by Pods or other resources."
    });
    questionRepository.save(q67);

    Question q68 = new Question();
    q68.setText("What is a Secret in Kubernetes?");
    q68.setArea("DevOps");
    q68.setSubject("Kubernetes");
    q68.setDifficult("Beginner");
    q68.setAnswer(
        "A Secret in Kubernetes is an API object used to store sensitive data, such as passwords or API keys, and provide a way to distribute it securely to Pods or other resources.");
    q68.setAlternatives(new String[] {
        "A Secret in Kubernetes is a front-end framework.",
        "A Secret in Kubernetes is a database management system.",
        "A Secret in Kubernetes is a version control system.",
        "A Secret in Kubernetes is a programming language.",
        "A Secret in Kubernetes is an API object used to store sensitive data, such as passwords or API keys, and provide a way to distribute it securely to Pods or other resources."
    });
    questionRepository.save(q68);

    Question q69 = new Question();
    q69.setText("What is a Persistent Volume in Kubernetes?");
    q69.setArea("DevOps");
    q69.setSubject("Kubernetes");
    q69.setDifficult("Beginner");
    q69.setAnswer(
        "A Persistent Volume in Kubernetes is a piece of storage in the cluster that has been provisioned and is available for use by Pods, providing data persistence even if Pods are restarted or rescheduled.");
    q69.setAlternatives(new String[] {
        "A Persistent Volume in Kubernetes is a front-end framework.",
        "A Persistent Volume in Kubernetes is a database management system.",
        "A Persistent Volume in Kubernetes is a version control system.",
        "A Persistent Volume in Kubernetes is a programming language.",
        "A Persistent Volume in Kubernetes is a piece of storage in the cluster that has been provisioned and is available for use by Pods, providing data persistence even if Pods are restarted or rescheduled."
    });
    questionRepository.save(q69);

    Question q70 = new Question();
    q70.setText("What is a StatefulSet in Kubernetes?");
    q70.setArea("DevOps");
    q70.setSubject("Kubernetes");
    q70.setDifficult("Beginner");
    q70.setAnswer(
        "A StatefulSet in Kubernetes is a higher-level abstraction that provides ordered, unique naming and stable network identities for a set of Pods, ensuring stable storage and network connections during scaling or rolling updates.");
    q70.setAlternatives(new String[] {
        "A StatefulSet in Kubernetes is a front-end framework.",
        "A StatefulSet in Kubernetes is a database management system.",
        "A StatefulSet in Kubernetes is a version control system.",
        "A StatefulSet in Kubernetes is a programming language.",
        "A StatefulSet in Kubernetes is a higher-level abstraction that provides ordered, unique naming and stable network identities for a set of Pods, ensuring stable storage and network connections during scaling or rolling updates."
    });
    questionRepository.save(q70);

    Question q71 = new Question();
    q71.setText("What is Docker?");
    q71.setArea("DevOps");
    q71.setSubject("Docker");
    q71.setDifficult("Beginner");
    q71.setAnswer(
        "Docker is an open-source platform that allows you to automate the deployment, scaling, and management of applications using containerization.");
    q71.setAlternatives(new String[] {
        "Docker is a programming language.",
        "Docker is a version control system.",
        "Docker is a front-end framework.",
        "Docker is a database management system.",
        "Docker is an open-source platform that allows you to automate the deployment, scaling, and management of applications using containerization."
    });
    questionRepository.save(q71);

    Question q72 = new Question();
    q72.setText("What is a Docker container?");
    q72.setArea("DevOps");
    q72.setSubject("Docker");
    q72.setDifficult("Beginner");
    q72.setAnswer(
        "A Docker container is a lightweight and standalone executable package that includes everything needed to run a piece of software, including the code, runtime, system tools, system libraries, and dependencies.");
    q72.setAlternatives(new String[] {
        "A Docker container is a front-end framework.",
        "A Docker container is a database management system.",
        "A Docker container is a version control system.",
        "A Docker container is a programming language.",
        "A Docker container is a lightweight and standalone executable package that includes everything needed to run a piece of software, including the code, runtime, system tools, system libraries, and dependencies."
    });
    questionRepository.save(q72);

    Question q73 = new Question();
    q73.setText("What is a Docker image?");
    q73.setArea("DevOps");
    q73.setSubject("Docker");
    q73.setDifficult("Beginner");
    q73.setAnswer(
        "A Docker image is a read-only template that contains a set of instructions for creating a Docker container. It is used to build and distribute containers across different environments.");
    q73.setAlternatives(new String[] {
        "A Docker image is a front-end framework.",
        "A Docker image is a database management system.",
        "A Docker image is a version control system.",
        "A Docker image is a programming language.",
        "A Docker image is a read-only template that contains a set of instructions for creating a Docker container. It is used to build and distribute containers across different environments."
    });
    questionRepository.save(q73);

    Question q74 = new Question();
    q74.setText("What is a Dockerfile?");
    q74.setArea("DevOps");
    q74.setSubject("Docker");
    q74.setDifficult("Beginner");
    q74.setAnswer(
        "A Dockerfile is a text file that contains a set of instructions for building a Docker image. It specifies the base image, adds additional dependencies, and configures the container environment.");
    q74.setAlternatives(new String[] {
        "A Dockerfile is a front-end framework.",
        "A Dockerfile is a database management system.",
        "A Dockerfile is a version control system.",
        "A Dockerfile is a programming language.",
        "A Dockerfile is a text file that contains a set of instructions for building a Docker image. It specifies the base image, adds additional dependencies, and configures the container environment."
    });
    questionRepository.save(q74);

    Question q75 = new Question();
    q75.setText("What is Docker Hub?");
    q75.setArea("DevOps");

    q75.setSubject("Docker");
    q75.setDifficult("Beginner");
    q75.setAnswer(
        "Docker Hub is a cloud-based registry service provided by Docker that allows you to store, manage, and share Docker images. It serves as a central repository for Docker users.");
    q75.setAlternatives(new String[] {
        "Docker Hub is a front-end framework.",
        "Docker Hub is a database management system.",
        "Docker Hub is a version control system.",
        "Docker Hub is a programming language.",
        "Docker Hub is a cloud-based registry service provided by Docker that allows you to store, manage, and share Docker images. It serves as a central repository for Docker users."
    });
    questionRepository.save(q75);

    Question q76 = new Question();
    q76.setText("What is Docker Compose?");
    q76.setArea("DevOps");
    q76.setSubject("Docker");
    q76.setDifficult("Beginner");
    q76.setAnswer(
        "Docker Compose is a tool that allows you to define and manage multi-container Docker applications. It uses a YAML file to configure the services, networks, and volumes for the application.");
    q76.setAlternatives(new String[] {
        "Docker Compose is a front-end framework.",
        "Docker Compose is a database management system.",
        "Docker Compose is a version control system.",
        "Docker Compose is a programming language.",
        "Docker Compose is a tool that allows you to define and manage multi-container Docker applications. It uses a YAML file to configure the services, networks, and volumes for the application."
    });
    questionRepository.save(q76);

    Question q77 = new Question();
    q77.setText("What is Docker Swarm?");
    q77.setArea("DevOps");
    q77.setSubject("Docker");
    q77.setDifficult("Beginner");
    q77.setAnswer(
        "Docker Swarm is a native clustering and orchestration solution for Docker. It allows you to create and manage a swarm of Docker nodes, enabling high availability and scaling of containerized applications.");
    q77.setAlternatives(new String[] {
        "Docker Swarm is a front-end framework.",
        "Docker Swarm is a database management system.",
        "Docker Swarm is a version control system.",
        "Docker Swarm is a programming language.",
        "Docker Swarm is a native clustering and orchestration solution for Docker. It allows you to create and manage a swarm of Docker nodes, enabling high availability and scaling of containerized applications."
    });
    questionRepository.save(q77);

    Question q78 = new Question();
    q78.setText("What is a Docker volume?");
    q78.setArea("DevOps");
    q78.setSubject("Docker");
    q78.setDifficult("Beginner");
    q78.setAnswer(
        "A Docker volume is a directory within a Docker container that exists outside the lifecycle of the container. It allows data to persist across container restarts or be shared among multiple containers.");
    q78.setAlternatives(new String[] {
        "A Docker volume is a front-end framework.",
        "A Docker volume is a database management system.",
        "A Docker volume is a version control system.",
        "A Docker volume is a programming language.",
        "A Docker volume is a directory within a Docker container that exists outside the lifecycle of the container. It allows data to persist across container restarts or be shared among multiple containers."
    });
    questionRepository.save(q78);

    Question q79 = new Question();
    q79.setText("What is Docker Registry?");
    q79.setArea("DevOps");
    q79.setSubject("Docker");
    q79.setDifficult("Beginner");
    q79.setAnswer(
        "A Docker Registry is a service that stores Docker images. It can be a public registry like Docker Hub or a private registry that you set up to store and distribute your own Docker images.");
    q79.setAlternatives(new String[] {
        "A Docker Registry is a front-end framework.",
        "A Docker Registry is a database management system.",
        "A Docker Registry is a version control system.",
        "A Docker Registry is a programming language.",
        "A Docker Registry is a service that stores Docker images. It can be a public registry like Docker Hub or a private registry that you set up to store and distribute your own Docker images."
    });
    questionRepository.save(q79);

    Question q80 = new Question();
    q80.setText("What is Docker Networking?");
    q80.setArea("DevOps");
    q80.setSubject("Docker");
    q80.setDifficult("Beginner");
    q80.setAnswer(
        "Docker Networking is a feature that enables communication between Docker containers and between containers and the outside world. It provides various networking options to connect and isolate containers.");
    q80.setAlternatives(new String[] {
        "Docker Networking is a front-end framework.",
        "Docker Networking is a database management system.",
        "Docker Networking is a version control system.",
        "Docker Networking is a programming language.",
        "Docker Networking is a feature that enables communication between Docker containers and between containers and the outside world. It provides various networking options to connect and isolate containers."
    });
   Question q81 = new Question();
    q81.setText("What is AWS?");
    q81.setArea("DevOps");
    q81.setSubject("AWS");
    q81.setDifficult("Beginner");
    q81.setAnswer(
        "AWS (Amazon Web Services) is a cloud computing platform provided by Amazon that offers a wide range of cloud services, including computing power, storage, databases, networking, and more.");
    q81.setAlternatives(new String[] {
        "AWS is a front-end framework.",
        "AWS is a programming language.",
        "AWS is a version control system.",
        "AWS is a database management system.",
        "AWS (Amazon Web Services) is a cloud computing platform provided by Amazon that offers a wide range of cloud services, including computing power, storage, databases, networking, and more."
    });
    questionRepository.save(q81);

     Question q82 = new Question();
    q82.setText("What is an EC2 instance in AWS?");
    q82.setArea("DevOps");
    q82.setSubject("AWS");
    q82.setDifficult("Beginner");
    q82.setAnswer(
        "An EC2 (Elastic Compute Cloud) instance in AWS is a virtual server that you can provision and use to run applications and services in the cloud. It provides you with compute capacity in the form of virtual machines.");
    q82.setAlternatives(new String[] {
        "An EC2 instance in AWS is a front-end framework.",
        "An EC2 instance in AWS is a programming language.",
        "An EC2 instance in AWS is a version control system.",
        "An EC2 instance in AWS is a database management system.",
        "An EC2 (Elastic Compute Cloud) instance in AWS is a virtual server that you can provision and use to run applications and services in the cloud. It provides you with compute capacity in the form of virtual machines."
    });
    questionRepository.save(q82);

     Question q83 = new Question();
    q83.setText("What is S3 in AWS?");
    q83.setArea("DevOps");
    q83.setSubject("AWS");
    q83.setDifficult("Beginner");
    q83.setAnswer(
        "S3 (Simple Storage Service) in AWS is an object storage service that offers industry-leading scalability, data availability, security, and performance. It allows you to store and retrieve any amount of data from anywhere on the web.");
    q83.setAlternatives(new String[] {
        "S3 in AWS is a front-end framework.",
        "S3 in AWS is a programming language.",
        "S3 in AWS is a version control system.",
        "S3 in AWS is a database management system.",
        "S3 (Simple Storage Service) in AWS is an object storage service that offers industry-leading scalability, data availability, security, and performance."
    });
    questionRepository.save(q83);

     Question q84 = new Question();
    q84.setText("What is an RDS in AWS?");
    q84.setArea("DevOps");
    q84.setSubject("AWS");
    q84.setDifficult("Beginner");
    q84.setAnswer(
        "RDS (Relational Database Service) in AWS is a managed database service that makes it easy to set up, operate, and scale a relational database in the cloud. It supports various database engines, such as MySQL, PostgreSQL, and SQL Server.");
    q84.setAlternatives(new String[] {
        "An RDS in AWS is a front-end framework.",
        "An RDS in AWS is a programming language.",
        "An RDS in AWS is a version control system.",
        "An RDS in AWS is a cloud-based registry service.",
        "RDS (Relational Database Service) in AWS is a managed database service that makes it easy to set up, operate, and scale a relational database in the cloud. It supports various database engines, such as MySQL, PostgreSQL, and SQL Server."
    });
    questionRepository.save(q84);

     Question q85 = new Question();
    q85.setText("What is an IAM user in AWS?");
    q85.setArea("DevOps");
    q85.setSubject("AWS");
    q85.setDifficult("Beginner");
    q85.setAnswer(
        "An IAM (Identity and Access Management) user in AWS is an entity that represents a person or application that interacts with AWS services. It is used to manage access to AWS resources by assigning permissions and security credentials.");
    q85.setAlternatives(new String[] {
        "An IAM user in AWS is a front-end framework.",
        "An IAM user in AWS is a programming language.",
        "An IAM user in AWS is a version control system.",
        "An IAM user in AWS is a database management system.",
        "An IAM (Identity and Access Management) user in AWS is an entity that represents a person or application that interacts with AWS services. It is used to manage access to AWS resources by assigning permissions and security credentials."
    });
    questionRepository.save(q85);
     

     Question q86 = new Question();
    q86.setText("What is an SNS in AWS?");
    q86.setArea("DevOps");
    q86.setSubject("AWS");
    q86.setDifficult("Beginner");
    q86.setAnswer("SNS  in AWS is a messaging service that enables you to send notifications from the cloud to various endpoints.");
    q86.setAlternatives(new String[] {
        "An SNS in AWS is a front-end framework.",
        "An SNS in AWS is a programming language.",
        "An SNS in AWS is a version control system.",
        "An SNS in AWS is a database management system.",
        "SNS  in AWS is a messaging service that enables you to send notifications from the cloud to various endpoints."
    });
    questionRepository.save(q86);

     Question q87 = new Question();
    q87.setText("What is an EC2 Auto Scaling group in AWS?");
    q87.setArea("DevOps");
    q87.setSubject("AWS");
    q87.setDifficult("Beginner");
    q87.setAnswer("An EC2 Auto Scaling group in AWS is a feature that automatically adjusts the number of EC2 instances in a fleet based on user-defined policies.\"");
    q87.setAlternatives(new String[] {
        "An EC2 Auto Scaling group in AWS is a front-end framework.",
        "An EC2 Auto Scaling group in AWS is a programming language.",
        "An EC2 Auto Scaling group in AWS is a version control system.",
        "An EC2 Auto Scaling group in AWS is a database management system.",
        "An EC2 Auto Scaling group in AWS is a feature that automatically adjusts the number of EC2 instances in a fleet based on user-defined policies."
    });
    questionRepository.save(q87);

    Question q88 = new Question();
    q88.setText("What is CloudFormation in AWS?");
    q88.setArea("DevOps");
    q88.setSubject("AWS");
    q88.setDifficult("Beginner");
    q88.setAnswer("CloudFormation in AWS is a service that allows you to create and manage a collection of related AWS resources.");
    q88.setAlternatives(new String[] {
        "CloudFormation in AWS is a front-end framework.",
        "CloudFormation in AWS is a programming language.", 
        "CloudFormation in AWS is a version control system.",
        "CloudFormation in AWS is a database management system.",
        "CloudFormation in AWS is a service that allows you to create and manage a collection of related AWS resources."
    });
    questionRepository.save(q88); 

    Question q89 = new Question();
    q89.setText("What is AWS Lambda?");
    q89.setArea("DevOps");
    q89.setSubject("AWS");
    q89.setDifficult("Beginner");
    q89.setAnswer("AWS Lambda is a serverless computing service provided by AWS.");
    q89.setAlternatives(new String[] {
        "AWS Lambda is a front-end framework.",
        "AWS Lambda is a programming language.",
        "AWS Lambda is a version control system.",
        "AWS Lambda is a database management system.",
        "AWS Lambda is a serverless computing service provided by AWS."
    });
    questionRepository.save(q89);

    Question q90 = new Question();
    q90.setText("What is AWS CloudTrail?");
    q90.setArea("DevOps");
    q90.setSubject("AWS");
    q90.setDifficult("Beginner");
    q90.setAnswer(
        "AWS CloudTrail is a service that enables governance, compliance, operational auditing, and risk auditing of your AWS account.");
    q90.setAlternatives(new String[] {
        "AWS CloudTrail is a front-end framework.",
        "AWS CloudTrail is a programming language.",
        "AWS CloudTrail is a version control system.",
        "AWS CloudTrail is a database management system.",
        "AWS CloudTrail is a service that enables governance, compliance, operational auditing, and risk auditing of your AWS account."
    });
    questionRepository.save(q90);


  }
}
