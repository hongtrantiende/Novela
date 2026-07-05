package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vo1  reason: default package */
/* loaded from: classes3.dex */
public final class vo1 {
    public static final /* synthetic */ vo1[] C;
    public static final vo1 a;
    public static final vo1 b;
    public static final vo1 c;
    public static final vo1 d;
    public static final vo1 e;
    public static final vo1 f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vo1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vo1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, vo1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, vo1] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, vo1] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, vo1] */
    static {
        ?? r0 = new Enum("Idle", 0);
        a = r0;
        ?? r1 = new Enum("Running", 1);
        b = r1;
        ?? r2 = new Enum("Paused", 2);
        c = r2;
        ?? r3 = new Enum("Canceled", 3);
        d = r3;
        ?? r4 = new Enum("Completed", 4);
        e = r4;
        ?? r5 = new Enum("Failed", 5);
        f = r5;
        C = new vo1[]{r0, r1, r2, r3, r4, r5};
    }

    public static vo1 valueOf(String str) {
        return (vo1) Enum.valueOf(vo1.class, str);
    }

    public static vo1[] values() {
        return (vo1[]) C.clone();
    }
}
