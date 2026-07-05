package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ht8  reason: default package */
/* loaded from: classes3.dex */
public final class ht8 {
    public static final ht8 a;
    public static final ht8 b;
    public static final ht8 c;
    public static final ht8 d;
    public static final ht8 e;
    public static final /* synthetic */ ht8[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ht8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ht8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ht8] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ht8] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, ht8] */
    static {
        ?? r0 = new Enum("VietPhrase", 0);
        a = r0;
        ?? r1 = new Enum("Name", 1);
        b = r1;
        ?? r2 = new Enum("PhienAm", 2);
        c = r2;
        ?? r3 = new Enum("Pronouns", 3);
        d = r3;
        ?? r4 = new Enum("LuatNhan", 4);
        e = r4;
        f = new ht8[]{r0, r1, r2, r3, r4};
    }

    public static ht8 valueOf(String str) {
        return (ht8) Enum.valueOf(ht8.class, str);
    }

    public static ht8[] values() {
        return (ht8[]) f.clone();
    }
}
