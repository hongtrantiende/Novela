package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fu3  reason: default package */
/* loaded from: classes.dex */
public final class fu3 {
    public static final kh5 a;
    public static final fu3 b;
    public static final fu3 c;
    public static final fu3 d;
    public static final /* synthetic */ fu3[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, fu3] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, fu3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, fu3] */
    static {
        ?? r0 = new Enum("ascii", 0);
        b = r0;
        ?? r1 = new Enum("utf", 1);
        c = r1;
        ?? r2 = new Enum("fallback", 2);
        d = r2;
        e = new fu3[]{r0, r1, r2};
        a = new Object();
    }

    public static fu3 valueOf(String str) {
        return (fu3) Enum.valueOf(fu3.class, str);
    }

    public static fu3[] values() {
        return (fu3[]) e.clone();
    }
}
