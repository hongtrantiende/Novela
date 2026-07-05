package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jd2  reason: default package */
/* loaded from: classes.dex */
public final class jd2 {
    public static final jd2 a;
    public static final jd2 b;
    public static final jd2 c;
    public static final /* synthetic */ jd2[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jd2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, jd2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, jd2] */
    static {
        ?? r0 = new Enum("CROSSED", 0);
        a = r0;
        ?? r1 = new Enum("NOT_CROSSED", 1);
        b = r1;
        ?? r2 = new Enum("COLLAPSED", 2);
        c = r2;
        d = new jd2[]{r0, r1, r2};
    }

    public static jd2 valueOf(String str) {
        return (jd2) Enum.valueOf(jd2.class, str);
    }

    public static jd2[] values() {
        return (jd2[]) d.clone();
    }
}
