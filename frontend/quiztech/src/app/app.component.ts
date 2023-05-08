import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, NavigationEnd, Router } from '@angular/router';
import { filter } from 'rxjs/operators';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent implements OnInit {
  showSplashScreenContent = true;
  title = 'quiztech';

  constructor(private router: Router, private route: ActivatedRoute) {}

  ngOnInit() {
    this.router.events
      .pipe(filter((event) => event instanceof NavigationEnd))
      .subscribe((event) => {
        const hasParams = this.router.url.length > 1;
        this.showSplashScreenContent = !hasParams;
      });
  }

  handleRedirectHomePage() {
    this.router.navigate(['home']);
  }
}
