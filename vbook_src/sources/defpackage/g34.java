package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g34  reason: default package */
/* loaded from: classes3.dex */
public final class g34 {
    public static final g34 a;
    public static final g34 b;
    public static final g34 c;
    public static final /* synthetic */ g34[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g34] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g34] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, g34] */
    static {
        ?? r0 = new Enum("Install", 0);
        a = r0;
        ?? r1 = new Enum("Delete", 1);
        b = r1;
        ?? r2 = new Enum("Update", 2);
        c = r2;
        d = new g34[]{r0, r1, r2};
    }

    public static g34 valueOf(String str) {
        return (g34) Enum.valueOf(g34.class, str);
    }

    public static g34[] values() {
        return (g34[]) d.clone();
    }
}
