package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: om  reason: default package */
/* loaded from: classes.dex */
public final class om {
    public static final om a;
    public static final om b;
    public static final /* synthetic */ om[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, om] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, om] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        ?? r1 = new Enum("SHOW_TRANSIENT_BARS_BY_SWIPE", 1);
        b = r1;
        c = new om[]{r0, r1};
    }

    public static om valueOf(String str) {
        return (om) Enum.valueOf(om.class, str);
    }

    public static om[] values() {
        return (om[]) c.clone();
    }
}
