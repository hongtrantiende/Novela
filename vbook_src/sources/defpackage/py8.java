package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: py8  reason: default package */
/* loaded from: classes.dex */
public final class py8 {
    public static final py8 C;
    public static final py8 D;
    public static final /* synthetic */ py8[] E;
    public static final py8 a;
    public static final py8 b;
    public static final py8 c;
    public static final py8 d;
    public static final py8 e;
    public static final py8 f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, py8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, py8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, py8] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, py8] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, py8] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, py8] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, py8] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, py8] */
    static {
        ?? r0 = new Enum("DESTROYED", 0);
        a = r0;
        ?? r1 = new Enum("ERROR", 1);
        b = r1;
        ?? r2 = new Enum("CREATED", 2);
        c = r2;
        ?? r3 = new Enum("FINISHED", 3);
        d = r3;
        ?? r4 = new Enum("READY", 4);
        e = r4;
        ?? r5 = new Enum("PAUSED", 5);
        f = r5;
        ?? r6 = new Enum("PLAYING", 6);
        C = r6;
        ?? r7 = new Enum("PAUSED_BUFFERING", 7);
        D = r7;
        E = new py8[]{r0, r1, r2, r3, r4, r5, r6, r7};
    }

    public static py8 valueOf(String str) {
        return (py8) Enum.valueOf(py8.class, str);
    }

    public static py8[] values() {
        return (py8[]) E.clone();
    }
}
