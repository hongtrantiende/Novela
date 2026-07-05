package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tc6  reason: default package */
/* loaded from: classes.dex */
public final class tc6 {
    public static final tc6 a;
    public static final tc6 b;
    public static final /* synthetic */ tc6[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, tc6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, tc6] */
    static {
        ?? r0 = new Enum("Ltr", 0);
        a = r0;
        ?? r1 = new Enum("Rtl", 1);
        b = r1;
        c = new tc6[]{r0, r1};
    }

    public static tc6 valueOf(String str) {
        return (tc6) Enum.valueOf(tc6.class, str);
    }

    public static tc6[] values() {
        return (tc6[]) c.clone();
    }
}
