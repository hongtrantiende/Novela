package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: med  reason: default package */
/* loaded from: classes.dex */
public final class med {
    public static final med a;
    public static final /* synthetic */ med[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, med] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, med] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, med] */
    static {
        ?? r0 = new Enum("Visible", 0);
        a = r0;
        b = new med[]{r0, new Enum("Invisible", 1), new Enum("Gone", 2)};
    }

    public static med valueOf(String str) {
        return (med) Enum.valueOf(med.class, str);
    }

    public static med[] values() {
        return (med[]) b.clone();
    }
}
