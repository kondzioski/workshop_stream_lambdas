package interfaces;

@FunctionalInterface
public interface Logger<T> {
	void log(T t);
	
}
