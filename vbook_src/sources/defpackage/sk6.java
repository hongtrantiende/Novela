package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sk6  reason: default package */
/* loaded from: classes.dex */
public final class sk6 {
    public static final sk6 a;
    public static final sk6 b;
    public static final sk6 c;
    public static final /* synthetic */ sk6[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, sk6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, sk6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, sk6] */
    static {
        ?? r0 = new Enum("SYNCHRONIZED", 0);
        a = r0;
        ?? r1 = new Enum("PUBLICATION", 1);
        b = r1;
        ?? r2 = new Enum("NONE", 2);
        c = r2;
        d = new sk6[]{r0, r1, r2};
    }

    public static sk6 valueOf(String str) {
        return (sk6) Enum.valueOf(sk6.class, str);
    }

    public static sk6[] values() {
        return (sk6[]) d.clone();
    }
}
