# freeskills_androidapp
Step 1:
To Add New Cardview
cardviewdata.java
```
public carddata[] inyourlanguage = new carddata[]{
            new carddata("[cardname]", gen_yt_imgurl("[videoid]"),[typeof]),
            new carddata("[cardname]", gen_yt_imgurl("[videoid]"),[typeof]),
    };
```
Step 2 :
To Add CardviewFull Data
conditiondataset.java
```
    public ArrayList<String> data(String name) {
        ArrayList<String> arrayList = new ArrayList();

        if (Objects.equals(name, "[cardnamecomparewithcardviewdata]")) {
            arrayList.add(0, "[cardname]");
            arrayList.add(1, gen_yt_videourl("[videoid]"));
            arrayList.add(2, "1:42:42");
            arrayList.add(3, gen_channel_name("[videoname]"));
            arrayList.add(3, gen_channel_url("[videosourceurl]"));
            return arrayList;
        }
        return null;
    }
```
To add New data Use Else-if Like this 
```
 if (Objects.equals(name, "[cardnamecomparewithcardviewdata]")) {
            arrayList.add(0, "[cardname]");
            arrayList.add(1, gen_yt_videourl("[videoid]"));
            arrayList.add(2, "1:42:42");
            arrayList.add(3, gen_channel_name("[videoname]"));
            arrayList.add(3, gen_channel_url("[videosourceurl]"));
            return arrayList;
        }

elseif(Objects.equals(name, "[cardnamecomparewithcardviewdata]"))
{
arrayList.add(0, "[cardname]");
            arrayList.add(1, gen_yt_videourl("[videoid]"));
            arrayList.add(2, "1:42:42");
            arrayList.add(3, gen_channel_name("[videoname]"));
            arrayList.add(3, gen_channel_url("[videosourceurl]"));
            return arrayList;}
        return null;
```
Step 3:
Add the Topic List For Each On
topicviewdata.java

```
 public topicdata[] topicdata() {
        if (Objects.equals(cardname, "Internet")) {
            Internet = new topicdata[]{
                    new topicdata("[topicname]", "[videotime]", gen_yt_timeurl("[videotime]")),
                    new topicdata("[topicname]", "[videotime]", gen_yt_timeurl("[videotime]")),
                    new topicdata("[topicname]", "[videotime]", gen_yt_timeurl("[videotime]")),
                    new topicdata("[topicname]", "[videotime]", gen_yt_timeurl("[videotime]")),
                    new topicdata("[topicname]", "[videotime]", gen_yt_timeurl("[videotime]")),
                    new topicdata("[topicname]", "[videotime]", gen_yt_timeurl("[videotime]")),
                    new topicdata("[topicname]", "[videotime]", gen_yt_timeurl("[videotime]")),
                    new topicdata("[topicname]", "[videotime]", gen_yt_timeurl("[videotime]")),
                    new topicdata("[topicname]", "[videotime]", gen_yt_timeurl("[videotime]")),
                    new topicdata("[topicname]", "[videotime]", gen_yt_timeurl("[videotime]")),};
            return Internet;
        }

        return null;
    }
```
To add New use else-if ,Add N-oftimes Create new Object To Save The Data.
