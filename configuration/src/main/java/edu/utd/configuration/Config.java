package edu.utd.configuration;

public interface Config {
	/**
	 * Data folder
	 */
	public static String DATA = "/Users/sonnguyen/Workspace/2017/time_buggy";
	/**
	 * Junit version
	 */
	public static String JUNIT_VERSION = "4.11";
	/**
	 * Maven SureFire version
	 */
	public static String SUREFIRE_VERSION = "2.19.1";
	/**
	 * Java agent command to instrument MethodCollector to every method
	 * You need to modify the command by the following form after you compile method-coverage project:
	 * -javaagent:"path_to_this_project"/CS-6367.501-course-project/method-coverage/target/method-coverage-0.1-SNAPSHOT.jar
	 */
	public static String PHOSPHOR_HOME = "/Users/sonnguyen/Workspace/2017/Tools/phosphor/Phosphor/target";
	public static String AGENT_COMMAND = "-javaagent:/Users/sonnguyen/Workspace/2017/Program/CS-6367.501-course-project/method-coverage/target/method-coverage-0.1-SNAPSHOT.jar";
	public static String AGENT_COMMAND_PHOSPHOR = "-Xbootclasspath/a:"+PHOSPHOR_HOME+"/Phosphor-0.0.3-SNAPSHOT.jar -javaagent:"+PHOSPHOR_HOME+"/Phosphor-0.0.3-SNAPSHOT.jar";
	public static String JRE_PHOSPHOR = PHOSPHOR_HOME+"/jre-inst-obj/bin/java";
	/**
	 * The location you want to store methods' name collected by
	 * MethodCollector. This cannot be implemented in Time because of the large
	 * number of methods
	 */
	public static String METHODS_COLLECTION_FILE = "";

	public static String DEFECT4J_PROTERTIES = "defects4j.build.properties";
	public static String FAILING_TEST_FILE = "failing_tests";
	public static boolean PHOSPHOR = true;
	public static int MAX_TARGET = 10;
}
