# Minimal LibGDX Starter with Scala 3 and Mill

This is a Scala 3 and Mill version of the default LibGDX template, setup with a desktop target ready to go.

I tried converting the default Java & Gradle LibGDX template to Scala by using the Kotlin template as a guide, but I eventually gave up because I couldn't figure out how to set up the `implementation` and `api` settings to get the Scala core and desktop projects to work together.

I am sure there is a way to do it. I just don't know enough Gradle to make it happen. But, I am here to explore game dev with LibGDX and Scala, not Gradle, so I made a template using Mill instead. As you can see, `build.sc` is delightfully simple.

## Build and Run Instructions

To build and run this starter, please install Mill first.

Then, in the root directory of this project, simply run `mill desktop.run`.

That's it!
