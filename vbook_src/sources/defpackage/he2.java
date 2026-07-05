package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: he2  reason: default package */
/* loaded from: classes3.dex */
public final class he2 {
    public static final he2 a;
    public static final he2 b;
    public static final he2 c;
    public static final /* synthetic */ he2[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, he2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, he2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, he2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, he2] */
    static {
        ?? r0 = new Enum("None", 0);
        a = r0;
        ?? r1 = new Enum("Cancelled", 1);
        b = r1;
        ?? r2 = new Enum("Redirected", 2);
        c = r2;
        d = new he2[]{r0, r1, r2, new Enum("RedirectCancelled", 3)};
    }

    public static he2 valueOf(String str) {
        return (he2) Enum.valueOf(he2.class, str);
    }

    public static he2[] values() {
        return (he2[]) d.clone();
    }
}
