package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iea  reason: default package */
/* loaded from: classes.dex */
public final class iea {
    public static final iea a;
    public static final iea b;
    public static final iea c;
    public static final iea d;
    public static final iea e;
    public static final /* synthetic */ iea[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, iea] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, iea] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, iea] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, iea] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, iea] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, iea] */
    static {
        ?? r0 = new Enum("Verbose", 0);
        a = r0;
        ?? r1 = new Enum("Debug", 1);
        b = r1;
        ?? r2 = new Enum("Info", 2);
        c = r2;
        ?? r3 = new Enum("Warn", 3);
        d = r3;
        ?? r4 = new Enum("Error", 4);
        e = r4;
        f = new iea[]{r0, r1, r2, r3, r4, new Enum("Assert", 5)};
    }

    public static iea valueOf(String str) {
        return (iea) Enum.valueOf(iea.class, str);
    }

    public static iea[] values() {
        return (iea[]) f.clone();
    }
}
