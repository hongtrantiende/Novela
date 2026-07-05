package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oba  reason: default package */
/* loaded from: classes3.dex */
public final class oba {
    public static final oba a;
    public static final oba b;
    public static final /* synthetic */ oba[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, oba] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, oba] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, oba] */
    static {
        ?? r0 = new Enum("CRASHLYTICS", 0);
        a = r0;
        ?? r1 = new Enum("PERFORMANCE", 1);
        b = r1;
        c = new oba[]{r0, r1, new Enum("MATT_SAYS_HI", 2)};
    }

    public static oba valueOf(String str) {
        return (oba) Enum.valueOf(oba.class, str);
    }

    public static oba[] values() {
        return (oba[]) c.clone();
    }
}
