
# react-native-bg-thread
This package helps in executing the javascript in a background thread. Time-consuming javascript code is shifted to a native background thread by freeing the main-UI thread, which helps in increasing the efficiency of the application.
Thread priority can be handled by passing in the appropriate flags. Currently we support three types of flag as under:
| Priority Flags      | Description | Android thread value     | IOS thread value     |
| :----:       |    :----:   |     :----: | :----: |
| MAX      | This sets the thread priority to the maximum available on the corresponding native platform.       | 10  | 1.0 |
| MIN   | This sets the thread priority to the minmimum available on the corresponding native platform.        | 1     | 0.1 |
| NORMAL   | This sets the thread priority to the default or normal on the corresponding native platform.        | 5     | 0.5 |

## Getting started

`$ npm install --save react-native-bg-thread`

### Linking

#### iOS
	1. 	Add pod 'react-native-bg-thread', :path => '../node_modules/react-native-bg-thread/react-native-bg-thread.podspec' to your pod file under targets
		Run following commands
	2. 	cd ios
	3. 	pod install

#### Android
	No further action needed

## Usage
#### Example 1

```javascript
import RnBgTask from 'react-native-bg-thread';

	componentDidMount(){
		RnBgTask.runInBackground_withPriority("MIN",()=>{
		
		// Your Javascript code here
		// Javascript executed here runs on the passed thread priority which in this case is minimum.
			
		}) 
	}

```

#### Example 2

```javascript
import RnBgTask from 'react-native-bg-thread';

	componentDidMount(){
		RnBgTask.runInBackground(()=>{
		
		// Your Javascript code here
		// Javascript executed here runs on the default thread priority which is maximum.
			
		})
	}

```


