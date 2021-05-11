/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 *
 */

class FilterAdapter implements Processor {
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    public String name() {
        return filter.name();
    }

    public Waveform process(Object input) {
        return filter.process((Waveform)input);
    }
}

public class FilterProcessor {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)), w);
        Apply.process(new FilterAdapter(new HighPass(2.0)), w);
        Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
    }
}

