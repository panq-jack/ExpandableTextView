# ExpandableTextView
Expandable text view support expand and collapse

## Reference
- [Github Repo: ReadMoreTextView](https://github.com/PRNDcompany/ReadMoreTextView.git)


## How to use
```xml
<com.jackpan.sdk.expandabletextview.ExpandableTextView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="@string/long_text"
    app:readMoreColor="@color/colorPrimary"
    app:readMoreMaxLine="4"
    app:readMoreText="…more" />
```

## Function
- `toggle()`, `expand()`, `collapse()`: Change expand/collapse state dynamically
- `isExpanded`, `isCollased`, `state`: Get state
- ChangeListener: Observe state change using listener


-------
# Bintray upload
This project includes some gradle scripts that can publish gradle project to JCenter.

## Reference
- [Github Repo: gradle bintray upload](https://github.com/venshine/gradle-bintray-upload)
- [Github Repo: gradle plugin](https://github.com/msdx/gradle-publish)

## How to use
### files
`publish.gradle`: A script to publish an android gradle project to JCenter.

`gradle.properties`: The properties that will be used in `bintray.gradle`. You are needed to copy this file into your library project and configure the values of these properties.

`local.properties`：bintray account name, password. **Remember to add this file in gitignore**

### steps:
#### in project build.gradle
add dependencies plugin(feel free to change version)
```
classpath 'com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.4'
classpath 'com.github.dcendents:android-maven-gradle-plugin:2.0'
```

#### in the library build.gradle
add publish.gradle
```
apply from: rootProject.file('publish.gradle')
```

#### setup `gradle.properties` in your library module
complete the file with your own information, follow is an example,
```
PROJ_GROUP=com.jackpan.android
PROJ_VERSION=1.0.0
PROJ_NAME=ExpandableTextview
PROJ_WEBSITEURL=https://github.com/panq-jack/ExpandableTextView
PROJ_ISSUETRACKERURL=https://github.com/panq-jack/ExpandableTextView/issues
PROJ_VCSURL=https://github.com/panq-jack/ExpandableTextView.git
PROJ_DESCRIPTION=Expandable text view support expand and collapse
PROJ_ARTIFACTID=expandabletextview

LICENSE_NAME='The Apache Software License, Version 2.0'
LICENSE_URL='http://www.apache.org/licenses/LICENSE-2.0.txt'

DEVELOPER_ID=jackpan
DEVELOPER_NAME=pan qian
DEVELOPER_EMAIL=jackpan0321@gmail.com
```

#### run publish command
Execute `gradle bintrayUpload` to publish artifacts to bintray.com.
```
gradlew install
gradle bintrayUpload
```

#### check JCenter
login [Bintray](https://bintray.com/) to check the package you just upload.
