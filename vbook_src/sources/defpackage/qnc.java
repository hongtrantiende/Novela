package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qnc  reason: default package */
/* loaded from: classes.dex */
public final class qnc {
    public static final qnc a;
    public static final qnc b;
    public static final qnc c;
    public static final /* synthetic */ qnc[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qnc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, qnc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, qnc] */
    static {
        ?? r0 = new Enum("ContinueTraversal", 0);
        a = r0;
        ?? r1 = new Enum("SkipSubtreeAndContinueTraversal", 1);
        b = r1;
        ?? r2 = new Enum("CancelTraversal", 2);
        c = r2;
        d = new qnc[]{r0, r1, r2};
    }

    public static qnc valueOf(String str) {
        return (qnc) Enum.valueOf(qnc.class, str);
    }

    public static qnc[] values() {
        return (qnc[]) d.clone();
    }
}
