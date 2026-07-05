package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cd6  reason: default package */
/* loaded from: classes3.dex */
public final class cd6 {
    public static final cd6 a;
    public static final cd6 b;
    public static final /* synthetic */ cd6[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, cd6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, cd6] */
    static {
        ?? r0 = new Enum("Continuous", 0);
        a = r0;
        ?? r1 = new Enum("Pager", 1);
        b = r1;
        c = new cd6[]{r0, r1};
    }

    public static cd6 valueOf(String str) {
        return (cd6) Enum.valueOf(cd6.class, str);
    }

    public static cd6[] values() {
        return (cd6[]) c.clone();
    }

    public final boolean a() {
        if (this == b) {
            return true;
        }
        return false;
    }
}
