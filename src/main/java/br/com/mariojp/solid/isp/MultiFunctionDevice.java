package br.com.mariojp.solid.isp;

public interface MultiFunctionDevice extends Scanner, Printer {
	void print(String content);

	void scan(String targetFile);
}
