package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mfc  reason: default package */
/* loaded from: classes.dex */
public final class mfc {
    public static final mfc a;
    public static final mfc b;
    public static final /* synthetic */ mfc[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, mfc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, mfc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, mfc] */
    static {
        ?? r0 = new Enum("EXACT", 0);
        a = r0;
        ?? r1 = new Enum("NEARER", 1);
        ?? r2 = new Enum("FARTHER", 2);
        b = r2;
        c = new mfc[]{r0, r1, r2};
    }

    public static mfc valueOf(String str) {
        return (mfc) Enum.valueOf(mfc.class, str);
    }

    public static mfc[] values() {
        return (mfc[]) c.clone();
    }
}
