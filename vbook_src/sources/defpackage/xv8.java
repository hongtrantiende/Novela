package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xv8  reason: default package */
/* loaded from: classes3.dex */
public final class xv8 {
    public static final xv8 a;
    public static final xv8 b;
    public static final /* synthetic */ xv8[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xv8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xv8] */
    static {
        ?? r0 = new Enum("NORTH", 0);
        a = r0;
        ?? r1 = new Enum("SOUTH", 1);
        b = r1;
        c = new xv8[]{r0, r1};
    }

    public static xv8 valueOf(String str) {
        return (xv8) Enum.valueOf(xv8.class, str);
    }

    public static xv8[] values() {
        return (xv8[]) c.clone();
    }
}
