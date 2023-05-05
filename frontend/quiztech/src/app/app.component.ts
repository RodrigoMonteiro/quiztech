import { Component} from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  showSplashScreenContent: boolean = true;
  title = 'quiztech';

  constructor(private router: Router, private route: ActivatedRoute) {}




  async handleRedirectHomePage() {
    await this.router.navigate(['home']);
    // console.log(this.router.url);
    // console.log(this.router.url.length > 1);
    this.handleToggleShowRouterContent();
  }

  handleToggleShowRouterContent() {
    const hasParams = this.router.url.length > 1;
    console.log(hasParams)
    this.showSplashScreenContent = !hasParams;
  }
}
