package com.quiz.demo;

import com.quiz.demo.model.Question;
import com.quiz.demo.repository.QuestionRepository;

public class QuestionDataInsertion {

    private QuestionDataInsertion(){}
    
    public static void insertQuestions(QuestionRepository questionRepository) {

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

    }
}
