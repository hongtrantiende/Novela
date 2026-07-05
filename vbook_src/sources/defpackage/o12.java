package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o12  reason: default package */
/* loaded from: classes.dex */
public final class o12 {
    public static final o12 a;
    public static final o12 b;
    public static final /* synthetic */ o12[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [o12, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o12, java.lang.Enum] */
    static {
        ?? r0 = new Enum("VIEW_APPEAR", 0);
        a = r0;
        ?? r1 = new Enum("VIEW_DISAPPEAR", 1);
        b = r1;
        c = new o12[]{r0, r1};
    }

    public static o12 valueOf(String str) {
        return (o12) Enum.valueOf(o12.class, str);
    }

    public static o12[] values() {
        return (o12[]) c.clone();
    }
}
