package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c69  reason: default package */
/* loaded from: classes.dex */
public final class c69 {
    public static final c69 a;
    public static final c69 b;
    public static final c69 c;
    public static final /* synthetic */ c69[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c69] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c69] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, c69] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        ?? r1 = new Enum("VERY_LOW", 1);
        b = r1;
        ?? r2 = new Enum("HIGHEST", 2);
        c = r2;
        d = new c69[]{r0, r1, r2};
    }

    public static c69 valueOf(String str) {
        return (c69) Enum.valueOf(c69.class, str);
    }

    public static c69[] values() {
        return (c69[]) d.clone();
    }
}
