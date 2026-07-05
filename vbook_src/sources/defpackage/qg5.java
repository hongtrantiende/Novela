package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qg5  reason: default package */
/* loaded from: classes.dex */
public final class qg5 {
    public static final qg5 a;
    public static final qg5 b;
    public static final qg5 c;
    public static final qg5 d;
    public static final /* synthetic */ qg5[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qg5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, qg5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, qg5] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, qg5] */
    static {
        ?? r0 = new Enum("Get", 0);
        a = r0;
        ?? r1 = new Enum("Post", 1);
        b = r1;
        ?? r2 = new Enum("Put", 2);
        c = r2;
        ?? r3 = new Enum("Delete", 3);
        d = r3;
        e = new qg5[]{r0, r1, r2, r3};
    }

    public static qg5 valueOf(String str) {
        return (qg5) Enum.valueOf(qg5.class, str);
    }

    public static qg5[] values() {
        return (qg5[]) e.clone();
    }
}
