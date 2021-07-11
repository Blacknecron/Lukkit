package nz.co.jammehcow.lukkit.environment.plugin;

import java.net.URL;
import java.net.URLClassLoader;
import java.lang.ClassLoader;
import java.io.File;

public class LukkitPluginClassLoader extends URLClassLoader {
	public LukkitPluginClassLoader(ClassLoader parent) {
		super(new URL[0], parent);
	}
	public void addJar(File jar) throws java.net.MalformedURLException {
		addURL(jar.toURI().toURL());
	}
}
