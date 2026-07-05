package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eu9  reason: default package */
/* loaded from: classes.dex */
public final class eu9 {
    public static final eu9 a;
    public static final eu9 b;
    public static final eu9 c;
    public static final /* synthetic */ eu9[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eu9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eu9] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, eu9] */
    static {
        ?? r0 = new Enum("AUTOMATIC", 0);
        a = r0;
        ?? r1 = new Enum("TRUNCATE", 1);
        b = r1;
        ?? r2 = new Enum("WRITE_AHEAD_LOGGING", 2);
        c = r2;
        d = new eu9[]{r0, r1, r2};
    }

    public static eu9 valueOf(String str) {
        return (eu9) Enum.valueOf(eu9.class, str);
    }

    public static eu9[] values() {
        return (eu9[]) d.clone();
    }
}
