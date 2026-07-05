package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zc1  reason: default package */
/* loaded from: classes3.dex */
public final class zc1 {
    public static final zc1 a;
    public static final zc1 b;
    public static final zc1 c;
    public static final /* synthetic */ zc1[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zc1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zc1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, zc1] */
    static {
        ?? r0 = new Enum("DETECTING", 0);
        a = r0;
        ?? r1 = new Enum("FOUND_IT", 1);
        b = r1;
        ?? r2 = new Enum("NOT_ME", 2);
        c = r2;
        d = new zc1[]{r0, r1, r2};
    }

    public static zc1 valueOf(String str) {
        return (zc1) Enum.valueOf(zc1.class, str);
    }

    public static zc1[] values() {
        return (zc1[]) d.clone();
    }
}
