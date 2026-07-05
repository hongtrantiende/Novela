package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lt4  reason: default package */
/* loaded from: classes.dex */
public final class lt4 {
    public static final lt4 a;
    public static final lt4 b;
    public static final lt4 c;
    public static final lt4 d;
    public static final lt4 e;
    public static final /* synthetic */ lt4[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, lt4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, lt4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, lt4] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, lt4] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, lt4] */
    static {
        ?? r0 = new Enum("ON_CONFIGURE", 0);
        a = r0;
        ?? r1 = new Enum("ON_CREATE", 1);
        b = r1;
        ?? r2 = new Enum("ON_UPGRADE", 2);
        c = r2;
        ?? r3 = new Enum("ON_DOWNGRADE", 3);
        d = r3;
        ?? r4 = new Enum("ON_OPEN", 4);
        e = r4;
        f = new lt4[]{r0, r1, r2, r3, r4};
    }

    public static lt4 valueOf(String str) {
        return (lt4) Enum.valueOf(lt4.class, str);
    }

    public static lt4[] values() {
        return (lt4[]) f.clone();
    }
}
