package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tr  reason: default package */
/* loaded from: classes.dex */
public final class tr {
    public static final tr a;
    public static final tr b;
    public static final /* synthetic */ tr[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, tr] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, tr] */
    static {
        ?? r0 = new Enum("BoundReached", 0);
        a = r0;
        ?? r1 = new Enum("Finished", 1);
        b = r1;
        c = new tr[]{r0, r1};
    }

    public static tr valueOf(String str) {
        return (tr) Enum.valueOf(tr.class, str);
    }

    public static tr[] values() {
        return (tr[]) c.clone();
    }
}
