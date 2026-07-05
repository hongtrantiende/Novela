package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y6a  reason: default package */
/* loaded from: classes.dex */
public final class y6a {
    public static final y6a a;
    public static final y6a b;
    public static final y6a c;
    public static final /* synthetic */ y6a[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, y6a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, y6a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, y6a] */
    static {
        ?? r0 = new Enum("Left", 0);
        a = r0;
        ?? r1 = new Enum("Middle", 1);
        b = r1;
        ?? r2 = new Enum("Right", 2);
        c = r2;
        d = new y6a[]{r0, r1, r2};
    }

    public static y6a valueOf(String str) {
        return (y6a) Enum.valueOf(y6a.class, str);
    }

    public static y6a[] values() {
        return (y6a[]) d.clone();
    }
}
