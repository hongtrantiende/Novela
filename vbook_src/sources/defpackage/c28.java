package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c28  reason: default package */
/* loaded from: classes.dex */
public final class c28 {
    public static final /* synthetic */ c28[] C;
    public static final c28 a;
    public static final c28 b;
    public static final c28 c;
    public static final c28 d;
    public static final c28 e;
    public static final c28 f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c28] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c28] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, c28] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, c28] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, c28] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, c28] */
    static {
        ?? r0 = new Enum("NOT_REQUIRED", 0);
        a = r0;
        ?? r1 = new Enum("CONNECTED", 1);
        b = r1;
        ?? r2 = new Enum("UNMETERED", 2);
        c = r2;
        ?? r3 = new Enum("NOT_ROAMING", 3);
        d = r3;
        ?? r4 = new Enum("METERED", 4);
        e = r4;
        ?? r5 = new Enum("TEMPORARILY_UNMETERED", 5);
        f = r5;
        C = new c28[]{r0, r1, r2, r3, r4, r5};
    }

    public static c28 valueOf(String str) {
        return (c28) Enum.valueOf(c28.class, str);
    }

    public static c28[] values() {
        return (c28[]) C.clone();
    }
}
