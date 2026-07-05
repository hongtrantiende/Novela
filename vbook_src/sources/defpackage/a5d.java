package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a5d  reason: default package */
/* loaded from: classes.dex */
public final class a5d {
    public static final a5d a;
    public static final a5d b;
    public static final /* synthetic */ a5d[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [a5d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [a5d, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Lsq2", 0);
        a = r0;
        ?? r1 = new Enum("Impulse", 1);
        b = r1;
        c = new a5d[]{r0, r1};
    }

    public static a5d valueOf(String str) {
        return (a5d) Enum.valueOf(a5d.class, str);
    }

    public static a5d[] values() {
        return (a5d[]) c.clone();
    }
}
