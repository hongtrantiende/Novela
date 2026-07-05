package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hz9  reason: default package */
/* loaded from: classes.dex */
public final class hz9 {
    public static final hz9 a;
    public static final hz9 b;
    public static final /* synthetic */ hz9[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, hz9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, hz9] */
    static {
        ?? r0 = new Enum("FILL", 0);
        a = r0;
        ?? r1 = new Enum("FIT", 1);
        b = r1;
        c = new hz9[]{r0, r1};
    }

    public static hz9 valueOf(String str) {
        return (hz9) Enum.valueOf(hz9.class, str);
    }

    public static hz9[] values() {
        return (hz9[]) c.clone();
    }
}
