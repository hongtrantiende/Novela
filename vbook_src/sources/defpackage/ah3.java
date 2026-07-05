package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ah3  reason: default package */
/* loaded from: classes.dex */
public final class ah3 {
    public static final ah3 a;
    public static final ah3 b;
    public static final ah3 c;
    public static final /* synthetic */ ah3[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ah3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ah3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ah3] */
    static {
        ?? r0 = new Enum("Start", 0);
        a = r0;
        ?? r1 = new Enum("Center", 1);
        b = r1;
        ?? r2 = new Enum("End", 2);
        c = r2;
        d = new ah3[]{r0, r1, r2};
    }

    public static ah3 valueOf(String str) {
        return (ah3) Enum.valueOf(ah3.class, str);
    }

    public static ah3[] values() {
        return (ah3[]) d.clone();
    }
}
