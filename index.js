/**
 * @format
 */

import {AppRegistry} from 'react-native';
import App from './App';
import {name as appName} from './app.json';
import testing from './testing.js';
AppRegistry.registerHeadlessTask('testing', () => require('testing'));
AppRegistry.registerComponent(appName, () => App);
