export interface Question {
  id: number;
  text: string;
  area: string;
  subject: string;
  difficult: string;
  answear: string;
  alternatives: string[];
}

export const questionTest: Question = {
  id: 10,
  text: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Rem delectus iusto ipsa voluptates asperiores natus similique, nemo, quaerat hic ut ipsam. Iusto sapiente voluptatem ad molestiae odit dignissimos non voluptates?',
  area: 'Lorem',
  subject: 'Ipsum',
  difficult: 'olor sit amet',
  answear: 'A',
  alternatives: [
    'Lorem ipsum dolor sit amet, consectetur adipisicing elit 1.',
    'Lorem ipsum dolor sit amet, consectetur adipisicing elit 2.',
    'Lorem ipsum dolor sit amet, consectetur adipisicing elit 3.',
    'Lorem ipsum dolor sit amet, consectetur adipisicing elit 4.',
    'Lorem ipsum dolor sit amet, consectetur adipisicing elit 5.',
  ],
};
