package sage.java.graph;

import java.util.*;
import java.util.stream.Collectors;

public class GraphInputs {
    private UniverseOfDiscourse universeOfDiscourse = null;
    private PredicateTruthMap predicateTruthMap = null;
    private PredicateVariableMap predicateVariableMap = null;
    private BooleanVariableMap booleanVariableMap = null;

    public GraphInputs setUD(UniverseOfDiscourse universeOfDiscourse) {
        this.universeOfDiscourse = universeOfDiscourse;
        return this;
    }

    public GraphInputs setPredicateTruthMap(PredicateTruthMap predicateTruthMap) {
        this.predicateTruthMap = predicateTruthMap;
        return this;
    }

    public GraphInputs setPredicateVariableMap(PredicateVariableMap predicateVariableMap) {
        this.predicateVariableMap = predicateVariableMap;
        return this;
    }

    public GraphInputs setBooleanVariableMap(BooleanVariableMap booleanVariableMap) {
        this.booleanVariableMap = booleanVariableMap;
        return this;
    }

    public Optional<UniverseOfDiscourse> getUD() {
        return Optional.ofNullable(universeOfDiscourse);
    }

    public Optional<PredicateTruthMap> getPredicateTruthMap() {
        return Optional.ofNullable(predicateTruthMap);
    }

    public Optional<PredicateVariableMap> getPredicateVariableMap() {
        return Optional.ofNullable(predicateVariableMap);
    }

    public Optional<BooleanVariableMap> getBooleanVariableMap() {
        return Optional.ofNullable(booleanVariableMap);
    }

    public static class UniverseOfDiscourse extends HashSet<String> {
        public UniverseOfDiscourse(String... vals) {
            super();
            add(vals);
        }

        public UniverseOfDiscourse add(String... vals) {
            this.addAll(Arrays.asList(vals));
            return this;
        }

        @Override
        public String toString() {
            return "{" + String.join(", ", this) + "}";
        }
    }

    // Maps predicates to their truth entries.
    //
    // i.e:
    // {P: [<a>, <b>, <d>], Q: [<a, b>, <c, d>]}
    public static class PredicateTruthMap extends BuilderHashMap<String, PredicateTruthMap.TruthEntrySet, PredicateTruthMap> {
        public static class TruthEntry {
            private final String[] vals;

            public TruthEntry(String... vals) {
                this.vals = vals;
            }

            @Override
            public boolean equals(Object o) {
                if(this == o) return true;
                if(o == null || getClass() != o.getClass()) return false;

                TruthEntry that = (TruthEntry)o;

                if(this.vals.length != that.vals.length) {
                    return false;
                }

                for(int i = 0; i < vals.length; i++) {
                    if(!this.vals[i].equals(that.vals[i])) {
                        return false;
                    }
                }

                return true;
            }

            @Override
            public int hashCode() {
                return Arrays.hashCode(vals);
            }

            @Override
            public String toString() {
                return "<" + String.join(", ", vals) + ">";
            }
        }

        public static class TruthEntrySet extends HashSet<TruthEntry> {
            public TruthEntrySet() {
                super();
            }

            public TruthEntrySet newTruthEntry(String... vals) {
                super.add(new TruthEntry(vals));
                return this;
            }
        }

        @Override
        public String toString() {
            return "{" + keySet().stream()
                    .map(key -> key + ": " + get(key).toString())
                    .collect(Collectors.joining(", ")) + "}";
        }
    }

    // Maps predicate variables to elements in the universe of discourse.
    //
    // i.e:
    // {x: a, y: b, z: c}
    public static class PredicateVariableMap extends BuilderHashMap<String, String, PredicateVariableMap> {
        public PredicateVariableMap() {
            super();
        }

        public PredicateVariableMap(PredicateVariableMap other) {
            super(other);
        }

        public PredicateVariableMap newEntry(String var, String val) {
            super.put(var, val);
            return this;
        }

        @Override
        public String toString() {
            List<String> pairs = new ArrayList<>();

            for(var key : keySet()) {
                pairs.add(key + ": " + get(key));
            }

            return "{" + String.join(", ", pairs) + "}";
        }
    }

    // Maps boolean variables to either true or false.
    //
    // i.e:
    // {P: true, Q: false}
    public static class BooleanVariableMap extends BuilderHashMap<String, Boolean, BooleanVariableMap> {
        @Override
        public String toString() {
            List<String> pairs = new ArrayList<>();

            for(var key : keySet()) {
                pairs.add(key + ": " + get(key));
            }

            return "{" + String.join(", ", pairs) + "}";
        }
    }

    // Builder classes:
    public static class BuilderHashMap<K, V, T> extends HashMap<K, V> {
        public BuilderHashMap() {
            super();
        }

        public BuilderHashMap(Map<? extends K, ? extends V> m) {
            super(m);
        }

        public T newEntry(K key, V val) {
            super.put(key, val);
            return (T)this;
        }
    }

    @Override
    public String toString() {
        return """
                Universe of Discourse: %s
                Boolean variable map: %s
                Predicate truth map: %s
                Predicate varibale map: %s"""
                .formatted(
                        universeOfDiscourse != null ? universeOfDiscourse.toString() : "NONE",
                        booleanVariableMap != null ? booleanVariableMap.toString() : "NONE",
                        predicateTruthMap != null ? predicateTruthMap.toString() : "NONE",
                        predicateVariableMap != null ? predicateVariableMap.toString() : "NONE");
    }
}
