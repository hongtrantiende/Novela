package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sy3  reason: default package */
/* loaded from: classes.dex */
public final class sy3 {
    public static final sy3 a;
    public static final sy3 b;
    public static final sy3 c;
    public static final /* synthetic */ sy3[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, sy3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, sy3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, sy3] */
    static {
        ?? r0 = new Enum("NOT_RUN", 0);
        a = r0;
        ?? r1 = new Enum("CANCELLED", 1);
        b = r1;
        ?? r2 = new Enum("STARTED", 2);
        c = r2;
        d = new sy3[]{r0, r1, r2};
    }

    public static sy3 valueOf(String str) {
        return (sy3) Enum.valueOf(sy3.class, str);
    }

    public static sy3[] values() {
        return (sy3[]) d.clone();
    }
}
