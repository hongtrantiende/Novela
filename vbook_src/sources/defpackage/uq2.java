package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uq2  reason: default package */
/* loaded from: classes3.dex */
public final class uq2 {
    public static final uq2 a;
    public static final uq2 b;
    public static final uq2 c;
    public static final /* synthetic */ uq2[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, uq2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, uq2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, uq2] */
    static {
        ?? r0 = new Enum("WHITESPACE_SEPARATED", 0);
        a = r0;
        ?? r1 = new Enum("ARRAY_WRAPPED", 1);
        b = r1;
        ?? r2 = new Enum("AUTO_DETECT", 2);
        c = r2;
        d = new uq2[]{r0, r1, r2};
    }

    public static uq2 valueOf(String str) {
        return (uq2) Enum.valueOf(uq2.class, str);
    }

    public static uq2[] values() {
        return (uq2[]) d.clone();
    }
}
