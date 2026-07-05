package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ph1  reason: default package */
/* loaded from: classes3.dex */
public final class ph1 {
    public static final ph1 a;
    public static final ph1 b;
    public static final ph1 c;
    public static final /* synthetic */ ph1[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ph1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ph1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ph1] */
    static {
        ?? r0 = new Enum("PKCS7", 0);
        a = r0;
        ?? r1 = new Enum("ZERO", 1);
        b = r1;
        ?? r2 = new Enum("NONE", 2);
        c = r2;
        d = new ph1[]{r0, r1, r2};
    }

    public static ph1 valueOf(String str) {
        return (ph1) Enum.valueOf(ph1.class, str);
    }

    public static ph1[] values() {
        return (ph1[]) d.clone();
    }
}
