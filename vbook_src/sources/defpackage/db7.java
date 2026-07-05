package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: db7  reason: default package */
/* loaded from: classes3.dex */
public final class db7 {
    public static final db7 a;
    public static final db7 b;
    public static final db7 c;
    public static final db7 d;
    public static final /* synthetic */ db7[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, db7] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, db7] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, db7] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, db7] */
    static {
        ?? r0 = new Enum("Top", 0);
        a = r0;
        ?? r1 = new Enum("Center", 1);
        b = r1;
        ?? r2 = new Enum("Bottom", 2);
        c = r2;
        ?? r3 = new Enum("Alone", 3);
        d = r3;
        e = new db7[]{r0, r1, r2, r3};
    }

    public static db7 valueOf(String str) {
        return (db7) Enum.valueOf(db7.class, str);
    }

    public static db7[] values() {
        return (db7[]) e.clone();
    }
}
