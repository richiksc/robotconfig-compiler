package codes.richik.robotconfigcompiler.plugin

import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

class RobotConfigPluginTest {

    @Test
    fun `plugin is applied correctly to the project`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("codes.richik.robotconfigcompiler.plugin")

        assert(project.tasks.getByName("compileRobotConfig") is RobotConfigExampleTask)
    }
}
