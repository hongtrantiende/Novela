package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tc3  reason: default package */
/* loaded from: classes.dex */
public final class tc3 {
    public static final tc3 a;
    public static final tc3 b;
    public static final /* synthetic */ tc3[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, tc3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, tc3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, tc3] */
    static {
        ?? r0 = new Enum("noQuirks", 0);
        a = r0;
        ?? r1 = new Enum("quirks", 1);
        b = r1;
        c = new tc3[]{r0, r1, new Enum("limitedQuirks", 2)};
    }

    public static tc3 valueOf(String str) {
        return (tc3) Enum.valueOf(tc3.class, str);
    }

    public static tc3[] values() {
        return (tc3[]) c.clone();
    }
}
