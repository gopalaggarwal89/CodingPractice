// Section 1
import { Injectable } from '@angular/core'
import { Action } from '@ngrx/store' //Defining actions
import { Tutorial } from '../models/tutorial.model' //Tutorial models

// Section 2
export const ADD_TUTORIAL       = '[TUTORIAL] Add'
export const REMOVE_TUTORIAL    = '[TUTORIAL] Remove'

//Section 3
//We're creating a class for each action with a constructor that allows us to pass in the payload. 
//This isn't a required step, but it does provide you with strong typing.
export class AddTutorial implements Action {

    readonly type = ADD_TUTORIAL;

    constructor(public payload: Tutorial) {}
}

export class RemoveTutorial implements Action {

    readonly type = REMOVE_TUTORIAL;
    //Will pass index to remove the tutorial object
    constructor(public payload: number) {}
}

//We're exporting all of our action classes for use within our reducer.
export type Actions = AddTutorial | RemoveTutorial
