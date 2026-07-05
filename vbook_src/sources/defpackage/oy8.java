package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oy8  reason: default package */
/* loaded from: classes3.dex */
public final class oy8 {
    public static final oy8 C;
    public static final /* synthetic */ oy8[] D;
    public static final oy8 a;
    public static final oy8 b;
    public static final oy8 c;
    public static final oy8 d;
    public static final oy8 e;
    public static final oy8 f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, oy8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, oy8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, oy8] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, oy8] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, oy8] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, oy8] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, oy8] */
    static {
        ?? r0 = new Enum("LOADING", 0);
        a = r0;
        ?? r1 = new Enum("READY", 1);
        b = r1;
        ?? r2 = new Enum("PAUSED", 2);
        c = r2;
        ?? r3 = new Enum("PLAYING", 3);
        d = r3;
        ?? r4 = new Enum("PAUSED_BUFFERING", 4);
        e = r4;
        ?? r5 = new Enum("FINISHED", 5);
        f = r5;
        ?? r6 = new Enum("ERROR", 6);
        C = r6;
        D = new oy8[]{r0, r1, r2, r3, r4, r5, r6};
    }

    public static oy8 valueOf(String str) {
        return (oy8) Enum.valueOf(oy8.class, str);
    }

    public static oy8[] values() {
        return (oy8[]) D.clone();
    }
}
