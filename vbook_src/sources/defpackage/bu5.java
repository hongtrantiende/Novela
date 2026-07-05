package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bu5  reason: default package */
/* loaded from: classes.dex */
public final class bu5 {
    public static final bu5 a;
    public static final bu5 b;
    public static final bu5 c;
    public static final bu5 d;
    public static final /* synthetic */ bu5[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [bu5, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bu5, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bu5, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [bu5, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Untransformed", 0);
        a = r0;
        ?? r1 = new Enum("Insertion", 1);
        b = r1;
        ?? r2 = new Enum("Replacement", 2);
        c = r2;
        ?? r3 = new Enum("Deletion", 3);
        d = r3;
        e = new bu5[]{r0, r1, r2, r3};
    }

    public static bu5 valueOf(String str) {
        return (bu5) Enum.valueOf(bu5.class, str);
    }

    public static bu5[] values() {
        return (bu5[]) e.clone();
    }
}
