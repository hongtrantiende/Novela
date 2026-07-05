package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qpb  reason: default package */
/* loaded from: classes.dex */
public final class qpb {
    public static final qpb a;
    public static final qpb b;
    public static final qpb c;
    public static final /* synthetic */ qpb[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [qpb, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [qpb, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [qpb, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Insert", 0);
        a = r0;
        ?? r1 = new Enum("Delete", 1);
        b = r1;
        ?? r2 = new Enum("Replace", 2);
        c = r2;
        d = new qpb[]{r0, r1, r2};
    }

    public static qpb valueOf(String str) {
        return (qpb) Enum.valueOf(qpb.class, str);
    }

    public static qpb[] values() {
        return (qpb[]) d.clone();
    }
}
