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
    '--primary-background-color': ' #1976D2',
    '--secondary-background-color': '#DD0031',
    '--default-background-color': '#ffffff',
    '--font-color': '#0d0d0d',
  },
};
export const angularDark: Theme = {
  techName: 'Angular',
  theme: 'Dark',
  icon: 'assets/images/angularLogo.png',
  properties: {
    '--primary-background-color': ' #64B5F6',
    '--secondary-background-color': '#E61F47',
    '--default-background-color': '#0d0d0d',
    '--font-color': '#FFFFFF',
  },
};
export const reactLight: Theme = {
  techName: 'React',
  theme: 'Light',
  icon: 'assets/images/reactLogo.png',
  properties: {
    '--primary-background-color': '#61DAFB',
    '--secondary-background-color': '#007BFF',
    '--default-background-color': '#FFFFFF',
    '--font-color': '#0d0d0d',
  },
};
export const reactDark: Theme = {
  techName: 'React',
  theme: 'Dark',
  icon: 'assets/images/reactLogo.png',
  properties: {
    '--primary-background-color': '#4BB8E9',
    '--secondary-background-color': '#015594',
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
    '--secondary-background-color': '#2f9c6d',
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
    '--secondary-background-color': '#36785c',
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
