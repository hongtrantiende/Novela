package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kz3  reason: default package */
/* loaded from: classes.dex */
public final class kz3 {
    public static final kz3 a;
    public static final kz3 b;
    public static final kz3 c;
    public static final kz3 d;
    public static final /* synthetic */ kz3[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kz3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kz3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, kz3] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, kz3] */
    static {
        ?? r0 = new Enum("REPLACE", 0);
        a = r0;
        ?? r1 = new Enum("KEEP", 1);
        b = r1;
        ?? r2 = new Enum("APPEND", 2);
        c = r2;
        ?? r3 = new Enum("APPEND_OR_REPLACE", 3);
        d = r3;
        e = new kz3[]{r0, r1, r2, r3};
    }

    public static kz3 valueOf(String str) {
        return (kz3) Enum.valueOf(kz3.class, str);
    }

    public static kz3[] values() {
        return (kz3[]) e.clone();
    }
}
