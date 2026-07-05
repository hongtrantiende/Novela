package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pn3  reason: default package */
/* loaded from: classes.dex */
public final class pn3 {
    public static final pn3 a;
    public static final pn3 b;
    public static final pn3 c;
    public static final pn3 d;
    public static final /* synthetic */ pn3[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pn3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pn3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, pn3] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, pn3] */
    static {
        ?? r0 = new Enum("NONE", 0);
        a = r0;
        ?? r1 = new Enum("START", 1);
        b = r1;
        ?? r2 = new Enum("END", 2);
        c = r2;
        ?? r3 = new Enum("BOTH", 3);
        d = r3;
        e = new pn3[]{r0, r1, r2, r3};
    }

    public static pn3 valueOf(String str) {
        return (pn3) Enum.valueOf(pn3.class, str);
    }

    public static pn3[] values() {
        return (pn3[]) e.clone();
    }
}
