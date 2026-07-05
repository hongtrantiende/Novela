package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q38  reason: default package */
/* loaded from: classes.dex */
public final class q38 {
    public static final q38 a;
    public static final q38 b;
    public static final /* synthetic */ q38[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, q38] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, q38] */
    static {
        ?? r0 = new Enum("Min", 0);
        a = r0;
        ?? r1 = new Enum("Max", 1);
        b = r1;
        c = new q38[]{r0, r1};
    }

    public static q38 valueOf(String str) {
        return (q38) Enum.valueOf(q38.class, str);
    }

    public static q38[] values() {
        return (q38[]) c.clone();
    }
}
