package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o39  reason: default package */
/* loaded from: classes.dex */
public abstract class o39 implements i39 {
    public static final k39 a;
    public static final /* synthetic */ o39[] b;

    static {
        k39 k39Var = new k39();
        a = k39Var;
        b = new o39[]{k39Var, new o39() { // from class: l39
            @Override // defpackage.i39
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new o39() { // from class: m39
            @Override // defpackage.i39
            public final boolean apply(Object obj) {
                if (obj == null) {
                    return true;
                }
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new o39() { // from class: n39
            @Override // defpackage.i39
            public final boolean apply(Object obj) {
                if (obj != null) {
                    return true;
                }
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static o39 valueOf(String str) {
        return (o39) Enum.valueOf(o39.class, str);
    }

    public static o39[] values() {
        return (o39[]) b.clone();
    }
}
