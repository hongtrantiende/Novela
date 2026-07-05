package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o09  reason: default package */
/* loaded from: classes3.dex */
public final class o09 {
    public static final d38 a;
    public static final /* synthetic */ o09[] b;
    public static final /* synthetic */ qu3 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, o09] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, o09] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, o09] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, o09] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, o09] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, o09] */
    static {
        o09[] o09VarArr = {new Enum("ZERO", 0), new Enum("ONE", 1), new Enum("TWO", 2), new Enum("FEW", 3), new Enum("MANY", 4), new Enum("OTHER", 5)};
        b = o09VarArr;
        c = new qu3(o09VarArr);
        a = new d38(1);
    }

    public static o09 valueOf(String str) {
        return (o09) Enum.valueOf(o09.class, str);
    }

    public static o09[] values() {
        return (o09[]) b.clone();
    }
}
