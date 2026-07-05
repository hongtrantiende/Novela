package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jo8  reason: default package */
/* loaded from: classes.dex */
public final class jo8 {
    public static final jo8 C;
    public static final /* synthetic */ jo8[] D;
    public static final jo8 a;
    public static final jo8 b;
    public static final jo8 c;
    public static final jo8 d;
    public static final jo8 e;
    public static final jo8 f;

    /* JADX WARN: Type inference failed for: r0v0, types: [jo8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [jo8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [jo8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [jo8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [jo8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [jo8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [jo8, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Move", 0);
        a = r0;
        ?? r1 = new Enum("Line", 1);
        b = r1;
        ?? r2 = new Enum("Quadratic", 2);
        c = r2;
        ?? r3 = new Enum("Conic", 3);
        d = r3;
        ?? r4 = new Enum("Cubic", 4);
        e = r4;
        ?? r5 = new Enum("Close", 5);
        f = r5;
        ?? r6 = new Enum("Done", 6);
        C = r6;
        D = new jo8[]{r0, r1, r2, r3, r4, r5, r6};
    }

    public static jo8 valueOf(String str) {
        return (jo8) Enum.valueOf(jo8.class, str);
    }

    public static jo8[] values() {
        return (jo8[]) D.clone();
    }
}
