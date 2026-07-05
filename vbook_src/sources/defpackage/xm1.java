package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xm1  reason: default package */
/* loaded from: classes3.dex */
public final class xm1 {
    public static final tn3 a;
    public static final xm1 b;
    public static final xm1 c;
    public static final xm1 d;
    public static final /* synthetic */ xm1[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xm1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xm1] */
    static {
        ?? r0 = new Enum("SPEC_2021", 0);
        c = r0;
        ?? r1 = new Enum("SPEC_2025", 1);
        d = r1;
        e = new xm1[]{r0, r1};
        a = new tn3(19);
        b = r0;
    }

    public static xm1 valueOf(String str) {
        return (xm1) Enum.valueOf(xm1.class, str);
    }

    public static xm1[] values() {
        return (xm1[]) e.clone();
    }
}
