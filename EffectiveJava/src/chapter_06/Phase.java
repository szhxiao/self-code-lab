/**
 * Effective Java
 *
 * @version 2nd
 * @author Joshua Bloch
 * @see
 */


public enum Phase {
    SOLD, LIQUID, GAS;

    public enum Transition {
        MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID),
        BOIL(LIQUID, GAS), CONDENSE(GAS, LIQUID),
        SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID);

        private final Phase src;
        private final Phase dst;

		/**
		 * @param src
		 * @param dst
		 */
		private Transition(Phase src, Phase dst) {
			this.src = src;
			this.dst = dst;
		}

        private static final Map<Phase, Map<Phase, Transition>> m = 
            new EnumMap<>(Phase.class);

        static {
            for (Phase p : Phase.values()) {
                m.put(p, new EnumMap<Phase, Transition>(Phase.class));
            }
            for (Transition trans : Transition.values()) {
                m.get(trans.src).put(trans.dst, trans);
            }
        }

        public static Transition from(Phase src, Phase dst) {
            return m.get(src).get(dst);
        }
    }
}
