package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dr6  reason: default package */
/* loaded from: classes.dex */
public final class dr6 {
    public static final dr6 a;
    public static final dr6 b;
    public static final /* synthetic */ dr6[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, dr6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, dr6] */
    static {
        ?? r0 = new Enum("ORDERED", 0);
        a = r0;
        ?? r1 = new Enum("UNORDERED", 1);
        b = r1;
        c = new dr6[]{r0, r1};
    }

    public static dr6 valueOf(String str) {
        return (dr6) Enum.valueOf(dr6.class, str);
    }

    public static dr6[] values() {
        return (dr6[]) c.clone();
    }
}
