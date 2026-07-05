package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zj2  reason: default package */
/* loaded from: classes3.dex */
public final class zj2 {
    public static final /* synthetic */ zj2[] a;
    public static final /* synthetic */ qu3 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [zj2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [zj2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [zj2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [zj2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [zj2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [zj2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [zj2, java.lang.Enum] */
    static {
        zj2[] zj2VarArr = {new Enum("MONDAY", 0), new Enum("TUESDAY", 1), new Enum("WEDNESDAY", 2), new Enum("THURSDAY", 3), new Enum("FRIDAY", 4), new Enum("SATURDAY", 5), new Enum("SUNDAY", 6)};
        a = zj2VarArr;
        b = new qu3(zj2VarArr);
    }

    public static zj2 valueOf(String str) {
        return (zj2) Enum.valueOf(zj2.class, str);
    }

    public static zj2[] values() {
        return (zj2[]) a.clone();
    }
}
