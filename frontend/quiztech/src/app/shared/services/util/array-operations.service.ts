import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class ArrayOperationsService {
  constructor() {}

  // Shuffle elements of a finite array using the Fisher Yates Method
  // Using generics to accept more than one kind of arrays
  handleRandomArrayElements<T>(array: T[]): T[] {
    for (let i = array.length - 1; i > 0; i--) {
      const j = Math.floor(Math.random() * (i + 1));
      [array[i], array[j]] = [array[j], array[i]];
    }
    return array;
  }
}
