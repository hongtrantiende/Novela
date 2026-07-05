package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wrb  reason: default package */
/* loaded from: classes.dex */
public final class wrb {
    public static final wrb a;
    public static final wrb b;
    public static final /* synthetic */ wrb[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wrb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wrb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, wrb] */
    static {
        ?? r0 = new Enum("MergeIfPossible", 0);
        a = r0;
        ?? r1 = new Enum("ClearHistory", 1);
        ?? r2 = new Enum("NeverMerge", 2);
        b = r2;
        c = new wrb[]{r0, r1, r2};
    }

    public static wrb valueOf(String str) {
        return (wrb) Enum.valueOf(wrb.class, str);
    }

    public static wrb[] values() {
        return (wrb[]) c.clone();
    }
}
