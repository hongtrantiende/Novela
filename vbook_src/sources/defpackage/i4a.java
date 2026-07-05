package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i4a  reason: default package */
/* loaded from: classes.dex */
public final class i4a {
    public static final i4a a;
    public static final i4a b;
    public static final /* synthetic */ i4a[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i4a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, i4a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, i4a] */
    static {
        ?? r0 = new Enum("Inherit", 0);
        a = r0;
        ?? r1 = new Enum("SecureOn", 1);
        b = r1;
        c = new i4a[]{r0, r1, new Enum("SecureOff", 2)};
    }

    public static i4a valueOf(String str) {
        return (i4a) Enum.valueOf(i4a.class, str);
    }

    public static i4a[] values() {
        return (i4a[]) c.clone();
    }
}
