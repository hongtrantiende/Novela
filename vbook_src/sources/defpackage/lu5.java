package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lu5  reason: default package */
/* loaded from: classes.dex */
public final class lu5 {
    public static final lu5 a;
    public static final lu5 b;
    public static final lu5 c;
    public static final /* synthetic */ lu5[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, lu5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, lu5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, lu5] */
    static {
        ?? r0 = new Enum("Yes", 0);
        a = r0;
        ?? r1 = new Enum("No", 1);
        b = r1;
        ?? r2 = new Enum("NotInitialized", 2);
        c = r2;
        d = new lu5[]{r0, r1, r2};
    }

    public static lu5 valueOf(String str) {
        return (lu5) Enum.valueOf(lu5.class, str);
    }

    public static lu5[] values() {
        return (lu5[]) d.clone();
    }
}
