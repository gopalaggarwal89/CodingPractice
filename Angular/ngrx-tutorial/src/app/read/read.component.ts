import { Component, OnInit } from '@angular/core';
import { Store } from '@ngrx/store';
import { Tutorial } from './../models/tutorial.model';
import { AppState } from './../app.state';
import { Observable } from 'rxjs';
// Import our actions at the top
import * as TutorialActions from '../store/tutorial.actions';


@Component({
  selector: 'app-read',
  templateUrl: './read.component.html',
  styleUrls: ['./read.component.scss']
})
export class ReadComponent implements OnInit {

  tutorials: Observable<Tutorial[]>;

  // Section 2
  constructor(private store: Store<AppState>) { 
    this.tutorials = store.select('tutorial');
  }
  
  delTutorial(index) {
    this.store.dispatch(new TutorialActions.RemoveTutorial(index) )
  }

  ngOnInit() {
  }

}
 