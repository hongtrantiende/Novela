package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ur7  reason: default package */
/* loaded from: classes.dex */
public final class ur7 {
    public static final ur7 a;
    public static final ur7 b;
    public static final ur7 c;
    public static final ur7 d;
    public static final ur7 e;
    public static final /* synthetic */ ur7[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ur7] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ur7] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ur7] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ur7] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, ur7] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, ur7] */
    static {
        ?? r0 = new Enum("DefaultSpatial", 0);
        a = r0;
        ?? r1 = new Enum("FastSpatial", 1);
        b = r1;
        ?? r2 = new Enum("SlowSpatial", 2);
        ?? r3 = new Enum("DefaultEffects", 3);
        c = r3;
        ?? r4 = new Enum("FastEffects", 4);
        d = r4;
        ?? r5 = new Enum("SlowEffects", 5);
        e = r5;
        f = new ur7[]{r0, r1, r2, r3, r4, r5};
    }

    public static ur7 valueOf(String str) {
        return (ur7) Enum.valueOf(ur7.class, str);
    }

    public static ur7[] values() {
        return (ur7[]) f.clone();
    }
}
