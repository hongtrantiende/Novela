package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g3a  reason: default package */
/* loaded from: classes3.dex */
public final class g3a {
    public static final g3a a;
    public static final /* synthetic */ g3a[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g3a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g3a] */
    static {
        ?? r0 = new Enum("Always", 0);
        a = r0;
        b = new g3a[]{r0, new Enum("WhenVisible", 1)};
    }

    public static g3a valueOf(String str) {
        return (g3a) Enum.valueOf(g3a.class, str);
    }

    public static g3a[] values() {
        return (g3a[]) b.clone();
    }
}
