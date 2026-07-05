package j$.time.format;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class q implements e {
    public static final q INSENSITIVE;
    public static final q LENIENT;
    public static final q SENSITIVE;
    public static final q STRICT;
    public static final /* synthetic */ q[] a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j$.time.format.q] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j$.time.format.q] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j$.time.format.q] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, j$.time.format.q] */
    static {
        ?? r0 = new Enum("SENSITIVE", 0);
        SENSITIVE = r0;
        ?? r1 = new Enum("INSENSITIVE", 1);
        INSENSITIVE = r1;
        ?? r2 = new Enum("STRICT", 2);
        STRICT = r2;
        ?? r3 = new Enum("LENIENT", 3);
        LENIENT = r3;
        a = new q[]{r0, r1, r2, r3};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) a.clone();
    }

    @Override // j$.time.format.e
    public final int A(v vVar, CharSequence charSequence, int i) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return i;
                    }
                    vVar.c = false;
                    return i;
                }
                vVar.c = true;
                return i;
            }
            vVar.b = false;
            return i;
        }
        vVar.b = true;
        return i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return "ParseStrict(false)";
                    }
                    throw new IllegalStateException("Unreachable");
                }
                return "ParseStrict(true)";
            }
            return "ParseCaseSensitive(false)";
        }
        return "ParseCaseSensitive(true)";
    }

    @Override // j$.time.format.e
    public final boolean v(x xVar, StringBuilder sb) {
        return true;
    }
}
