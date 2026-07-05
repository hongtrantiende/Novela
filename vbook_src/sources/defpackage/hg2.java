package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hg2  reason: default package */
/* loaded from: classes.dex */
public final class hg2 {
    public static final hg2 a;
    public static final hg2 b;
    public static final hg2 c;
    public static final hg2 d;
    public static final /* synthetic */ hg2[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [hg2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [hg2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [hg2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [hg2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("MEMORY_CACHE", 0);
        a = r0;
        ?? r1 = new Enum("MEMORY", 1);
        b = r1;
        ?? r2 = new Enum("DISK", 2);
        c = r2;
        ?? r3 = new Enum("NETWORK", 3);
        d = r3;
        e = new hg2[]{r0, r1, r2, r3};
    }

    public static hg2 valueOf(String str) {
        return (hg2) Enum.valueOf(hg2.class, str);
    }

    public static hg2[] values() {
        return (hg2[]) e.clone();
    }
}
