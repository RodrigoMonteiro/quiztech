import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class ArrayOperationsService {

  constructor() {}

  // Shuffle elements of a finite array using the Fisher Yates Method
  handleRandomArrayElements(array: string[]) {
    for (let i = array.length - 1; i > 0; i--) {
      let j = Math.floor(Math.random() * (i + 1));
      let k = array[i];
      array[i] = array[j];
      array[j] = k;
    }
  }
}
