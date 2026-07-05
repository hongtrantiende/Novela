package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e19  reason: default package */
/* loaded from: classes.dex */
public final class e19 {
    public static final e19 a;
    public static final e19 b;
    public static final e19 c;
    public static final /* synthetic */ e19[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e19] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e19] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, e19] */
    static {
        ?? r0 = new Enum("Unknown", 0);
        a = r0;
        ?? r1 = new Enum("Dispatching", 1);
        b = r1;
        ?? r2 = new Enum("NotDispatching", 2);
        c = r2;
        d = new e19[]{r0, r1, r2};
    }

    public static e19 valueOf(String str) {
        return (e19) Enum.valueOf(e19.class, str);
    }

    public static e19[] values() {
        return (e19[]) d.clone();
    }
}
