package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zg0  reason: default package */
/* loaded from: classes3.dex */
public final class zg0 {
    public static final zg0 a;
    public static final zg0 b;
    public static final zg0 c;
    public static final /* synthetic */ zg0[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [zg0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [zg0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [zg0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [zg0, java.lang.Enum] */
    static {
        ?? r0 = new Enum("PRESENT", 0);
        a = r0;
        ?? r1 = new Enum("ABSENT", 1);
        b = r1;
        ?? r2 = new Enum("PRESENT_OPTIONAL", 2);
        c = r2;
        d = new zg0[]{r0, r1, r2, new Enum("ABSENT_OPTIONAL", 3)};
    }

    public static zg0 valueOf(String str) {
        return (zg0) Enum.valueOf(zg0.class, str);
    }

    public static zg0[] values() {
        return (zg0[]) d.clone();
    }
}
