package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qm  reason: default package */
/* loaded from: classes.dex */
public final class qm {
    public static final qm a;
    public static final qm b;
    public static final qm c;
    public static final /* synthetic */ qm[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qm] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, qm] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, qm] */
    static {
        ?? r0 = new Enum("ALL", 0);
        a = r0;
        ?? r1 = new Enum("STATUS_BARS", 1);
        b = r1;
        ?? r2 = new Enum("NAVIGATION_BARS", 2);
        c = r2;
        d = new qm[]{r0, r1, r2};
    }

    public static qm valueOf(String str) {
        return (qm) Enum.valueOf(qm.class, str);
    }

    public static qm[] values() {
        return (qm[]) d.clone();
    }
}
