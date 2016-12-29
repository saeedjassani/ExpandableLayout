ExpandableLayout
================

![ExpandableLayout](https://github.com/traex/ExpandableLayout/blob/master/header.png)

ExpandableLayout provides an easy way to create a view called header with an expandable view. Both view are external layout to allow a maximum of customization. [You can find a sample](https://github.com/traex/ExpandableLayout/blob/master/sample/) that how to use an ExpandableLayout to your layout.

![ExpandableLayout GIF](https://github.com/traex/ExpandableLayout/blob/master/demo.gif)
 
### Integration
The lib is available via jCentre

``` xml

dependencies {
    compile 'com.github.saeedjassani:expandablelayout:1.0.3'
}

``` 

### Usage

#### ExpandableLayout

Declare an ExpandableLayout inside your XML layout file. You also need to other layouts for header and content:

``` xml

    <com.github.saeedjassani.ExpandableLayout
         android:id="@+id/expandableLayout"
         xmlns:expandable="http://schemas.android.com/apk/res-auto"
         android:layout_width="match_parent"
         android:layout_height="match_parent"
         expandable:el_headerLayout="@layout/view_header"
         expandable:el_contentLayout="@layout/view_content"/>
         
```

#### ExpandableLayoutItem && ExpandableLayoutItem

You can use ExapandableLayout in an `ExpandableLayoutListView` with `ExpandableLayoutItem` as row :

ExpandableLayoutItem
``` xml

    <com.github.saeedjassani.ExpandableLayoutItem
         android:id="@+id/expandableLayout"
         xmlns:expandable="http://schemas.android.com/apk/res-auto"
         android:layout_width="match_parent"
         android:layout_height="match_parent"
         expandable:el_headerLayout="@layout/view_header"
         expandable:el_contentLayout="@layout/view_content"/>
         
```

ExpandableLayoutListView
``` xml

    <com.github.saeedjassani.ExpandableLayoutListView
         android:id="@+id/expandableLayout"
         xmlns:expandable="http://schemas.android.com/apk/res-auto"
         android:layout_width="match_parent"
         android:layout_height="match_parent"/>
         
```
If you want to manage the OnScroll, you have to use `OnExpandableLayoutScrollListener` and don't forget to call super in each method.

You can call dynamically `open`, `close` and `isOpened` from an ExpandableLayout object.

### Customization

You can change duration of the animation:

* app:duration [integer def:200] --> Duration of the animation

### Troubleshooting

If you want to use the `ExpandableLayoutListView` with EditText, you have to set `android:windowSoftInputMode="adjustPan"` to prevent the ListView to redraw itself and close the ExpandableLayoutItem.

### Acknowledgements

Thanks to [Google](http://developer.android.com/reference/android/widget/ExpandableListView.html) for its ExpandableListview :)

This library is actually a fork of [this library](https://github.com/traex/ExpandableLayout). All credits to the original developer.
Since that library was not maintained, I uploaded it and will try to accept PRs.
