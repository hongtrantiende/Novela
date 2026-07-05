package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kn6  reason: default package */
/* loaded from: classes.dex */
public final class kn6 {
    public static final kn6 a;
    public static final kn6 b;
    public static final kn6 c;
    public static final kn6 d;
    public static final kn6 e;
    public static final /* synthetic */ kn6[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [kn6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kn6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kn6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kn6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kn6, java.lang.Enum] */
    static {
        ?? r0 = new Enum("DESTROYED", 0);
        a = r0;
        ?? r1 = new Enum("INITIALIZED", 1);
        b = r1;
        ?? r2 = new Enum("CREATED", 2);
        c = r2;
        ?? r3 = new Enum("STARTED", 3);
        d = r3;
        ?? r4 = new Enum("RESUMED", 4);
        e = r4;
        f = new kn6[]{r0, r1, r2, r3, r4};
    }

    public static kn6 valueOf(String str) {
        return (kn6) Enum.valueOf(kn6.class, str);
    }

    public static kn6[] values() {
        return (kn6[]) f.clone();
    }
}
