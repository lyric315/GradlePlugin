package gradle.lyri.com.plugingradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Created by lirui on 2017/11/19.
 */

public class MyPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        System.out.println("========================");
        System.out.println("hello gradle plugin!");
        System.out.println("========================");
    }
}
