tasks {
    register("greet") {
        group = "sample"
        description = "Prints a description of ${project.name}."
        doLast {
            println("I'm ${project.name}.")
        }
    }
}