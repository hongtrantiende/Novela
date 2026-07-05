package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dn4  reason: default package */
/* loaded from: classes.dex */
public final class dn4 {
    public static final dn4 a;
    public static final dn4 b;
    public static final dn4 c;
    public static final /* synthetic */ dn4[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, dn4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, dn4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, dn4] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, dn4] */
    static {
        ?? r0 = new Enum("Active", 0);
        a = r0;
        ?? r1 = new Enum("ActiveParent", 1);
        b = r1;
        ?? r2 = new Enum("Captured", 2);
        ?? r3 = new Enum("Inactive", 3);
        c = r3;
        d = new dn4[]{r0, r1, r2, r3};
    }

    public static dn4 valueOf(String str) {
        return (dn4) Enum.valueOf(dn4.class, str);
    }

    public static dn4[] values() {
        return (dn4[]) d.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        xk5.o();
        return false;
    }

    public final boolean b() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        xk5.o();
                        return false;
                    }
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
