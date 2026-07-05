package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oq9  reason: default package */
/* loaded from: classes.dex */
public final class oq9 {
    public static final oq9 a;
    public static final oq9 b;
    public static final /* synthetic */ oq9[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, oq9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, oq9] */
    static {
        ?? r0 = new Enum("Ltr", 0);
        a = r0;
        ?? r1 = new Enum("Rtl", 1);
        b = r1;
        c = new oq9[]{r0, r1};
    }

    public static oq9 valueOf(String str) {
        return (oq9) Enum.valueOf(oq9.class, str);
    }

    public static oq9[] values() {
        return (oq9[]) c.clone();
    }
}
