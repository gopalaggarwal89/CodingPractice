import { Action } from '@ngrx/store'
import { Tutorial } from '../models/tutorial.model'
import * as TutorialActions from './tutorial.actions'
import { AotCompiler } from '@angular/compiler'
// Section 1
const initialState: Tutorial = {
    name: 'Initial Tutorial',
    url: 'http://google.com'
}

export function tutorialReducer(state: Tutorial[] = [initialState], action: TutorialActions.Actions) {
    switch(action.type){
        case TutorialActions.ADD_TUTORIAL:
            return [...state, action.payload]
        case TutorialActions.REMOVE_TUTORIAL:
            state.splice(action.payload, 1)
            return state;
        default:
            return state;   
    }
}