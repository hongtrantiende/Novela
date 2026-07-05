package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ct5  reason: default package */
/* loaded from: classes3.dex */
public final class ct5 {
    public static final /* synthetic */ ct5[] C;
    public static final ct5 a;
    public static final ct5 b;
    public static final ct5 c;
    public static final ct5 d;
    public static final ct5 e;
    public static final ct5 f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ct5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ct5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ct5] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ct5] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, ct5] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, ct5] */
    static {
        ?? r0 = new Enum("Preparing", 0);
        a = r0;
        ?? r1 = new Enum("Downloading", 1);
        b = r1;
        ?? r2 = new Enum("Unzipping", 2);
        c = r2;
        ?? r3 = new Enum("Importing", 3);
        d = r3;
        ?? r4 = new Enum("Cleaning", 4);
        e = r4;
        ?? r5 = new Enum("Completed", 5);
        f = r5;
        C = new ct5[]{r0, r1, r2, r3, r4, r5};
    }

    public static ct5 valueOf(String str) {
        return (ct5) Enum.valueOf(ct5.class, str);
    }

    public static ct5[] values() {
        return (ct5[]) C.clone();
    }
}
