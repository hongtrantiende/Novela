package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lh8  reason: default package */
/* loaded from: classes3.dex */
public final class lh8 {
    public static final lh8 a;
    public static final lh8 b;
    public static final /* synthetic */ lh8[] c;
    /* JADX INFO: Fake field, exist only in values array */
    lh8 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, lh8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, lh8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, lh8] */
    static {
        ?? r0 = new Enum("NONE", 0);
        ?? r1 = new Enum("ZERO", 1);
        a = r1;
        ?? r2 = new Enum("SPACE", 2);
        b = r2;
        c = new lh8[]{r0, r1, r2};
    }

    public static lh8 valueOf(String str) {
        return (lh8) Enum.valueOf(lh8.class, str);
    }

    public static lh8[] values() {
        return (lh8[]) c.clone();
    }
}
