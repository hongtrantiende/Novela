package nl.adaptivity.xmlutil;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public abstract class EventType {
    private static final /* synthetic */ pu3 $ENTRIES;
    private static final /* synthetic */ EventType[] $VALUES;
    public static final EventType START_DOCUMENT = new EventType("START_DOCUMENT", 0, null);
    public static final EventType START_ELEMENT = new EventType("START_ELEMENT", 1, null);
    public static final EventType END_ELEMENT = new EventType("END_ELEMENT", 2, null);
    public static final EventType COMMENT = new EventType("COMMENT", 3, null);
    public static final EventType TEXT = new EventType("TEXT", 4, null);
    public static final EventType CDSECT = new EventType("CDSECT", 5, null);
    public static final EventType DOCDECL = new EventType("DOCDECL", 6, null);
    public static final EventType END_DOCUMENT = new EventType("END_DOCUMENT", 7, null);
    public static final EventType ENTITY_REF = new EventType("ENTITY_REF", 8, null);
    public static final EventType IGNORABLE_WHITESPACE = new EventType("IGNORABLE_WHITESPACE", 9, null);
    public static final EventType ATTRIBUTE = new EventType("ATTRIBUTE", 10, null);
    public static final EventType PROCESSING_INSTRUCTION = new EventType("PROCESSING_INSTRUCTION", 11, null);

    private static final /* synthetic */ EventType[] $values() {
        return new EventType[]{START_DOCUMENT, START_ELEMENT, END_ELEMENT, COMMENT, TEXT, CDSECT, DOCDECL, END_DOCUMENT, ENTITY_REF, IGNORABLE_WHITESPACE, ATTRIBUTE, PROCESSING_INSTRUCTION};
    }

    static {
        EventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = dye.k($values);
    }

    public /* synthetic */ EventType(String str, int i, ct2 ct2Var) {
        this(str, i);
    }

    public static pu3 getEntries() {
        return $ENTRIES;
    }

    public static EventType valueOf(String str) {
        return (EventType) Enum.valueOf(EventType.class, str);
    }

    public static EventType[] values() {
        return (EventType[]) $VALUES.clone();
    }

    public abstract xod createEvent(zod zodVar);

    public boolean isIgnorable() {
        return false;
    }

    public boolean isTextElement() {
        return false;
    }

    public void writeEvent(epd epdVar, wod wodVar) {
        epdVar.getClass();
        wodVar.getClass();
        throw new UnsupportedOperationException("This is not generally supported, only by text types");
    }

    public abstract void writeEvent(epd epdVar, zod zodVar);

    private EventType(String str, int i) {
    }
}
