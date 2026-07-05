package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yx5  reason: default package */
/* loaded from: classes3.dex */
public abstract class yx5 {
    public final yj0 a;

    public yx5(yj0 yj0Var) {
        this.a = yj0Var;
    }

    public Object a(bm1 bm1Var) {
        Iterable iterable;
        yj0 yj0Var = this.a;
        yj0Var.toString();
        ((zj1) bm1Var.b).getClass();
        ul6 ul6Var = ul6.e;
        ul6Var.compareTo(ul6.a);
        try {
            wl8 wl8Var = (wl8) bm1Var.f;
            if (wl8Var == null) {
                wl8Var = new wl8(3, null);
            }
            return yj0Var.c.invoke((q0a) bm1Var.c, wl8Var);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(e);
            sb.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            stackTrace.getClass();
            int i = 0;
            while (i < stackTrace.length) {
                String className = stackTrace[i].getClassName();
                className.getClass();
                if (k4b.V(className, "sun.reflect", false)) {
                    break;
                }
                i++;
            }
            if (i != 0) {
                if (i != 1) {
                    iterable = Arrays.asList(b00.e0(stackTrace, 0, i));
                    iterable.getClass();
                } else {
                    iterable = tl1.A(stackTrace[0]);
                }
            } else {
                iterable = ks3.a;
            }
            sb.append(sl1.i0(iterable, "\n\t", null, null, null, 62));
            yj0Var.toString();
            ul6Var.compareTo(ul6.d);
            throw new e60(13, "Could not create instance for '" + yj0Var + '\'', e);
        }
    }

    public abstract Object b(bm1 bm1Var);
}
