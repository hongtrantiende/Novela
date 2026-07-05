package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bkf  reason: default package */
/* loaded from: classes.dex */
public final class bkf {
    public static final bkf a;
    public static final bkf b;
    public static final bkf c;
    public static final /* synthetic */ bkf[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, bkf] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, bkf] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, bkf] */
    static {
        ?? r0 = new Enum("NIST_P256", 0);
        a = r0;
        ?? r1 = new Enum("NIST_P384", 1);
        b = r1;
        ?? r2 = new Enum("NIST_P521", 2);
        c = r2;
        d = new bkf[]{r0, r1, r2};
    }

    public static bkf[] values() {
        return (bkf[]) d.clone();
    }
}
