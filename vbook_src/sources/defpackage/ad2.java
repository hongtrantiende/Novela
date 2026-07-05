package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ad2  reason: default package */
/* loaded from: classes.dex */
public final class ad2 {
    public static final ad2 a;
    public static final ad2 b;
    public static final /* synthetic */ ad2[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ad2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ad2] */
    static {
        ?? r0 = new Enum("PreparingImage", 0);
        a = r0;
        ?? r1 = new Enum("SavingResult", 1);
        b = r1;
        c = new ad2[]{r0, r1};
    }

    public static ad2 valueOf(String str) {
        return (ad2) Enum.valueOf(ad2.class, str);
    }

    public static ad2[] values() {
        return (ad2[]) c.clone();
    }
}
