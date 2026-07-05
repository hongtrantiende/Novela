package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mf8  reason: default package */
/* loaded from: classes.dex */
public final class mf8 {
    public static final mf8 a;
    public static final mf8 b;
    public static final /* synthetic */ mf8[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, mf8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, mf8] */
    static {
        ?? r0 = new Enum("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        a = r0;
        ?? r1 = new Enum("DROP_WORK_REQUEST", 1);
        b = r1;
        c = new mf8[]{r0, r1};
    }

    public static mf8 valueOf(String str) {
        return (mf8) Enum.valueOf(mf8.class, str);
    }

    public static mf8[] values() {
        return (mf8[]) c.clone();
    }
}
