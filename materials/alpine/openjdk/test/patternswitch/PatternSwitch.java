public class PatternSwitch {
    public static String formatterPatternSwitch(Object o) {
        return switch (o) {
            case Integer i -> String.format("int %d", i);
            case Long l    -> String.format("long %d", l);
            case Double d  -> String.format("double %f", d);
            case String s  -> String.format("String %s", s);
            default        -> o.toString();
        };
    }
    public static void main(String[] args) {
        System.out.println(formatterPatternSwitch(12345));
        System.out.println(formatterPatternSwitch(1234567890L));
        System.out.println(formatterPatternSwitch(1.3));
        System.out.println(formatterPatternSwitch("234"));
    }
}

