package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i6a  reason: default package */
/* loaded from: classes3.dex */
public final class i6a {
    public static final i6a a;
    public static final i6a b;
    public static final i6a c;
    public static final /* synthetic */ i6a[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i6a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, i6a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, i6a] */
    static {
        ?? r0 = new Enum("Top", 0);
        a = r0;
        ?? r1 = new Enum("Bottom", 1);
        b = r1;
        ?? r2 = new Enum("None", 2);
        c = r2;
        d = new i6a[]{r0, r1, r2};
    }

    public static i6a valueOf(String str) {
        return (i6a) Enum.valueOf(i6a.class, str);
    }

    public static i6a[] values() {
        return (i6a[]) d.clone();
    }
}
