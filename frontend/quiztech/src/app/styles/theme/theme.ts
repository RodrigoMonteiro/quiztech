export interface Theme {
  techName: string;
  theme: string;
  icon: string;
  properties: any;
}

export const angularLight: Theme = {
  techName: 'Angular',
  theme: 'Light',
  icon: 'assets/images/angularLogo.png',
  properties: {
    '--primary-background-color': '#e30b3b',
    '--secondary-background-color': '#1976D2',
    '--default-background-color': '#ffffff',
    '--font-color': '#0d0d0d',
  },
};
export const angularDark: Theme = {
  techName: 'Angular',
  theme: 'Dark',
  icon: 'assets/images/angularLogo.png',
  properties: {
    '--primary-background-color': '#d4173b',
    '--secondary-background-color': '#31448f',
    '--default-background-color': '#0d0d0d',
    '--font-color': '#FFFFFF',
  },
};
export const reactLight: Theme = {
  techName: 'React',
  theme: 'Light',
  icon: 'assets/images/reactLogo.png',
  properties: {
    '--primary-background-color': '#88dded',
    '--secondary-background-color': '#1c2c4c',
    '--default-background-color': '#FFFFFF',
    '--font-color': '#0d0d0d',
  },
};
export const reactDark: Theme = {
  techName: 'React',
  theme: 'Dark',
  icon: 'assets/images/reactLogo.png',
  properties: {
    '--primary-background-color': '#7cc5d9',
    '--secondary-background-color': '#4c768d',
    '--default-background-color': '#0d0d0d',
    '--font-color': '#FFFFFF',
  },
};
export const vueLight: Theme = {
  techName: 'Vue',
  theme: 'Light',
  icon: 'assets/images/vueLogo.png',
  properties: {
    '--primary-background-color': '#41CC8E',
    '--secondary-background-color': '#34495E',
    '--default-background-color': '#FFFFFF',
    '--font-color': '#0d0d0d',
  },
};
export const vueDark: Theme = {
  techName: 'Vue',
  theme: 'Dark',
  icon: 'assets/images/vueLogo.png',
  properties: {
    '--primary-background-color': '#32B87D',
    '--secondary-background-color': '#405469',
    '--default-background-color': '#0d0d0d',
    '--font-color': '#FFFFFF',
  },
};

export const allThemes = [
  angularLight,
  angularDark,
  reactLight,
  reactDark,
  vueLight,
  vueDark,
];
