#AwesomeCard

##AwesomeCard is an android library to add beautiful cards to your app.


##Usage

### Creating a Lean Card
```
    LeanCard leanCard = new LeanCard(this,BitmapFactory.decodeResource(getResources(),R.drawable.bitmap),"Title goes here..","Description goes here");
```

### adding the lean card to the layout

```
    addContentView(leanCard,new LayoutParams(WRAP_CONTENT,WRAP_CONTENT));
```

### Setting X and Y(optional)

```
    leanCard.setX(x);
    leanCard.setY(y);
```
