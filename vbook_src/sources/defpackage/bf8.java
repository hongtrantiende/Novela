package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bf8  reason: default package */
/* loaded from: classes3.dex */
public final class bf8 {
    public static final bf8 a;
    public static final bf8 b;
    public static final bf8 c;
    public static final /* synthetic */ bf8[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, bf8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, bf8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, bf8] */
    static {
        ?? r0 = new Enum("Decimal", 0);
        a = r0;
        ?? r1 = new Enum("LowerAlpha", 1);
        b = r1;
        ?? r2 = new Enum("LowerRoman", 2);
        c = r2;
        d = new bf8[]{r0, r1, r2};
    }

    public static bf8 valueOf(String str) {
        return (bf8) Enum.valueOf(bf8.class, str);
    }

    public static bf8[] values() {
        return (bf8[]) d.clone();
    }
}
