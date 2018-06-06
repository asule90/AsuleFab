[![License Apache 2.0](https://img.shields.io/badge/License-Apache%202.0-blue.svg?style=true)](http://www.apache.org/licenses/LICENSE-2.0)
![minSdkVersion 16](https://img.shields.io/badge/minSdkVersion-16-red.svg?style=true)
![compileSdkVersion 24](https://img.shields.io/badge/compileSdkVersion-24-yellow.svg?style=true)



![Icon](https://raw.githubusercontent.com/asule90/AsuleFab/development/art/AsuleFab-ic_launcher.jpg)
# AsuleFab
A FloatingActionButton subclass that shows a counter badge on right top corner

![Sample](https://raw.githubusercontent.com/asule90/AsuleFab/development/art/AsuleFab-Demo.gif)


## Usage

Add it as a regular FloatingActionButton on layout…

```xml
<com.asepsulaeman.asulefab.AsuleFab
        android:id="@+id/counter_fab"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/ic_add_white_24dp" />
```

and programmatically you can use one of these methods:

```java
AsuleFab asuleFab = (AsuleFab) findViewById(R.id.counter_fab);
asuleFab.setNotification("*"); // Set the text to show on badge
asuleFab.getNotification(); // Get the current text
```

## Customization

The recommended way to customize the background color is by using the `app:backgroundTint` attribute

```xml
<com.asepsulaeman.asulefab.AsuleFab
        android:id="@+id/counter_fab"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:backgroundTint="#009688"
        android:src="@drawable/ic_filter_list_black_24dp" />
```

See more at the [sample](https://github.com/asule90/AsuleFab/tree/development/sample)

## Libraries and tools used in the project

* [Design Support Library](http://developer.android.com/intl/pt-br/tools/support-library/features.html#design)
The Design package provides APIs to support adding material design components and patterns to your apps.

## License

    Copyright 2016 André Mion
    Modified 2018 Asep Sulaeman

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
