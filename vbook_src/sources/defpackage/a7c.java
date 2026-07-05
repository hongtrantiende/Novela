package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a7c  reason: default package */
/* loaded from: classes3.dex */
public abstract class a7c {
    public static final lie a = new lie(5, "NO_THREAD_ELEMENTS", false);
    public static final tsa b = new tsa(12, (byte) 0);
    public static final tsa c = new tsa(13, (byte) 0);
    public static final tsa d = new tsa(14, (byte) 0);

    public static final void a(d82 d82Var, Object obj) {
        if (obj != a) {
            if (obj instanceof g7c) {
                g7c g7cVar = (g7c) obj;
                z6c[] z6cVarArr = g7cVar.c;
                int length = z6cVarArr.length - 1;
                if (length < 0) {
                    return;
                }
                while (true) {
                    int i = length - 1;
                    z6c z6cVar = z6cVarArr[length];
                    z6cVar.getClass();
                    z6cVar.N0(g7cVar.b[length]);
                    if (i >= 0) {
                        length = i;
                    } else {
                        return;
                    }
                }
            } else {
                Object fold = d82Var.fold(null, c);
                fold.getClass();
                ((z6c) fold).N0(obj);
            }
        }
    }

    public static final Object b(d82 d82Var) {
        Object fold = d82Var.fold(0, b);
        fold.getClass();
        return fold;
    }

    public static final Object c(d82 d82Var, Object obj) {
        if (obj == null) {
            obj = b(d82Var);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return d82Var.fold(new g7c(((Number) obj).intValue(), d82Var), d);
        }
        return ((z6c) obj).p0();
    }
}
