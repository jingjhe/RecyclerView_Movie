RecyclerView_Movie
==================
RecyclerView  widget

Goal
==
* RecyclerView
* Adapter

Add the support library
===
build.gradle
``` 
dependencies {
    implementation 'com.android.support:recyclerview-v7:28.0.0'
}
```

## Usage
1. Add RecyclerView to layout
2. Customize adapter
3. Item animation

Create adapter
```
class MyAdapter:RecyclerView.Adapter<MyAdapter.ViewHolder>(){
}
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
Copyright 2019 Nate Huang
[MIT](https://choosealicense.com/licenses/mit/)
