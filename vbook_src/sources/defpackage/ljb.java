package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ljb  reason: default package */
/* loaded from: classes3.dex */
public final class ljb {
    public static final ljb a;
    public static final ljb b;
    public static final ljb c;
    public static final /* synthetic */ ljb[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ljb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ljb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ljb] */
    static {
        ?? r0 = new Enum("Tabs", 0);
        a = r0;
        ?? r1 = new Enum("Divider", 1);
        b = r1;
        ?? r2 = new Enum("Indicator", 2);
        c = r2;
        d = new ljb[]{r0, r1, r2};
    }

    public static ljb valueOf(String str) {
        return (ljb) Enum.valueOf(ljb.class, str);
    }

    public static ljb[] values() {
        return (ljb[]) d.clone();
    }
}
