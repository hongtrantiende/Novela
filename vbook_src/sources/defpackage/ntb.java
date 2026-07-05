package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ntb  reason: default package */
/* loaded from: classes.dex */
public final class ntb {
    public static final ntb a;
    public static final ntb b;
    public static final ntb c;
    public static final /* synthetic */ ntb[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ntb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ntb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ntb] */
    static {
        ?? r0 = new Enum("None", 0);
        a = r0;
        ?? r1 = new Enum("Touch", 1);
        b = r1;
        ?? r2 = new Enum("Mouse", 2);
        c = r2;
        d = new ntb[]{r0, r1, r2};
    }

    public static ntb valueOf(String str) {
        return (ntb) Enum.valueOf(ntb.class, str);
    }

    public static ntb[] values() {
        return (ntb[]) d.clone();
    }
}
