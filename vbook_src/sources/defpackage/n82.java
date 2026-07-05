package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n82  reason: default package */
/* loaded from: classes3.dex */
public final class n82 {
    public static final n82 a;
    public static final n82 b;
    public static final n82 c;
    public static final /* synthetic */ n82[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, n82] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, n82] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, n82] */
    static {
        ?? r0 = new Enum("COROUTINE_SUSPENDED", 0);
        a = r0;
        ?? r1 = new Enum("UNDECIDED", 1);
        b = r1;
        ?? r2 = new Enum("RESUMED", 2);
        c = r2;
        d = new n82[]{r0, r1, r2};
    }

    public static n82 valueOf(String str) {
        return (n82) Enum.valueOf(n82.class, str);
    }

    public static n82[] values() {
        return (n82[]) d.clone();
    }
}
