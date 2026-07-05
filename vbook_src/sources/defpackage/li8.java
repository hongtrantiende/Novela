package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: li8  reason: default package */
/* loaded from: classes3.dex */
public final class li8 {
    public static final li8 a;
    public static final li8 b;
    public static final /* synthetic */ li8[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, li8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, li8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, li8] */
    static {
        ?? r0 = new Enum("Prev", 0);
        a = r0;
        ?? r1 = new Enum("Current", 1);
        ?? r2 = new Enum("Next", 2);
        b = r2;
        c = new li8[]{r0, r1, r2};
    }

    public static li8 valueOf(String str) {
        return (li8) Enum.valueOf(li8.class, str);
    }

    public static li8[] values() {
        return (li8[]) c.clone();
    }
}
