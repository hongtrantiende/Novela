package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k4f  reason: default package */
/* loaded from: classes.dex */
public final class k4f {
    public static final k4f a;
    public static final k4f b;
    public static final /* synthetic */ k4f[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, k4f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, k4f] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, k4f] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, k4f] */
    static {
        ?? r0 = new Enum("CONSENT", 0);
        a = r0;
        ?? r1 = new Enum("LEGITIMATE_INTEREST", 1);
        ?? r2 = new Enum("FLEXIBLE_CONSENT", 2);
        ?? r3 = new Enum("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        b = r3;
        c = new k4f[]{r0, r1, r2, r3};
    }

    public static k4f[] values() {
        return (k4f[]) c.clone();
    }
}
