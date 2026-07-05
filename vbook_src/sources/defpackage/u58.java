package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u58  reason: default package */
/* loaded from: classes3.dex */
public final class u58 {
    public static final /* synthetic */ u58[] C;
    public static final u58 a;
    public static final u58 b;
    public static final u58 c;
    public static final u58 d;
    public static final u58 e;
    public static final u58 f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, u58] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, u58] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, u58] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, u58] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, u58] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, u58] */
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
        C = new u58[]{r0, r1, r2, r3, r4, r5};
    }

    public static u58 valueOf(String str) {
        return (u58) Enum.valueOf(u58.class, str);
    }

    public static u58[] values() {
        return (u58[]) C.clone();
    }
}
