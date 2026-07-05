package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n29  reason: default package */
/* loaded from: classes3.dex */
public final class n29 {
    public static final n29 a;
    public static final n29 b;
    public static final n29 c;
    public static final /* synthetic */ n29[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, n29] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, n29] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, n29] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, n29] */
    static {
        ?? r0 = new Enum("Start", 0);
        a = r0;
        ?? r1 = new Enum("End", 1);
        b = r1;
        ?? r2 = new Enum("Top", 2);
        c = r2;
        d = new n29[]{r0, r1, r2, new Enum("Bottom", 3)};
    }

    public static n29 valueOf(String str) {
        return (n29) Enum.valueOf(n29.class, str);
    }

    public static n29[] values() {
        return (n29[]) d.clone();
    }
}
