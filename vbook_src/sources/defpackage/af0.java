package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: af0  reason: default package */
/* loaded from: classes.dex */
public final class af0 {
    public static final af0 a;
    public static final af0 b;
    public static final /* synthetic */ af0[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, af0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, af0] */
    static {
        ?? r0 = new Enum("LEFT", 0);
        a = r0;
        ?? r1 = new Enum("RIGHT", 1);
        b = r1;
        c = new af0[]{r0, r1};
    }

    public static af0 valueOf(String str) {
        return (af0) Enum.valueOf(af0.class, str);
    }

    public static af0[] values() {
        return (af0[]) c.clone();
    }
}
