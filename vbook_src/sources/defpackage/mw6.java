package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mw6  reason: default package */
/* loaded from: classes.dex */
public final class mw6 {
    public static final mw6 a;
    public static final mw6 b;
    public static final mw6 c;
    public static final mw6 d;
    public static final /* synthetic */ mw6[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, mw6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, mw6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, mw6] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, mw6] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, mw6] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, mw6] */
    static {
        ?? r0 = new Enum("Verbose", 0);
        a = r0;
        ?? r1 = new Enum("Debug", 1);
        b = r1;
        ?? r2 = new Enum("Info", 2);
        c = r2;
        ?? r3 = new Enum("Warn", 3);
        ?? r4 = new Enum("Error", 4);
        d = r4;
        e = new mw6[]{r0, r1, r2, r3, r4, new Enum("Assert", 5)};
    }

    public static mw6 valueOf(String str) {
        return (mw6) Enum.valueOf(mw6.class, str);
    }

    public static mw6[] values() {
        return (mw6[]) e.clone();
    }
}
