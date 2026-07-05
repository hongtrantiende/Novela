package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ik9  reason: default package */
/* loaded from: classes.dex */
public final class ik9 {
    public static final /* synthetic */ ik9[] C;
    public static final ik9 a;
    public static final ik9 b;
    public static final ik9 c;
    public static final ik9 d;
    public static final ik9 e;
    public static final ik9 f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ik9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ik9] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ik9] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ik9] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, ik9] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, ik9] */
    static {
        ?? r0 = new Enum("ShutDown", 0);
        a = r0;
        ?? r1 = new Enum("ShuttingDown", 1);
        b = r1;
        ?? r2 = new Enum("Inactive", 2);
        c = r2;
        ?? r3 = new Enum("InactivePendingWork", 3);
        d = r3;
        ?? r4 = new Enum("Idle", 4);
        e = r4;
        ?? r5 = new Enum("PendingWork", 5);
        f = r5;
        C = new ik9[]{r0, r1, r2, r3, r4, r5};
    }

    public static ik9 valueOf(String str) {
        return (ik9) Enum.valueOf(ik9.class, str);
    }

    public static ik9[] values() {
        return (ik9[]) C.clone();
    }
}
