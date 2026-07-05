package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ofc  reason: default package */
/* loaded from: classes.dex */
public final class ofc {
    public static final ofc a;
    public static final ofc b;
    public static final ofc c;
    public static final ofc d;
    public static final ofc e;
    public static final /* synthetic */ ofc[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ofc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ofc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ofc] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ofc] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, ofc] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, ofc] */
    static {
        ?? r0 = new Enum("DARKER", 0);
        a = r0;
        ?? r1 = new Enum("LIGHTER", 1);
        b = r1;
        ?? r2 = new Enum("RELATIVE_DARKER", 2);
        c = r2;
        ?? r3 = new Enum("RELATIVE_LIGHTER", 3);
        d = r3;
        ?? r4 = new Enum("NEARER", 4);
        e = r4;
        f = new ofc[]{r0, r1, r2, r3, r4, new Enum("FARTHER", 5)};
    }

    public static ofc valueOf(String str) {
        return (ofc) Enum.valueOf(ofc.class, str);
    }

    public static ofc[] values() {
        return (ofc[]) f.clone();
    }
}
