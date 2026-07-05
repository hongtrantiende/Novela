package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lb4  reason: default package */
/* loaded from: classes.dex */
public final class lb4 {
    public static final lb4 a;
    public static final lb4 b;
    public static final lb4 c;
    public static final lb4 d;
    public static final lb4 e;
    public static final /* synthetic */ lb4[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, lb4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, lb4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, lb4] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, lb4] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, lb4] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, lb4] */
    static {
        ?? r0 = new Enum("SlideShow", 0);
        a = r0;
        ?? r1 = new Enum("NightMode", 1);
        b = r1;
        ?? r2 = new Enum("PageNavigation", 2);
        c = r2;
        ?? r3 = new Enum("ScrollMode", 3);
        d = r3;
        ?? r4 = new Enum("Print", 4);
        e = r4;
        f = new lb4[]{r0, r1, r2, r3, r4, new Enum("Edit", 5)};
    }

    public static lb4 valueOf(String str) {
        return (lb4) Enum.valueOf(lb4.class, str);
    }

    public static lb4[] values() {
        return (lb4[]) f.clone();
    }
}
