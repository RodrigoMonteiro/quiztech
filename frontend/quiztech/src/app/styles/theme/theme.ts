export interface Theme {
  name: string,
  properties: any
}

export const angularLight: Theme = {
  name: 'angularLight',
  properties: {
    '--primary-background-color': '#003cb3',
    '--secondary-background-color': '#ff0000',
    '--default-background-color': '#ffffff',
    '--font-color': '#0d0d0d',
  },
};
export const angularDark: Theme = {
  name: 'angularDark',
  properties: {
    '--primary-background-color': '#003cb3',
    '--secondary-background-color': '#ff0000',
    '--default-background-color': '#0d0d0d',
    '--font-color': '#FFFFFF',
  },
};
export const reactLight: Theme = {
  name: 'reactLight',
  properties: {
    '--primary-background-color': '7cc5d9',
    '--secondary-background-color': '1c2c4c',
    '--default-background-color': '#FFFFFF',
    '--font-color': '#0d0d0d',
  },
};
export const reactDark: Theme = {
  name: 'reactDark',
  properties: {
    '--primary-background-color': '#7cc5d9',
    '--secondary-background-color': '#1c2c4c',
    '--default-background-color': '#0d0d0d',
    '--font-color': '#FFFFFF',
  },
};
export const vueLight: Theme = {
  name: 'vueLight',
  properties: {
    '--primary-background-color': '#42b883',
    '--secondary-background-color': '#35495e',
    '--default-background-color': '#FFFFFF',
    '--font-color': '#0d0d0d',
  },
};
export const vueDark: Theme = {
  name: 'vueDark',
  properties: {
    '--primary-background-color': '#42b883',
    '--secondary-background-color': '#35495e',
    '--default-background-color': '#0d0d0d',
    '--font-color': '#FFFFFF',
  },
};
