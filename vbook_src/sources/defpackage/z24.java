package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z24  reason: default package */
/* loaded from: classes3.dex */
public final class z24 {
    public static final z24 a;
    public static final z24 b;
    public static final z24 c;
    public static final /* synthetic */ z24[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z24] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z24] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, z24] */
    static {
        ?? r0 = new Enum("InProgress", 0);
        a = r0;
        ?? r1 = new Enum("Completed", 1);
        b = r1;
        ?? r2 = new Enum("Failed", 2);
        c = r2;
        d = new z24[]{r0, r1, r2};
    }

    public static z24 valueOf(String str) {
        return (z24) Enum.valueOf(z24.class, str);
    }

    public static z24[] values() {
        return (z24[]) d.clone();
    }
}
