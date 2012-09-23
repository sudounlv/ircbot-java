Hello there! As I mentioned at the SUDO meeting, learning Java once you know C++ is hopefully a more straightforward experience than learning Java from scratch. Hopefully some of these web links will get you running. For the next stage of the assignment, you should be able to get by from the starting source, the tutorials below about Java itself and a bit of understanding about how the `java.util.Map` classes work.

## To Run the program:

Use the build.sh and run.sh to do what you need to do. Since the pircbot jar dependency is included, but needs to be referenced at compile and run time, those scripts do all the hard work. 

After we get a few stages into the project, I intend on introducing [Maven][maven], a build management tool that manages the resolution of dependencies for your project, the downloading of said dependencies, and the construction of artifacts that can then be run outside of your development environment. It may seem a bit obtuse and weighty, but development of larger programs without these types of tools is a nightmare and a half.

## C++ -> Java links
* [Just the basics][wisc]
* [Cheat-sheet][cs] 

[wisc]: http://pages.cs.wisc.edu/~hasti/cs368/JavaTutorial/
[cs]: http://www4.ncsu.edu/~kaltofen/courses/Languages/JavaExamples/cpp_vs_java/
[maven]: http://maven.apache.org/guides/getting-started/index.html