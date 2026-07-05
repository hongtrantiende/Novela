package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jn6  reason: default package */
/* loaded from: classes.dex */
public final class jn6 {
    private static final /* synthetic */ pu3 $ENTRIES;
    private static final /* synthetic */ jn6[] $VALUES;
    public static final hn6 Companion;
    public static final jn6 ON_ANY;
    public static final jn6 ON_CREATE;
    public static final jn6 ON_DESTROY;
    public static final jn6 ON_PAUSE;
    public static final jn6 ON_RESUME;
    public static final jn6 ON_START;
    public static final jn6 ON_STOP;

    /* JADX WARN: Type inference failed for: r0v0, types: [jn6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v2, types: [hn6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [jn6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [jn6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [jn6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [jn6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [jn6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [jn6, java.lang.Enum] */
    static {
        ?? r0 = new Enum("ON_CREATE", 0);
        ON_CREATE = r0;
        ?? r1 = new Enum("ON_START", 1);
        ON_START = r1;
        ?? r2 = new Enum("ON_RESUME", 2);
        ON_RESUME = r2;
        ?? r3 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r3;
        ?? r4 = new Enum("ON_STOP", 4);
        ON_STOP = r4;
        ?? r5 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r5;
        ?? r6 = new Enum("ON_ANY", 6);
        ON_ANY = r6;
        jn6[] jn6VarArr = {r0, r1, r2, r3, r4, r5, r6};
        $VALUES = jn6VarArr;
        $ENTRIES = new qu3(jn6VarArr);
        Companion = new Object();
    }

    public static jn6 valueOf(String str) {
        return (jn6) Enum.valueOf(jn6.class, str);
    }

    public static jn6[] values() {
        return (jn6[]) $VALUES.clone();
    }

    public final kn6 a() {
        switch (in6.a[ordinal()]) {
            case 1:
            case 2:
                return kn6.c;
            case 3:
            case 4:
                return kn6.d;
            case 5:
                return kn6.e;
            case 6:
                return kn6.a;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                xk5.o();
                return null;
        }
    }
}
