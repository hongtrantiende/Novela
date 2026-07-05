package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: so8  reason: default package */
/* loaded from: classes.dex */
public final class so8 {
    public static final so8 C;
    public static final /* synthetic */ so8[] D;
    public static final so8 a;
    public static final so8 b;
    public static final so8 c;
    public static final so8 d;
    public static final so8 e;
    public static final so8 f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, so8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, so8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, so8] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, so8] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, so8] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, so8] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, so8] */
    static {
        ?? r0 = new Enum("Invalid", 0);
        a = r0;
        ?? r1 = new Enum("Cancelled", 1);
        b = r1;
        ?? r2 = new Enum("InitialPending", 2);
        c = r2;
        ?? r3 = new Enum("RecomposePending", 3);
        d = r3;
        ?? r4 = new Enum("Recomposing", 4);
        e = r4;
        ?? r5 = new Enum("ApplyPending", 5);
        f = r5;
        ?? r6 = new Enum("Applied", 6);
        C = r6;
        D = new so8[]{r0, r1, r2, r3, r4, r5, r6};
    }

    public static so8 valueOf(String str) {
        return (so8) Enum.valueOf(so8.class, str);
    }

    public static so8[] values() {
        return (so8[]) D.clone();
    }
}
