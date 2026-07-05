package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xq8  reason: default package */
/* loaded from: classes3.dex */
public final class xq8 {
    public static final xq8 a;
    public static final xq8 b;
    public static final /* synthetic */ xq8[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xq8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xq8] */
    static {
        ?? r0 = new Enum("Top", 0);
        a = r0;
        ?? r1 = new Enum("Bottom", 1);
        b = r1;
        c = new xq8[]{r0, r1};
    }

    public static xq8 valueOf(String str) {
        return (xq8) Enum.valueOf(xq8.class, str);
    }

    public static xq8[] values() {
        return (xq8[]) c.clone();
    }
}
