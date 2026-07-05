package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cs9  reason: default package */
/* loaded from: classes.dex */
public final class cs9 {
    public static final cs9 a;
    public static final cs9 b;
    public static final cs9 c;
    public static final /* synthetic */ cs9[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, cs9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, cs9] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, cs9] */
    static {
        ?? r0 = new Enum("Replace", 0);
        a = r0;
        ?? r1 = new Enum("Merge", 1);
        b = r1;
        ?? r2 = new Enum("Missing", 2);
        c = r2;
        d = new cs9[]{r0, r1, r2};
    }

    public static cs9 valueOf(String str) {
        return (cs9) Enum.valueOf(cs9.class, str);
    }

    public static cs9[] values() {
        return (cs9[]) d.clone();
    }
}
