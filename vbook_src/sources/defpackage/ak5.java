package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ak5  reason: default package */
/* loaded from: classes.dex */
public final class ak5 {
    public static final /* synthetic */ ak5[] C;
    public static final ak5 a;
    public static final ak5 b;
    public static final ak5 c;
    public static final ak5 d;
    public static final ak5 e;
    public static final ak5 f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ak5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ak5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ak5] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ak5] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, ak5] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, ak5] */
    static {
        ?? r0 = new Enum("PARAGRAPH", 0);
        a = r0;
        ?? r1 = new Enum("TABLE", 1);
        b = r1;
        ?? r2 = new Enum("HEADING", 2);
        c = r2;
        ?? r3 = new Enum("LIST", 3);
        d = r3;
        ?? r4 = new Enum("IMAGE", 4);
        e = r4;
        ?? r5 = new Enum("SEPARATOR", 5);
        f = r5;
        C = new ak5[]{r0, r1, r2, r3, r4, r5};
    }

    public static ak5 valueOf(String str) {
        return (ak5) Enum.valueOf(ak5.class, str);
    }

    public static ak5[] values() {
        return (ak5[]) C.clone();
    }
}
